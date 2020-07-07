package com.twigaRest.twigaRestApp.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "truck")
@Data
public class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "reg_number")
    private String regNumber;

    @Column(name = "model")
    private String model;

    @Column(name = "chassis_number")
    private String chassisNumber;

    @Column(name = "capacity")
    private int capacity;

    

    @Column(name = "travel_status", insertable = false, updatable = false)
    private Integer travelStatus;

//    @OneToOne(mappedBy = "truck")
//    private Driver driver;

//    @OneToMany(mappedBy = "truck",
//            cascade = {CascadeType.ALL})
//    private Set<Assignment> assignments;

    @OneToMany(mappedBy = "truck")
    private List<Assignment> assignments;

    @OneToMany(mappedBy = "truck")
    private List<Fuel> fuels;

    @OneToMany(mappedBy = "truck")
    private List<WeeklyInspection> weeklyInspections;

    @OneToMany(mappedBy = "truck")
    private List<DailyInspection> dailyInspections;

    @OneToMany(mappedBy = "truck")
    private List<Accident> accidents;

    @OneToMany(mappedBy = "truck")
    private List<Servicing> servicings;

}



