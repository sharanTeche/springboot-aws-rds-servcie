package com.cource.controller;

import com.cource.entity.Course;
import com.cource.service.CourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/courcess")
public class CourceController {


    private CourceService courceService;

    public CourceController(CourceService courceService) {
        this.courceService = courceService;
    }

    @PostMapping
    public ResponseEntity<Course> enrollCource(@RequestBody Course course) {
       return new ResponseEntity<>(courceService.createCource(course), HttpStatus.CREATED);
    }
}
