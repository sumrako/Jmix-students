package com.company.jmixpractice.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "EVENT")
@Entity
public class Event {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "FORMAT", nullable = false)
    @NotNull
    private String format;

    @InstanceName
    @Column(name = "DESCRIPTION", nullable = false, length = 511)
    @NotNull
    private String description;

    @Column(name = "START_DATE_TIME", nullable = false)
    @NotNull
    private LocalDateTime startDateTime;

    @Column(name = "END_DATE_TIME", nullable = false)
    @NotNull
    private LocalDateTime endDateTime;

    @JoinTable(name = "EVENT_STUDENT_LINK",
            joinColumns = @JoinColumn(name = "EVENT_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "STUDENT_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Format getFormat() {
        return format == null ? null : Format.fromId(format);
    }

    public void setFormat(Format format) {
        this.format = format == null ? null : format.getId();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}