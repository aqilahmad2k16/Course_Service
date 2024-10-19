package com.course.courseservice.courseservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Module extends BaseModel{
    private String name;
    private String description;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "course_id")
    private Course course;
    private String percentageOfCompletion;
//    @OneToMany(mappedBy = "module", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Session> sessions;
}
