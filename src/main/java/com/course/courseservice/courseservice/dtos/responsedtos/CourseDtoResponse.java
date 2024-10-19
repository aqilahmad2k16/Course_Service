package com.course.courseservice.courseservice.dtos.responsedtos;

import com.course.courseservice.courseservice.models.Category;
import com.course.courseservice.courseservice.models.Course;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CourseDtoResponse {
    private Long Id;
    private String name;
    private String author;
    private String ratings;
    private String description;
    private String duration;
    private Category category;
    public static CourseDtoResponse from(Course savedCourse) {
        CourseDtoResponse response = new CourseDtoResponse();
        response.setName(savedCourse.getName());
        response.setAuthor(savedCourse.getAuthor());
//        response.setModules(savedCourse.getModules()); //for this, I will have to create list of modules object an set it here
        Category category = new Category();
        category.setName(savedCourse.getCategory().getName());
        category.setId(savedCourse.getCategory().getId());
        category.setCreatedAt(savedCourse.getCreatedAt());
        category.setUpdatedAt(savedCourse.getUpdatedAt());
        response.setCategory(category);
        response.setDuration(savedCourse.getDuration());
        response.setDescription(savedCourse.getDescription());
        response.setRatings(savedCourse.getRatings());
        response.setId(savedCourse.getId());
        return response;
    }

    public static List<CourseDtoResponse> getListFrom(List<Course> courses) {
        List<CourseDtoResponse> responses = new ArrayList<>();
        courses.forEach(course -> {
           responses.add(CourseDtoResponse.from(course));
        });

        return responses;
    }
}
