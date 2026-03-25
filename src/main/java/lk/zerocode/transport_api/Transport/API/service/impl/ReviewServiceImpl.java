package lk.zerocode.transport_api.Transport.API.service.impl;

import lk.zerocode.transport_api.Transport.API.controller.request.ReviewRequest;
import lk.zerocode.transport_api.Transport.API.model.Review;
import lk.zerocode.transport_api.Transport.API.repository.ReviewRepository;
import lk.zerocode.transport_api.Transport.API.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public void createReview(ReviewRequest reviewRequest) {

        System.out.println(reviewRequest.getReviewId());
        System.out.println(reviewRequest.getDriverName());
        System.out.println(reviewRequest.getReviewMessage());

        Review review = new Review();
        review.setReviewId(reviewRequest.getReviewId());
        review.setDriverName(reviewRequest.getDriverName());
        review.setReviewMessage(reviewRequest.getReviewMessage());

        reviewRepository.createReview(review);

    }

    public List<Review> getAllReviews(){

        return reviewRepository.getAllReviews();
    }
}
