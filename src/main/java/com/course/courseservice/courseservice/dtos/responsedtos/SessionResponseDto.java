package com.course.courseservice.courseservice.dtos.responsedtos;

import com.course.courseservice.courseservice.models.Session;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SessionResponseDto {
    private String name;
    private String description;
    private Long moduleId;
    private String mediaSrc;
    private String notesSrc;
    private String assignmentSrc;
    private String durationOfSession;

    public static List<SessionResponseDto> from(List<Session> sessions) {
        List<SessionResponseDto> response = sessions.stream()
                .map(session -> new SessionResponseDto(session.getName(),
                        session.getDescription(),
                        session.getModule().getId(),
                        session.getMediaSrc(),
                        session.getNotesSrc(),
                        session.getAssignmentSrc(),
                        session.getDurationOfSession()))
                .toList();
        return response;
    }
}
