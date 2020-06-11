package com.twigaRest.twigaRestApp.dao;

import com.twigaRest.twigaRestApp.entity.Truck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface TruckRepository extends JpaRepository<Truck, Integer> {

//    @Query(value = "SELECT reg_number FROM Truck WHERE reg_number='KBE 739V'", nativeQuery = true)
//    @Query(value = "SELECT t.regNumber FROM Truck t WHERE t.regNumber ='KBE 739V'", nativeQuery = false)
//    @Query(value = "SELECT distinct t.regNumber, t.id FROM Truck t", nativeQuery = false)
    @Query(value = "SELECT distinct t.regNumber, t.id FROM Truck t", nativeQuery = false)
//    @Query(value = "SELECT DISTINCT id, model, reg_number,travel_status FROM Truck WHERE reg_number='KBE 739V'", nativeQuery = true)
    public String[] getAllTrucks();

}
