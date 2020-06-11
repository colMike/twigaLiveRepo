package com.twigaRest.twigaRestApp.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "assignment")
@Data
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "trip_status")
    private int tripStatus;

    @Column(name = "trip_start")
    private Date tripStart;

    @Column(name = "trip_end")
    private Date tripEnd;

    @Column(name = "odometer_start")
    private double odometerStart;

    @Column(name = "odometer_end")
    private double odometerEnd;

    @Column(name = "starting_point")
    private String startingPoint;

    @Column(name = "end_point")
    private String endPoint;

    @ManyToOne()
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @ManyToOne()
    @JoinColumn(name = "truck_id")
    private Truck truck;

}



