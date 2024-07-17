package com.example.student.service


import com.example.student.Feign.GradesClient
import com.example.student.dto.GradesResponse
import com.example.student.model.Student
import com.example.student.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService {

    @Autowired
    lateinit var studentRepository: StudentRepository

    @Autowired
    lateinit var gradesClient: GradesClient


    fun list(): List<Student>? {
        return studentRepository.findAll()
    }

}