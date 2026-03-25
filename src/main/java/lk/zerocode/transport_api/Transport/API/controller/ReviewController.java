package lk.zerocode.transport_api.Transport.API.controller;

import lk.zerocode.transport_api.Transport.API.controller.request.ReviewRequest;
import lk.zerocode.transport_api.Transport.API.controller.response.ReviewResponse;
import lk.zerocode.transport_api.Transport.API.model.Review;
import lk.zerocode.transport_api.Transport.API.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
        List<ReviewResponse> reviewResponseList = new ArrayList<ReviewResponse>();

        for (Review review : reviewList) {
            ReviewResponse reviewResponse = new ReviewResponse();
            reviewResponse.setReviewId(review.getReviewId());
            reviewResponse.setReviewMessage(review.getReviewMessage());
            reviewResponseList.add(reviewResponse);
        }

        return reviewResponseList;

    }

}
