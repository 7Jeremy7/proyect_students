package com.example.Eurekam

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class EurekamApplication

fun main(args: Array<String>) {
	runApplication<EurekamApplication>(*args)
}
