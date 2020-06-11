package com.twigaRest.twigaRestApp.dao;

import com.twigaRest.twigaRestApp.entity.Assignment;
import com.twigaRest.twigaRestApp.entity.Driver;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
public interface AssignmentRepository extends JpaRepository<Assignment, Integer> {


}
