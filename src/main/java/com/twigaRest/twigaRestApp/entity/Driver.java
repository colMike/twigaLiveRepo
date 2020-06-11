package com.twigaRest.twigaRestApp.entity;

import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "driver")
@Data
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "travel_status")
    private int travelStatus;

    @Column(name = "distance_travelled", insertable = false, updatable = false)
    private Integer distanceTravelled;

    @Column(name = "time_taken", insertable = false, updatable = false)
    private Integer timeTaken;

    @Column(name = "distance_efficiency", insertable = false, updatable = false)
    private Integer distanceEfficiency;



    @Column(name = "time_efficiency", insertable = false, updatable = false)
//    [DatabaseGenerated(DatabaseGeneratedOption.Computed)]
    private Integer timeEfficiency;


    @Column(name = "phone_number")
    private String phoneNumber;

//    @OneToOne
//    @JoinColumn(name = "truck_id")
//    private Truck truck;

    @OneToMany(mappedBy = "driver")
    private List<Assignment> assignments;

    @OneToMany(mappedBy = "driver")
    private List<Fuel> fuels;

    @OneToMany(mappedBy = "driver")
    private List<WeeklyInspection> weeklyInspections;

    @OneToMany(mappedBy = "driver")
    private List<DailyInspection> dailyInspections;


//    public Driver() {
//
//    }
//
//    public Driver(String firstName, String lastName, String phoneNumber) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.phoneNumber = phoneNumber;
//    }


}
