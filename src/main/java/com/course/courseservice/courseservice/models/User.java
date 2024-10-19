package com.course.courseservice.courseservice.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class User extends BaseModel{
    private String name;
    private String phoneNumber;
    private String email;
    private String password;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "dashboard_id", referencedColumnName = "id")
    private Dashboard dashboard;
    private UserTypes userTypes;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "progressreport_id", referencedColumnName = "id")
    private ProgressReport progressreport;
    @OneToOne(mappedBy = "user")
    private Payment payment;
    private Boolean isEmailVerified;
}
