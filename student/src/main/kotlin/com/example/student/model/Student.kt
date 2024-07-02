package com.example.student.model

import jakarta.persistence.*


@Entity
@Table(name = "students")
class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    @Column(name = "first_name")
    var firstName: String? = null
    @Column(name = "last_name")
    var lastName: String? = null
    var age: Int? = null
}