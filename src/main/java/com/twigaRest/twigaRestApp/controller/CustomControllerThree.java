package com.twigaRest.twigaRestApp.controller;

import com.twigaRest.twigaRestApp.dao.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CustomControllerThree {

    private AssignmentRepository assignmentRepository;

    @Autowired
    public CustomControllerThree(AssignmentRepository theAssignmentRepository) {
        assignmentRepository = theAssignmentRepository;
    }


    @GetMapping("/getAssignments")
    public String[] getAssignments() {

        System.out.println();
        return assignmentRepository.getAllAssignments();

    }

    @GetMapping("/getAssignmentDetails")
    public String[] getAssignmentDetails() {

        System.out.println();
        return assignmentRepository.getAllAssignmentDetails();

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
