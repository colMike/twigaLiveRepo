package com.twigaRest.twigaRestApp.controller;

import com.twigaRest.twigaRestApp.dao.AccidentRepository;
import com.twigaRest.twigaRestApp.dao.FuelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CustomControllerFive {

    private AccidentRepository accidentRepository;

    @Autowired
    public CustomControllerFive(AccidentRepository theAccidentRepository) {
        accidentRepository = theAccidentRepository;
    }


    @GetMapping("/getAllAccidentDetails")
    public String[] getAllAccidentDetails() {

        System.out.println();
        return accidentRepository.getAllAccidentDetails();

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
