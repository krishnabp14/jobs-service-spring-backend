package com.krishnadev.jobbackend.Review;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    // SELECT * FROM REVIEW WHERE COMPANY_ID = ID
    List<Review> findByCompanyId(Long companyId);
}
