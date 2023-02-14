package org.laelith.vttapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VttApiApplication

fun main(args: Array<String>) {
	runApplication<VttApiApplication>(*args)
}
