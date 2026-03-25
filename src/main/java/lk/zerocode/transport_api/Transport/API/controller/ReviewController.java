package lk.zerocode.transport_api.Transport.API.controller;

import lk.zerocode.transport_api.Transport.API.controller.request.ReviewRequest;
import lk.zerocode.transport_api.Transport.API.controller.response.ReviewResponse;
import lk.zerocode.transport_api.Transport.API.model.Review;
import lk.zerocode.transport_api.Transport.API.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReviewController {

    @Autowired
    private ReviewService reviewService;


    @PostMapping("/reviews")
    public void createReview(@RequestBody ReviewRequest reviewRequest){


        reviewService.createReview(reviewRequest);

    }

    @GetMapping("/reviews")

    public List<ReviewResponse> getAllReviews(){

        List<Review> reviewList = reviewService.getAllReviews();
        List<ReviewResponse> reviewResponseList = new ArrayList<>();

        for (Review review : reviewList) {
            ReviewResponse response = new ReviewResponse();
            response.setReviewId(review.getReviewId());
            response.setDriverName(review.getDriverName());
            response.setReviewMessage(review.getReviewMessage());
            reviewResponseList.add(response);
        }

        return reviewResponseList;

    }

    @GetMapping("/reviews/{review-id}")
     public ReviewResponse getById(@PathVariable ("review-id") long reviewId){

        Review review = reviewService.findById(reviewId);
        
        if(review == null){
            return null;
        }

        ReviewResponse response = new ReviewResponse();
        response.setReviewId(review.getReviewId());
        response.setDriverName(review.getDriverName());
        response.setReviewMessage(review.getReviewMessage());
        return response;

    }

    @PutMapping("/reviews/{review-id}")
    public ReviewResponse updateReview(@PathVariable("review-id") long reviewId,
                             @RequestBody ReviewRequest reviewRequest){

        Review review = reviewService.updateById(reviewId, reviewRequest);

        if(review == null){
            return null;
        }

        ReviewResponse response = new ReviewResponse();
        response.setReviewId(review.getReviewId());
        response.setDriverName(review.getDriverName());
        response.setReviewMessage(review.getReviewMessage());

        return response;


    }
    }


