package com.krishnadev.jobbackend.JobApplication;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {

    private JobService JobService;
    private Long jobId = 1L;

    public JobController(JobService jobService) {
        JobService = jobService;
    }

    @GetMapping("/jobs")
    public List<Job> findAllJobs() {
        return JobService.findAllJobs();
    }

    @PostMapping("/jobs")
    public String addJob(@RequestBody Job job) {
        job.setId(jobId++);
        JobService.addJob(job);
        return "Job Added Sucessfully";
    }

    @GetMapping("/jobs/{id}")
    public Job getJobById(@PathVariable Long id)  {
        return JobService.getJobById(id);
    }
}
