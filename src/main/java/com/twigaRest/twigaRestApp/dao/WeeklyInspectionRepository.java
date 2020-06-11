package com.twigaRest.twigaRestApp.dao;

import com.twigaRest.twigaRestApp.entity.WeeklyInspection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface WeeklyInspectionRepository extends JpaRepository<WeeklyInspection, Integer> {

}
