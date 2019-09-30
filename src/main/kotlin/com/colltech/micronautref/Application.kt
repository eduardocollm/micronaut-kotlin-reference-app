package com.colltech.micronautref

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("com.colltech.micronautref")
                .mainClass(Application.javaClass)
                .start()
    }
}