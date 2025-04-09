package com.coursesys.courseenrollment.controller;

import com.coursesys.courseenrollment.model.Course;
import com.coursesys.courseenrollment.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // ✅ GET /api/courses/search?query=java
    @GetMapping("/search")
    public List<Course> searchCourses(@RequestParam String query) {
        return courseService.searchCourses(query);
    }

    // ✅ GET /api/courses
    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    // ✅ GET /api/courses/{id}
    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }

    // ✅ POST /api/courses
    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    // ✅ DELETE /api/courses/{id}
    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }
}
