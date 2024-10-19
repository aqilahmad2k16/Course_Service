package com.course.courseservice.courseservice.dtos.requestdtos;

import com.course.courseservice.courseservice.models.Category;
import com.course.courseservice.courseservice.models.Course;
import com.course.courseservice.courseservice.models.Module;
import lombok.Data;

@Data
public class ModuleRequestDto {
    private String name;
    private String description;
    private Long courseId;
    private String percentageOfCompletion;

    public static Module to(ModuleRequestDto moduleRequestDto, Course course) {
        Module module = new Module();
        module.setName(moduleRequestDto.getName());
        module.setDescription((moduleRequestDto.getDescription()));
        module.setPercentageOfCompletion(moduleRequestDto.getPercentageOfCompletion());
        module.setCourse(course);
        return module;
    }
}
