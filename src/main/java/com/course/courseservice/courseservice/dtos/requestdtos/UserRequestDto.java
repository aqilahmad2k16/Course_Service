package com.course.courseservice.courseservice.dtos.requestdtos;

import com.course.courseservice.courseservice.models.Dashboard;
import com.course.courseservice.courseservice.models.Payment;
import com.course.courseservice.courseservice.models.ProgressReport;
import com.course.courseservice.courseservice.models.UserTypes;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class UserRequestDto {
    private String name;
    private String phoneNumber;
    private String emailId;
    private String password;
    private UserTypes userTypes;
    private Dashboard dashboard;
    private ProgressReport progressreport;
    private Payment payment;
}
