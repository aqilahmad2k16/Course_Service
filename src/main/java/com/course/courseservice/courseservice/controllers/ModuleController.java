package com.course.courseservice.courseservice.controllers;

import com.course.courseservice.courseservice.dtos.requestdtos.ModuleRequestDto;
import com.course.courseservice.courseservice.dtos.responsedtos.ModuleResponseDto;
import com.course.courseservice.courseservice.models.Module;
import com.course.courseservice.courseservice.services.services.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/modules")
public class ModuleController {
    @Autowired
    private ModuleService moduleService;
    /*
    PostMapping("/module")
     */
    @PostMapping("/")
    public ResponseEntity<ModuleResponseDto> addModuleToCourse(@RequestBody ModuleRequestDto moduleRequestDto){
        Module module = moduleService.addModuleToCourse(moduleRequestDto);
        ModuleResponseDto response = ModuleResponseDto.from(module);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
