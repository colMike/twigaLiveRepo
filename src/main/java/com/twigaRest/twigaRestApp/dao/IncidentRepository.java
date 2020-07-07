package com.twigaRest.twigaRestApp.dao;

import com.twigaRest.twigaRestApp.entity.Accident;
import com.twigaRest.twigaRestApp.entity.Incident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface IncidentRepository extends JpaRepository<Incident, Integer> {

    @Query(value = "SELECT DISTINCT i.id, d.first_name, d.last_name, t.reg_number, i.incident_date, i.incident,  i.comments FROM incident i JOIN driver d on i.driver_id = d.id JOIN truck t on i.truck_id = t.id", nativeQuery = true)
    public String[] getAllIncidentDetails();

}
