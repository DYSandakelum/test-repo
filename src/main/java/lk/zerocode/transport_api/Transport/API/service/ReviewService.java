package lk.zerocode.transport_api.Transport.API.service;

import lk.zerocode.transport_api.Transport.API.controller.request.ReviewRequest;
import lk.zerocode.transport_api.Transport.API.controller.response.ReviewResponse;
import lk.zerocode.transport_api.Transport.API.model.Review;

import java.util.List;

public interface ReviewService {

    void createReview(ReviewRequest reviewRequest);

    List<Review> getAllReviews();

    Review findById(Long reviewId);

    Review updateById(Long reviewId, ReviewRequest reviewRequest);






}
