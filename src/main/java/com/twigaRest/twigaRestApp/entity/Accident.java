package com.twigaRest.twigaRestApp.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "accident")
@Data
public class Accident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "damage")
    private String damage;

    @Column(name = "extent")
    private String extent;

    @Column(name = "comments")
    private String comments;

    @Column(name = "accident_date")
    private Date accidentDate;


    @ManyToOne()
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @ManyToOne()
    @JoinColumn(name = "truck_id")
    private Truck truck;

}