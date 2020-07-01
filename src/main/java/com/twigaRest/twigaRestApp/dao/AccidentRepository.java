package com.twigaRest.twigaRestApp.dao;

import com.twigaRest.twigaRestApp.entity.Accident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface AccidentRepository extends JpaRepository<Accident, Integer> {

    @Query(value = "SELECT DISTINCT a.id, d.first_name, d.last_name, t.reg_number, a.accident_date, a.damage, a.extent, a.comments FROM accident a JOIN driver d on a.driver_id = d.id JOIN truck t on a.truck_id = t.id", nativeQuery = true)
    public String[] getAllAccidentDetails();
}
