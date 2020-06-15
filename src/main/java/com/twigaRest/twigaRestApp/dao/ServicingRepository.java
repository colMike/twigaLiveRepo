package com.twigaRest.twigaRestApp.dao;

import com.twigaRest.twigaRestApp.entity.Servicing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface ServicingRepository extends JpaRepository<Servicing, Integer> {


}
