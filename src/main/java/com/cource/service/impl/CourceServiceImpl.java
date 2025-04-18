package com.cource.service.impl;

import com.cource.entity.Course;
import com.cource.repository.CourceRepository;
import com.cource.service.CourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourceServiceImpl implements CourceService {


    private CourceRepository courceRepository;

    public CourceServiceImpl(CourceRepository courceRepository) {
        this.courceRepository = courceRepository;
    }


    @Override
    public Course createCource(Course course) {

        Course savedCource =  courceRepository.save(course);
        return savedCource;
    }
}
