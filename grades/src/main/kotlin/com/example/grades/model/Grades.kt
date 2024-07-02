package com.example.grades.model

import jakarta.persistence.*


@Entity
@Table(name = "grades")
class Grades {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var subject: String? = null
    var grade: Double? = null
    var teacher: String? = null
}