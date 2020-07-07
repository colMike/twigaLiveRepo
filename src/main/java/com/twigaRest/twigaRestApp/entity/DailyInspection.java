package com.twigaRest.twigaRestApp.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "daily_inspection")
@Data
public class DailyInspection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_aid_kit_status")
    private int firstAidKitStatus;

    @Column(name = "first_aid_kit_comment")
    private String firstAidKitComment;

    @Column(name = "triangles_status")
    private int triangleStatus;

    @Column(name = "triangles_comment")
    private String triangleComment;

    @Column(name = "reflector_back_status")
    private int reflectorBackStatus;

    @Column(name = "reflector_back_comment")
    private String reflectorBackComment;

    @Column(name = "reflector_front_status")
    private int reflectorFrontStatus;

    @Column(name = "reflector_front_comment")
    private String reflectorFrontComment;

    @Column(name = "extinguisher_status")
    private int fireExtinguisherStatus;

    @Column(name = "extinguisher_comment")
    private String fireExtinguisherComment;

    @Column(name = "reflective_strip_status")
    private int reflectiveStripStatus;

    @Column(name = "reflective_strip_comment")
    private String reflectiveStripComment;

    @Column(name = "chevrons_status")
    private int chevronsStatus;

    @Column(name = "chevrons_comment")
    private String chevronsComment;

    @Column(name = "speed_sticker_status")
    private int speedStickerStatus;

    @Column(name = "speed_sticker_comment")
    private String speedStickerComment;

    @Column(name = "co_address_weights_status")
    private int coAddressWeightsStatus;

    @Column(name = "co_address_weights_comment")
    private String coAddressWeightsComment;

    @Column(name = "cracked_windscreen_status")
    private int crackedWindscreenStatus;

    @Column(name = "cracked_windscreen_comment")
    private String crackedWindscreenComment;

    @Column(name = "tyres_condition_status")
    private int tyresConditionStatus;

    @Column(name = "tyres_condition_comment")
    private String tyresConditionComment;

    @Column(name = "gear_locks_status")
    private int gearLocksStatus;

    @Column(name = "gear_locks_comment")
    private String gearLocksComment;

    @Column(name = "ntsa_sticker_status")
    private int ntsaStickerStatus;

    @Column(name = "ntsa_sticker_comment")
    private String ntsaStickerComment;

    @Column(name = "spare_wheel_status")
    private int spareWheelStatus;

    @Column(name = "spare_wheel_comment")
    private String spareWheelComment;


    @Column(name = "jack_status")
    private int jackStatus;
    @Column(name = "jack_comment")
    private String jackComment;
    @Column(name = "spanner_status")
    private int spannerStatus;
    @Column(name = "spanner_comment")
    private String spannerComment;

    @Column(name = "inspection_date")
    private Date inspectionDate;

    @Column(name = "service_due_date")
    private Date serviceDueDate;


    @ManyToOne()
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @ManyToOne()
    @JoinColumn(name = "truck_id")
    private Truck truck;
}



