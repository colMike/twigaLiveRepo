package com.twigaRest.twigaRestApp.dao;

import com.twigaRest.twigaRestApp.entity.Accident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface AccidentRepository extends JpaRepository<Accident, Integer> {


}
