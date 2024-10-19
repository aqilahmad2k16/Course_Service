package com.course.courseservice.courseservice.services.services;

import com.course.courseservice.courseservice.dtos.requestdtos.ModuleRequestDto;
import com.course.courseservice.courseservice.models.Module;

public interface ModuleService {
    Module addModuleToCourse(ModuleRequestDto moduleDto);
}
