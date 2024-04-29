package com.krishnadev.jobbackend.Review.impl;

import com.krishnadev.jobbackend.Review.Review;
import com.krishnadev.jobbackend.Review.ReviewRepository;
import com.krishnadev.jobbackend.Review.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> getAllReviews(Long companyId) {
        return reviewRepository.findByCompanyId(companyId);
    }
}
