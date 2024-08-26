package xyz.hihasan.bagly

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BaglyApplication

fun main(args: Array<String>) {
	runApplication<BaglyApplication>(*args)
}
