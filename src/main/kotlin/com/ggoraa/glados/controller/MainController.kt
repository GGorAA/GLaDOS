package com.ggoraa.glados.controller


import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {
    @GetMapping("/")
    fun displayHome(model: Model): String {
        model["title"] = "GLaDOS Control Panel"
        return "mainScreen"
    }
}