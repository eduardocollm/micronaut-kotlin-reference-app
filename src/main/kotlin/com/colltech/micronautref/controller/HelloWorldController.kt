package com.colltech.micronautref.controller

import io.micronaut.context.annotation.Value
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/hello")
class HelloWorldController(@Value("\${hello.controller.recipient:World}") val recipient: String) {

    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): String {
        return "Hello $recipient\n"
    }
}