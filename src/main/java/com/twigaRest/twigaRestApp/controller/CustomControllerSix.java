package com.twigaRest.twigaRestApp.controller;

import com.twigaRest.twigaRestApp.dao.AccidentRepository;
import com.twigaRest.twigaRestApp.dao.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CustomControllerSix {

    private IncidentRepository incidentRepository;

    @Autowired
    public CustomControllerSix(IncidentRepository theIncidentRepository) {
        incidentRepository = theIncidentRepository;
    }


    @GetMapping("/getAllIncidentDetails")
    public String[] getAllIncidentDetails() {

        System.out.println();
        return incidentRepository.getAllIncidentDetails();

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
