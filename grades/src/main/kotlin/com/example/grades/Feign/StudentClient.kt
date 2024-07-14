package com.example.grades.Feign

import com.example.grades.dto.StudentsResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "student-ms")
interface StudentClient {


    @GetMapping("/students/{id}")
    fun getGradesById(@PathVariable("id") id: Long): StudentsResponse

    @GetMapping("/students")
    fun getAllStudents(): List<StudentsResponse>
}