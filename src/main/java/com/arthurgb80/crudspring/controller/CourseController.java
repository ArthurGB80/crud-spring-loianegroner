package com.arthurgb80.crudspring.controller;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
    public @ResponseBody List<Course> list() {
        return courseRepository.findAll();
    }

    // @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public void create(@RequestBody Course course) {
        // System.out.println(course.getName());
        courseRepository.save(course);
    }

    /*
     * @Bean
     * CommandLineRunner intDatabase(CourseRepository courseRepository) {
     * return args -> {
     * courseRepository.deleteAll();
     * 
     * Course c = new Course();
     * c.setName("Angular com Spring");
     * c.setCategory("Front-end");
     * 
     * courseRepository.save(c);
     * };
     * }
     */
}
