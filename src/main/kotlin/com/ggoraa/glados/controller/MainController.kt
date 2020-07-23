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
            "en_US" -> {
                PageTitle = "GLaDOS Control Panel"
            }
            "ru_RU" -> {
                PageTitle = "Панель Управления GLaDOS"
            }
            "ua_UA" -> {
                PageTitle = "Панель Управління GLaDOS"
            }
        }
        model["title"] = PageTitle
        return "mainScreen"
    }

    @GetMapping("/settings")
    fun displaySettingsHomepage(model: Model): String {
        var PageTitle = ""
        var ReturnPage = "settingsScreen"
        when (defaultLanguage) {
            "en_US" -> {
                PageTitle = "GLaDOS Settings"
            }
            "ru_RU" -> {
                PageTitle = "Настройки GLaDOS"
            }
            else -> {
                ReturnPage = "Error occurred. Check your language settings."
            }
        }
        model["title"] = PageTitle
        return ReturnPage
    }

    @GetMapping("/settings/appearance")
    fun displaySettingsAppearance(model: Model): String {
        var PageTitle = ""
        var ReturnPage = "settingsAppearanceScreen"
        when (defaultLanguage) {
            "en_US" -> {
                PageTitle = "GLaDOS Settings: Appearance"
            }
            "ru_RU" -> {
                PageTitle = "Настройки GLaDOS: Внешний вид"
            }
            else -> {
                ReturnPage = "Error occurred. Check your language settings."
            }
        }
        model["title"] = PageTitle
        return ReturnPage
    }
}