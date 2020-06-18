package com.twigaRest.twigaRestApp.dao;

import com.twigaRest.twigaRestApp.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface DriverRepository extends JpaRepository<Driver, Integer> {

    @Query(value = "SELECT distinct d.phoneNumber, d.firstName, d.lastName, d.id FROM Driver d", nativeQuery = false)
//    @Query(value = "SELECT DISTINCT id, model, reg_number,travel_status FROM Truck WHERE reg_number='KBE 739V'", nativeQuery = true)
    public String[] getAllDrivers();

}
