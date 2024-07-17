package com.example.student.controller

import com.example.student.Feign.GradesClient
import com.example.student.dto.GradesRequest
import com.example.student.dto.GradesResponse
import com.example.student.model.Student
import com.example.student.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT], origins = ["http://localhost:3000"] )
class StundentController {
    @Autowired
    lateinit var studentService: StudentService

    @Autowired
    lateinit var gradesClient: GradesClient





    @GetMapping
    fun login(): ResponseEntity<*> {

        return studentService.list()?.let {
            ResponseEntity(it, HttpStatus.OK)
        } ?: ResponseEntity<Student>( HttpStatus.NOT_FOUND)
    }


    @GetMapping("/{studentId}/grades")
    fun getGrades(@PathVariable studentId: Long): List<GradesResponse> {
        return gradesClient.getAllGrades()
    }

}♠