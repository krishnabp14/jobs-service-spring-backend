package com.krishnadev.jobbackend.JobApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {

    private JobService JobService;

    public JobController(JobService jobService) {
        JobService = jobService;
    }

    @GetMapping("/jobs")
    public List<Job> findAllJobs() {
        return JobService.findAllJobs();
    }

    @PostMapping("/jobs")
    public String addJob(@RequestBody Job job) {
        JobService.addJob(job);
        return "Job Added Sucessfully";
    }
}
