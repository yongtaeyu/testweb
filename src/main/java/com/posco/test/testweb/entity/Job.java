package com.posco.test.testweb.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "JOB")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(name = "JOB_NAME")
    public String jobname;

    @Column(name = "JOB_PATTERN")
    public String patterns;

    @Column(name = "JSON_TEXT", columnDefinition="BLOB")
    public String jsontext;

    @Column(name = "REG_DATE")
    public LocalDateTime regdt;
}
