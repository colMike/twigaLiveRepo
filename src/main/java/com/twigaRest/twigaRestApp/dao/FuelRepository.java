package com.twigaRest.twigaRestApp.dao;

import com.twigaRest.twigaRestApp.entity.Fuel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface FuelRepository extends JpaRepository<Fuel, Integer> {

    @Query(value = "SELECT DISTINCT f.id, d.first_name, d.last_name, t.reg_number, f.fueling_date, f.fueling_station, f.litres, f.cost FROM fuel f JOIN driver d on f.driver_id = d.id JOIN truck t on f.truck_id = t.id", nativeQuery = true)
    public String[] getAllFuelDetails();
}
