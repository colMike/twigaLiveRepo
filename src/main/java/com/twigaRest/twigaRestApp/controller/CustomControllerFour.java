package com.twigaRest.twigaRestApp.controller;

import com.twigaRest.twigaRestApp.dao.AssignmentRepository;
import com.twigaRest.twigaRestApp.dao.FuelRepository;
import com.twigaRest.twigaRestApp.entity.Fuel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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


//    @PostMapping("/addNewFuel")
//    public ResponseEntity<Fuel> addNewFuel(
//            @RequestBody Map<String, Object> fuelMap
//    ) {
//        return fuelRepository.addNewFuel();
//    }

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
