package com.example.student.Feign

import com.example.student.dto.GradesResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "grades-ms")
interface GradesClient {

    @GetMapping("/grades/{id}")
    fun getGradesById(@PathVariable("id") id: Long): GradesResponse

    @GetMapping("/grades")
    fun getAllGrades(): List<GradesResponse>
}
