package com.krishnadev.jobbackend.JobApplication;

import java.util.List;

public interface JobService {
    List<Job> findAllJobs();
    void addJob(Job job);
}
