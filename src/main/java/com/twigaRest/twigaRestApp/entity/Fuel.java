package com.twigaRest.twigaRestApp.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "fuel")
@Data
public class Fuel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "fueling_date")
    private Date fuelDate;

    @Column(name = "fueling_station")
    private String fuelingStation;

    @Column(name = "litres")
    private double litres;

    @Column(name = "cost")
    private double cost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "truck_id")
    private Truck truck;

}



