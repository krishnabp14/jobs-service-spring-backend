package com.krishnadev.jobbackend.JobApplication;

import jakarta.persistence.*;

@Entity
// @Table(name="job_table")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // This is the primary key
    private String title;
    private String description;
    private String minSalary;
    private String maxSalary;

    // Default Constructor - This is needed because entities are objects, that represents the persistent data in relational database.
    // TODO: WHY DEFAULT CONSTRUCTOR IS NEEDED WHEN WE ARE USING JPA
    public Job() {
    }

    public Job(String description, Long id, String title, String minSalary, String maxSalary) {
        this.description = description;
        this.id = id;
        this.title = title;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(String minSalary) {
        this.minSalary = minSalary;
    }

    public String getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(String maxSalary) {
        this.maxSalary = maxSalary;
    }
}
