package com.rating.services;
import com.rating.entities.Rating;
import java.util.List;
public interface RatingServices {

    //create

    Rating create(Rating rating);

    //getall user
    List<Rating>getRatings();

    //get all by userid
    List<Rating>getRatingByUserId(String userId);

    // get all by hotel

    List<Rating>getRatingByHotelId(String hotelId);

}
