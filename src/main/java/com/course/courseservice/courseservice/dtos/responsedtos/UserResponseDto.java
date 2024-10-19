package com.course.courseservice.courseservice.dtos.responsedtos;

import com.course.courseservice.courseservice.models.Dashboard;
import com.course.courseservice.courseservice.models.Payment;
import com.course.courseservice.courseservice.models.ProgressReport;
import com.course.courseservice.courseservice.models.UserTypes;
import lombok.Data;

@Data
public class UserResponseDto {
    private String name;
    private String phoneNumber;
    private String email;
    private String password;
    private UserTypes userTypes;
    private Dashboard dashboard;
    private ProgressReport progressreport;
    private Payment payment;
}
