package com.example.grades.service


import com.example.grades.Feign.StudentClient
import com.example.grades.dto.StudentsResponse
import com.example.grades.model.Grades

import com.example.grades.repository.GradesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GradesService {

    @Autowired
    lateinit var gradesRepository: GradesRepository

    @Autowired
    lateinit var  studentClient: StudentClient

    fun list():List<Grades>?{
        return gradesRepository.findAll()
    }

}