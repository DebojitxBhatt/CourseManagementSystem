package com.coursesys.courseenrollment.repository;

import com.coursesys.courseenrollment.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    // ✅ Case-insensitive search on PostgreSQL
    @Query("SELECT c FROM Course c WHERE LOWER(c.name) LIKE LOWER(CONCAT('%', :query, '%')) OR LOWER(c.instructor) LIKE LOWER(CONCAT('%', :query, '%'))")
    List<Course> searchByQuery(@Param("query") String query);
}
