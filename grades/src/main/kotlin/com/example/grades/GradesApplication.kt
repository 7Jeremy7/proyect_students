package com.example.grades

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients

class GradesApplication

fun main(args: Array<String>) {
	runApplication<GradesApplication>(*args)
}
