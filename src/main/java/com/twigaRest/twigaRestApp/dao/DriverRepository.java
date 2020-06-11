package com.twigaRest.twigaRestApp.dao;

import com.twigaRest.twigaRestApp.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface DriverRepository extends JpaRepository<Driver, Integer> {


}
