package com.arthurgb80.crudspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    // @RequestMapping(method = RequestMethog.GET)
    @GetMapping
    public List<Object> list() {
        return null;
    }
    
}
