package com.twigaRest.twigaRestApp.dao;

import com.twigaRest.twigaRestApp.entity.Assignment;
import com.twigaRest.twigaRestApp.entity.Driver;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
public interface AssignmentRepository extends JpaRepository<Assignment, Integer> {

//    @Query(value = "SELECT distinct a.odometerStart, a.driverId FROM Assignment a", nativeQuery = false)
//    @Query(value = "SELECT DISTINCT id, model, reg_number,travel_status FROM Truck WHERE reg_number='KBE 739V'", nativeQuery = true)
    @Query(value = "SELECT DISTINCT id, odometer_start, driver_id FROM Assignment WHERE trip_status='1'", nativeQuery = true)
    public String[] getAllAssignments();

    @Query(value = "SELECT DISTINCT a.id, d.first_name, d.last_name, t.reg_number, a.trip_start, a.trip_end, a.odometer_start, a.odometer_end, a.starting_point, a.end_point FROM assignment a JOIN driver d on a.driver_id = d.id JOIN truck t on a.truck_id = t.id", nativeQuery = true)
    public String[] getAllAssignmentDetails();
}
