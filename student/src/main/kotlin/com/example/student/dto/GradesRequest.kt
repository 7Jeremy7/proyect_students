package com.example.student.dto

data class GradesRequest(
    val id: Long,
    val subject: String,
    val grade: Double,
    val teacher: String
)
