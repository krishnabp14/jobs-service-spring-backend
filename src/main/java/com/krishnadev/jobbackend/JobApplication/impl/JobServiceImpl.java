package com.krishnadev.jobbackend.JobApplication.impl;

import com.krishnadev.jobbackend.JobApplication.Job;
import com.krishnadev.jobbackend.JobApplication.JobRepository;
import com.krishnadev.jobbackend.JobApplication.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    // private List<Job> jobList = new ArrayList<>();
    JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Job> findAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public void addJob(Job job) {
        jobRepository.save(job);
    }

    @Override
    public Job getJobById(Long id) {
        /* for(Job job: jobList) {
            if(job.getId().equals(id)) {
                return job;
            }
        } */

        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public String deleteJobById(Long id) {
        /*
        for(Job job: jobList) {
            if(job.getId().equals(id)) {
                jobList.remove(job);
                return "true";
            }
        }

        System.out.println(jobList);
        return "false";
        */

        try {
            jobRepository.deleteById(id);
            return "true";
        } catch(Exception e){
            return "false";
        }

    }
}
