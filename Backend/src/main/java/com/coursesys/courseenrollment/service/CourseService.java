package com.coursesys.courseenrollment.service;

import com.coursesys.courseenrollment.model.Course;
import com.coursesys.courseenrollment.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    // Get all courses
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    // Search courses by name or instructor (case-insensitive, PostgreSQL-safe)
    public List<Course> searchCourses(String query) {
        return courseRepository.searchByQuery(query); // uses @Query method
    }

    // Get course by ID
    public Course getCourseById(Long id) {
        Optional<Course> course = courseRepository.findById(id);
        return course.orElse(null);
    }

    // Create a new course
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    // Delete course by ID
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    // Update course details
    public Course updateCourse(Long id, Course updatedCourse) {
        Course existing = courseRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(updatedCourse.getName());
            existing.setInstructor(updatedCourse.getInstructor());
            existing.setCapacity(updatedCourse.getCapacity());
            return courseRepository.save(existing);
        }
        return null;
    }
}
