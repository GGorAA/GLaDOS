package com.ggoraa.glados.controller


import com.ggoraa.glados.config.defaultLanguage
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {
    @GetMapping("/")
    fun displayHome(model: Model): String {
        var PageTitle = ""
        when (defaultLanguage) {
            "en_US" -> PageTitle = "GLaDOS Control Panel"
            "ru_RU" -> PageTitle = "Панель Управления GLaDOS"
            "ua_UA" -> PageTitle = "Панель Управління GLaDOS"
        }
        model["title"] = PageTitle
        return "mainScreen"
    }

    @GetMapping("/settings")
    fun displaySettingsHomepage() {

    }
}