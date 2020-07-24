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
        var ReturnPage = "mainScreen"
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
            else -> {
                ReturnPage = "errorLang"
            }
        }
        model["title"] = PageTitle
        return ReturnPage
    }

    @GetMapping("/settings")
    fun displaySettingsHomepage(model: Model): String {
        var PageTitle = ""
        var StatisticsLabel = ""
        var ReturnPage = "settingsScreen"
        when (defaultLanguage) {
            "en_US" -> {
                PageTitle = "GLaDOS Settings"
                StatisticsLabel = "Statistics"
            }
            "ru_RU" -> {
                PageTitle = "Настройки GLaDOS"
                StatisticsLabel = "Статистика"
            }
            else -> {
                ReturnPage = "errorLang"
            }
        }
        model["title"] = PageTitle
        model["label"] = StatisticsLabel
        return ReturnPage
    }

    @GetMapping("/settings/appearance")
    fun displaySettingsAppearance(model: Model): String {
        var PageTitle = ""
        var LabelTitle = ""
        var ReturnPage = "settingsAppearanceScreen"
        when (defaultLanguage) {
            "en_US" -> {
                PageTitle = "GLaDOS Settings: Appearance"
                LabelTitle = "Appearance"
            }
            "ru_RU" -> {
                PageTitle = "Настройки GLaDOS: Внешний вид"
                LabelTitle = "Внешний вид"
            }
            "ua_UA" -> {
                PageTitle = "Налаштування GLaDOS: Зовнішний вид"
                LabelTitle = "Зовнішний вид"
            }
            else -> {
                ReturnPage = "errorLang"
            }
        }
        model["title"] = PageTitle
        model["appearance"] = LabelTitle
        return ReturnPage
    }
}