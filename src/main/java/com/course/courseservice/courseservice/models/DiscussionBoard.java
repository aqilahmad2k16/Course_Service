package com.course.courseservice.courseservice.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class DiscussionBoard extends BaseModel{
//    @OneToMany(mappedBy = "discussionboard", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Post> posts;
}
