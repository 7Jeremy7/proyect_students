package com.example.grades.controller


import com.example.grades.Feign.StudentClient
import com.example.grades.dto.StudentsResponse
import com.example.grades.model.Grades

import com.example.grades.service.GradesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/grades")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT], origins = ["http://localhost:3000"] )
class GradesController {
    @Autowired
    lateinit var gradesService: GradesService

    @Autowired
    lateinit var studentClient: StudentClient





    @GetMapping
    fun login(): ResponseEntity<*> {

        return gradesService.list()?.let {
            ResponseEntity(it, HttpStatus.OK)
        } ?: ResponseEntity<Grades>( HttpStatus.NOT_FOUND)
    }



    @GetMapping("/{studentId}/student-details")
    fun getGrades(@PathVariable studentId: Long): List<StudentsResponse> {
        return studentClient.getAllStudents()
    }
}