package com.krishnadev.jobbackend.JobApplication;

import org.springframework.data.jpa.repository.JpaRepository;

// You can also use CrudRepository
public interface JobRepository extends JpaRepository<Job, Long> {
}
