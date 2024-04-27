package com.krishnadev.jobbackend.JobApplication.impl;

import com.krishnadev.jobbackend.JobApplication.Job;
import com.krishnadev.jobbackend.JobApplication.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    private List<Job> jobList = new ArrayList<>();
    @Override
    public List<Job> findAllJobs() {
        return jobList;
    }

    @Override
    public void addJob(Job job) {
        jobList.add(job);
    }

    @Override
    public Job getJobById(Long id) {
        for(Job job: jobList) {
            if(job.getId().equals(id)) {
                return job;
            }
        }

        return null;
    }
}
