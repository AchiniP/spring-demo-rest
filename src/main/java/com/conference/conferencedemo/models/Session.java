package com.conference.conferencedemo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity(name = "sessions")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})
public class Session {
    @Column(columnDefinition = "session_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sessionId;
    @Column(columnDefinition = "session_name")
    private String sessionName;
    @Column(columnDefinition = "session_description")
    private  String sessionDescription;
    @Column(columnDefinition = "session_definition")
    private Integer sessionLength;
    @ManyToMany
    @JoinTable(
            name = "session_speakers",
            joinColumns = @JoinColumn(name = "session_id"),
            inverseJoinColumns = @JoinColumn(name = "speaker_id")
    )
    private List<Speaker> speakers;

    public Session() {

    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public String getSessionDescription() {
        return sessionDescription;
    }

    public void setSessionDescription(String sessionDescription) {
        this.sessionDescription = sessionDescription;
    }

    public Integer getSessionLength() {
        return sessionLength;
    }

    public void setSessionLength(Integer sessionLength) {
        this.sessionLength = sessionLength;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}
