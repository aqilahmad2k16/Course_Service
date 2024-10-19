package com.course.courseservice.courseservice.services.implentationserviceclass;

import com.course.courseservice.courseservice.dtos.requestdtos.CourseRequestDto;
import com.course.courseservice.courseservice.dtos.requestdtos.ModuleRequestDto;
import com.course.courseservice.courseservice.exceptions.customexception.CourseNotFoundException;
import com.course.courseservice.courseservice.exceptions.customexception.ModuleNotFoundException;
import com.course.courseservice.courseservice.models.Course;
import com.course.courseservice.courseservice.models.Module;
import com.course.courseservice.courseservice.repositories.CourseRepository;
import com.course.courseservice.courseservice.repositories.ModuleRepository;
import com.course.courseservice.courseservice.services.services.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleImplService implements ModuleService {
    @Autowired
    private ModuleRepository moduleRepo;

    @Autowired
    private CourseRepository courseRepo;
    @Override
    public Module addModuleToCourse(ModuleRequestDto moduleDto) {
        Course course = courseRepo.findById(moduleDto.getCourseId()).orElseThrow(() ->
                new CourseNotFoundException("Course does not exist with id: " + moduleDto.getCourseId()));
        Module module = ModuleRequestDto.to(moduleDto, course);
        Module savedModule = moduleRepo.save(module);
        if(savedModule == null){
            new ModuleNotFoundException("Module not found");
        }
        return savedModule;
    }
}
