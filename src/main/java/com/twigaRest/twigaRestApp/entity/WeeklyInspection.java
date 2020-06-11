package com.twigaRest.twigaRestApp.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "weekly_inspection")
@Data
public class WeeklyInspection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "oil_level_status")
    private int oilStatus;

    @Column(name = "oil_levels_comment")
    private String oilComment;

    @Column(name = "radiator_status")
    private int radiatorStatus;

    @Column(name = "radiator_comment")
    private String radiatorComment;

    @Column(name = "leaks_status")
    private int leakStatus;

    @Column(name = "leaks_comment")
    private String leakComment;

    @Column(name = "fluid_status")
    private int fluidStatus;

    @Column(name = "fluid_comment")
    private String fluidComment;

    @Column(name = "fan_belt_status")
    private int fanBeltStatus;

    @Column(name = "fan_belt_comment")
    private String fanBeltComment;

    @Column(name = "exhaust_pipe_status")
    private int exhaustStatus;

    @Column(name = "exhaust_pipe_comment")
    private String exhaustComment;

    @Column(name = "fuel_tank_status")
    private int fuelTankStatus;

    @Column(name = "fuel_tank_comment")
    private String fuelTankComment;

    @Column(name = "head_lights_status")
    private int headlightStatus;

    @Column(name = "head_lights_comment")
    private String headlightComment;

    @Column(name = "side_lights_status")
    private int sidelightStatus;

    @Column(name = "side_lights_comment")
    private String sidelightComment;

    @Column(name = "indicator_light_status")
    private int indicatorlightStatus;

    @Column(name = "indicator_light_comment")
    private String indicatorlightComment;

    @Column(name = "plate_lights_status")
    private int platelightStatus;

    @Column(name = "plate_lights_comment")
    private String platelightComment;

    @Column(name = "lenses_status")
    private int lenStatus;

    @Column(name = "lenses_comment")
    private String lensComment;

    @Column(name = "all_gauges_status")
    private int gaugeStatus;

    @Column(name = "all_gauges_comment")
    private String gaugeComment;

    @Column(name = "cracks_status")
    private int crackStatus;

    @Column(name = "cracks_comment")
    private String crackComment;


    @Column(name = "mirror_arms_status")
    private int mirrorArmStatus;
    @Column(name = "mirror_arms_comment")
    private String mirrorArmComment;
    @Column(name = "rear_view_status")
    private int rearViewStatus;
    @Column(name = "rear_view_comment")
    private String rearViewComment;

    @Column(name = "windows_winding_status")
    private int windowsWindingStatus;
    @Column(name = "windows_winding_comment")
    private String windowsWindingComment;

    @Column(name = "wiper_blades_status")
    private int wiperBladeStatus;

    @Column(name = "wiper_blades_comment")
    private String wiperBladeComment;
    @Column(name = "tyre_pressure_status")
    private int tyrePressureStatus;

    @Column(name = "tyre_pressure_comment")
    private String tyrePressureComment;

    @Column(name = "tyre_tread_status")
    private int tyreTreadStatus;
    @Column(name = "tyre_tread_comment")
    private String tyreTreadComment;
    @Column(name = "spare_wheel_status")
    private int spareWheelStatus;
    @Column(name = "spare_wheel_comment")
    private String spareWheelComment;
    @Column(name = "jack_wheel_spanner_status")
    private int jackWheelSpannerStatus;
    @Column(name = "jack_wheel_spanner_comment")
    private String jackWheelSpannerComment;

    @Column(name = "tyres_on_steering_axle_status")
    private int tyresOnSteeringAxleStatus;
    @Column(name = "tyres_on_steering_axle_comment")
    private String tyresOnSteeringAxleComment;

    @Column(name = "spare_wheel_rack_status")
    private int spareWheelRackStatus;
    @Column(name = "spare_wheel_rack_comment")
    private String spareWheelRackComment;

    @Column(name = "brake_clutch_status")
    private int brakeClutchStatus;
    @Column(name = "brake_clutch_comment")
    private String brakeClutchComment;

    @Column(name = "tyre_size_match_status")
    private int tyreSizeMatchStatus;
    @Column(name = "tyre_size_match_comment")
    private String tyreSizeMatchComment;

    @Column(name = "brake_hose_status")
    private int brakeHoseStatus;
    @Column(name = "brake_hose_comment")
    private String brakeHoseComment;
    @Column(name = "first_aid_kit_status")
    private int firstAidKitStatus;

    @Column(name = "first_aid_kit_comment")
    private String firstAidKitComment;

    @Column(name = "triangles_status")
    private int triangleStatus;
    @Column(name = "triangles_comment")
    private String triangleComment;
    @Column(name = "extinguisher_status")
    private int extinguisherStatus;
    @Column(name = "extinguisher_comment")
    private String extinguisherComment;

    @Column(name = "radio_status")
    private int radioStatus;
    @Column(name = "radio_comment")
    private String radioComment;

    @Column(name = "reflector_status")
    private int reflectorStatus;
    @Column(name = "reflector_comment")
    private String reflectorComment;

    @Column(name = "number_plate_status")
    private int numberPlateStatus;

    @Column(name = "number_plate_comment")
    private String numberPlateComment;

    @Column(name = "dents_status")
    private int dentsStatus;
    @Column(name = "dents_comment")
    private String dentsComment;
    @Column(name = "insurance_expiry_status")
    private int insuranceExpiryStatus;
    @Column(name = "insurance_expiry_comment")
    private String insuranceExpiryComment;

    @Column(name = "inspection_sticker_status")
    private int inspectionStickerStatus;
    @Column(name = "inspection_sticker_comment")
    private String inspectionStickerComment;

    @Column(name = "speed_governor_status")
    private int speedGovernorStatus;
    @Column(name = "speed_governor_comment")
    private String speedGovernorComment;
    @Column(name = "drain_air_tanks_status")
    private int drainAirTanksStatus;

    @Column(name = "drain_air_tanks_comment")
    private String drainAirTanksComment;

    @Column(name = "inspection_date")
    private String inspectionDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "truck_id")
    private Truck truck;
}



