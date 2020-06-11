package com.twigaRest.twigaRestApp.dao;

import com.twigaRest.twigaRestApp.entity.Fuel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface FuelRepository extends JpaRepository<Fuel, Integer> {

}
