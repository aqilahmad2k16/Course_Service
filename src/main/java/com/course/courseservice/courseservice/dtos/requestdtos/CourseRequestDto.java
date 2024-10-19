package com.course.courseservice.courseservice.dtos.requestdtos;

import com.course.courseservice.courseservice.models.Category;
import com.course.courseservice.courseservice.models.Course;
import com.course.courseservice.courseservice.models.Module;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CourseRequestDto {
    @NotBlank(message = "Course name can not be empty")
    @Size(max = 100, message = "Course name can not be exceed 100 characters")
    private String name;
    @NotBlank(message = "author name can not be empty! It must be some value")
    private String author;
    private String ratings;
    private String description;
    private String duration;
    private Category category;
    public static Course to(CourseRequestDto courseRequestDto) {
        Course course = new Course(
                courseRequestDto.getName(),
                courseRequestDto.getAuthor(),
                courseRequestDto.getRatings(),
                courseRequestDto.getDescription(),
                courseRequestDto.getDuration(),
                new Category(courseRequestDto.getCategory().getName())
        );
        return course;
    }
}
