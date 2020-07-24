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
        var pageTitle = ""
        var labelTitle = ""
        var themeSettingsLabel = ""
        var themeSelectDefault = ""
        var themeSelectDark = ""
        var themeSelectLight = ""
        var langSettingsLabel = ""
        var returnPage = "settingsAppearanceScreen"
        when (defaultLanguage) {
            "en_US" -> {
                pageTitle = "GLaDOS Settings: Appearance"
                labelTitle = "Appearance"
                themeSettingsLabel = "Theme"
                themeSelectDefault = "System default"
                themeSelectDark = "Dark"
                themeSelectLight = "Light"
                langSettingsLabel = "Language"
            }
            "ru_RU" -> {
                pageTitle = "Настройки GLaDOS: Внешний вид"
                labelTitle = "Внешний вид"
                themeSettingsLabel = "Тема"
                themeSelectDefault = "Системная"
                themeSelectDark = "Темная"
                themeSelectLight = "Светлая"
                langSettingsLabel = "Язык"
            }
            "ua_UA" -> {
                pageTitle = "Налаштування GLaDOS: Зовнішний вид"
                labelTitle = "Зовнішний вид"
                themeSettingsLabel = "Тема"
                themeSelectDefault = "Системна"
                themeSelectDark = "Темна"
                themeSelectLight = "Світла"
                langSettingsLabel = "Мова"
            }
            else -> {
                returnPage = "errorLang"
            }
        }
        model["title"] = pageTitle
        model["appearance"] = labelTitle
        model["theme_settings_label"] = themeSettingsLabel
        model["theme_select_default"] = themeSelectDefault
        model["theme_select_dark"] = themeSelectDark
        model["theme_select_light"] = themeSelectLight
        model["lang_settings_label"] = langSettingsLabel
        return returnPage
    }
}