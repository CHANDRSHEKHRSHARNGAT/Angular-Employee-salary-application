package com.rating.controller;

import com.rating.entities.Rating;
import com.rating.services.RatingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingServices reatingService;

    //create
    @PostMapping
    public ResponseEntity<Rating> create (@RequestBody Rating rating){
        return  ResponseEntity.status(HttpStatus.CREATED).body(reatingService.create(rating));
    }

    //get all

    @GetMapping
    public  ResponseEntity<List<Rating>>getRatings(){
        return  ResponseEntity.ok(reatingService.getRatings());
    }

    //get user id
    @GetMapping("/users/{userId}")
    public  ResponseEntity<List<Rating>>getRatingsByUserId(@PathVariable String userId){
        return  ResponseEntity.ok(reatingService.getRatingByUserId(userId));
    }

    //get hotel id

    @GetMapping("/hotels/{hotelId}")
    public  ResponseEntity<List<Rating>>getRatingsByHotelId(@PathVariable String hotelId){
        return  ResponseEntity.ok(reatingService.getRatingByHotelId(hotelId));
    }
}
