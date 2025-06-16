package com.seopyoon.semantic_release

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SemanticReleaseApplication

fun main(args: Array<String>) {
	runApplication<SemanticReleaseApplication>(*args)
}
