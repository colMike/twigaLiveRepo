package com.twigaRest.twigaRestApp.controller;

import com.twigaRest.twigaRestApp.dao.AssignmentRepository;
import com.twigaRest.twigaRestApp.dao.FuelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CustomControllerFour {

    private FuelRepository fuelRepository;

    @Autowired
    public CustomControllerFour(FuelRepository theFuelRepository) {
        fuelRepository = theFuelRepository;
    }


    @GetMapping("/getAllFuelDetails")
    public String[] getAllFuelDetails() {

        System.out.println();
        return fuelRepository.getAllFuelDetails();

    }
}
//    @GetMapping("/getTruckById")
//    public List<Truck> getTruckById(@PathVariable String regNo){
//    public List<Truck> getTruckById(Model model){
//        Truck truck = (Truck) truckService.findTruckByRegNumber("KAL 135G");
//        var trucks = truckRepository.findTruckByRegNumber();
//
//        model.addAttribute("trucks", trucks);
//
//        System.out.println(trucks);
