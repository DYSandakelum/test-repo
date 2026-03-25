package lk.zerocode.transport_api.Transport.API.repository;


import lk.zerocode.transport_api.Transport.API.controller.request.ReviewRequest;
import lk.zerocode.transport_api.Transport.API.model.Review;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ReviewRepository {

    List<Review> reviewList = new ArrayList<>();

    public void createReview(Review review){
        reviewList.add(review);
    }

    public List<Review> getAllReviews(){
        return reviewList;
    }

    public Review findById(long reviewId) {
        for (Review review : reviewList) {

            if(review.getReviewId() == reviewId){
                return review;
            }
        }
            return  null;
    }

    public Review updateById(long reviewId, ReviewRequest reviewRequest){

        for (Review review : reviewList) {
            if(review.getReviewId() == reviewId){
                review.setDriverName(reviewRequest.getDriverName());
                review.setReviewMessage(reviewRequest.getReviewMessage());
                return review;
            }
        }

        return  null;
    }

}



