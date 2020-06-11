package com.twigaRest.twigaRestApp.controller;

import com.twigaRest.twigaRestApp.dao.TruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CustomController {

    private TruckRepository truckRepository;

    @Autowired
    public CustomController(TruckRepository theTruckRepository) {
        truckRepository = theTruckRepository;
    }


    @GetMapping("/getTests")
    public String[] getTests() {

        System.out.println();
        return truckRepository.getAllTrucks();

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
