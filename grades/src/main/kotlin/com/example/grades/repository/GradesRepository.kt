package com.example.grades.repository

import com.example.grades.model.Grades
import org.springframework.data.jpa.repository.JpaRepository

interface GradesRepository: JpaRepository<Grades, Long> {
}