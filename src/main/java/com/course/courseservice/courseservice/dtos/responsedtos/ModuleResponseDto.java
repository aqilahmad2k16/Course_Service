package com.course.courseservice.courseservice.dtos.responsedtos;

import com.course.courseservice.courseservice.models.Category;
import com.course.courseservice.courseservice.models.Course;
import com.course.courseservice.courseservice.models.Module;
import com.course.courseservice.courseservice.models.Session;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModuleResponseDto {
    private String name;
    private String description;
    private Course course;
    private String percentageOfCompletion;
    public static ModuleResponseDto from(Module module) {
        ModuleResponseDto response = new ModuleResponseDto();
        response.setName(module.getName());
        response.setDescription((module.getDescription()));
        response.setPercentageOfCompletion(module.getPercentageOfCompletion());
        Course course = new Course();
        course.setName(module.getCourse().getName());
        course.setDescription(module.getCourse().getDescription());
        course.setAuthor(module.getCourse().getAuthor());
        course.setRatings(module.getCourse().getRatings());
        course.setDuration(module.getCourse().getDuration());
        Category cat = new Category();
        cat.setName(module.getCourse().getCategory().getName());
        course.setCategory(cat);
        response.setCourse(course);
        return response;
    }
}
