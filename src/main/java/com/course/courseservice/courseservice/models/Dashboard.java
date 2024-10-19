package com.course.courseservice.courseservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Dashboard extends BaseModel{
    @OneToOne(mappedBy = "dashboard")
    private User user;
}
