package net.bjonnh.springkotlinserializerdemo

import kotlinx.serialization.Serializable
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.*

@SpringBootApplication
class SpringKotlinSerializerDemoApplication


@Serializable
data class SomeData(
    val data: String = "Default Value"
)

@RestController
class SerializationController {
    @GetMapping("/")
    fun default(): SomeData {
        return SomeData()
    }

    @GetMapping("/withvalue")
    fun default(@RequestParam value: String?): SomeData {
        return SomeData(value ?: "Give me a value with a URL parameter value")
    }

    @PostMapping("/serializer")
    fun default(@RequestBody value: SomeData): String {
        return "Your data is: ${value.data}"
    }
}

fun main(args: Array<String>) {
    runApplication<SpringKotlinSerializerDemoApplication>(*args)
}
