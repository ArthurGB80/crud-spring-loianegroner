package com.arthurgb80.crudspring.controller;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
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

    @GetMapping("/{id}")
    public ResponseEntity<Course> findById(@PathVariable Long id) {
        return courseRepository.findById(id)
        .map(record -> ResponseEntity.ok().body(record))
        .orElse(ResponseEntity.notFound().build());
    }

    // @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Course create(@RequestBody Course course) {
        //System.out.println(course.getName());
        return courseRepository.save(course);
        // return ResponseEntity.status(HttpStatus.CREATED)
        //         .body(courseRepository.save(course));
    }
}
