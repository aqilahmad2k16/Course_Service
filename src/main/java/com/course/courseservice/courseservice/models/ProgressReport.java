package com.course.courseservice.courseservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class ProgressReport extends BaseModel{
    private String courseCompletion;
    private Integer numberOfCertificates;
    private Integer numberOfSticks;
    private String percentageOfAttandence;
    @OneToOne(mappedBy = "progressreport")
    private User user;
}
