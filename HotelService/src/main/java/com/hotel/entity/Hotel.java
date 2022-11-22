package com.hotel.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="hotels")
public class Hotel {

    @Id
    private  String id;
    private  String name;
    private String location;
    private  String about;
}
