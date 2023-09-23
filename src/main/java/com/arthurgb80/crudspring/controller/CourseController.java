package com.arthurgb80.crudspring.controller;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthurgb80.crudspring.model.Course;
import com.arthurgb80.crudspring.repository.CourseRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
@Configuration
public class CourseController {

    private final CourseRepository courseRepository;

    // @RequestMapping(method = RequestMethog.GET)
    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }

    @Bean
    CommandLineRunner intDatabase(CourseRepository courseRepository) {
        return args -> {
            courseRepository.deleteAll();

            Course c = new Course();
            c.setName("Angular com Spring");
            c.setCategory("Front-end");

            courseRepository.save(c);
        };
    }

}
