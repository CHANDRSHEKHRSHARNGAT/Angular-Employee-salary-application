package com.user.entities;

import com.user.entities.rating.Rating;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table(name = "user")
public class User {

    @Id
    @Column(name="UserId")
    private  String userId;

    @Column(name="Name")
    private  String name;
    @Column(name="Email")
    private  String email;
    @Column(name="About")
    private  String about;


    @Transient
    private List<Rating>ratings=  new ArrayList<>();

}
