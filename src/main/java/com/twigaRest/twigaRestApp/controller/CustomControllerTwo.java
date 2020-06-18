package com.twigaRest.twigaRestApp.controller;

import com.twigaRest.twigaRestApp.dao.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CustomControllerTwo {

    private DriverRepository driverRepository;

    @Autowired
    public CustomControllerTwo(DriverRepository theDriverRepository) {
        driverRepository = theDriverRepository;
    }


    @GetMapping("/getDrivers")
    public String[] getDrivers() {

        System.out.println();
        return driverRepository.getAllDrivers();

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
