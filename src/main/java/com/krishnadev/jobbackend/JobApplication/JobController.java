package com.krishnadev.jobbackend.JobApplication;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> addJob(@RequestBody Job job) {
        if(job != null) {
            JobService.addJob(job);
            return new ResponseEntity<>("Job Added Sucessfully", HttpStatus.OK);
        }

        return new ResponseEntity<>("Something went Wrong, Please Try Again", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/jobs/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id)  {
        Job job = JobService.getJobById(id);
        if(job != null) {
            return new ResponseEntity<>(job, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/jobs/{id}")
    public ResponseEntity<String> deleteJobById(@PathVariable Long id) {
        String response = JobService.deleteJobById(id);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
