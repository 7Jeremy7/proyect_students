package com.example.student.dto

data class GradesResponse(
    val id: Long,
    val subject: String,
    val grade: Double,
    val teacher: String
)
