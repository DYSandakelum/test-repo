package lk.zerocode.transport_api.Transport.API.repository;


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
}
