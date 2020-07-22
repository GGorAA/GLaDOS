package com.ggoraa.glados.core.controller.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController {
    @GetMapping("/rest/move/head/{xAxis}/{yAxis}")
    fun controlHead(
            @PathVariable yAxis: Int,
            @PathVariable xAxis: Int
    ) {

    }

    @GetMapping("/rest/move/body/{xAxis}/{yAxis}")
    fun controlBody(
            @PathVariable yAxis: Int,
            @PathVariable xAxis: Int
    ) {

    }

    @GetMapping("/rest/move/baseTurn/{turnSpeed}")
    fun controlBase(
            @PathVariable turnSpeed: String
    ) {

    }
}