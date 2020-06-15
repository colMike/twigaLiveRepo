package com.twigaRest.twigaRestApp.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "servicing")
@Data
public class Servicing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "garage")
    private String garage;

    @Column(name = "part_repaired")
    private String partRepaired;

    @Column(name = "comments")
    private String comments;

    @Column(name = "servicing_date")
    private Date servicingDate;


    @ManyToOne()
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @ManyToOne()
    @JoinColumn(name = "truck_id")
    private Truck truck;

}



