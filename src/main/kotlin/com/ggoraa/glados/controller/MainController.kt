package com.ggoraa.glados.controller


import com.ggoraa.glados.config.defaultLanguage
import com.ggoraa.glados.config.passedOOBE
import com.ggoraa.glados.core.*
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping


@Controller
class MainController {
    @GetMapping("/")
    fun displayHome(model: Model): String {
        var ReturnPage = ""
        if (!passedOOBE) {
            ReturnPage = "setup/start"
        } else {
            var PageTitle = ""
            ReturnPage = "mainScreen"
            when (defaultLanguage) {
                "en_US" -> {
                    PageTitle = pageTitle_en_US_Homepage
                }
                "ru_RU" -> {
                    PageTitle = pageTitle_ru_RU_Homepage
                }
                "ua_UA" -> {
                    PageTitle = pageTitle_ua_UA_Homepage
                }
                else -> {
                    ReturnPage = "errorLang"
                }
            }
            model["title"] = PageTitle
        }
        return ReturnPage
    }

    @GetMapping("/settings")
    fun displaySettingsHomepage(model: Model): String {
        var pageTitle = ""
        var statisticsLabel = ""
        var sidebarLabel = ""
        var sidebarElementAppearance = ""
        var sidebarElementGPIO = ""
        var sidebarElementCamera = ""
        var sidebarElementAudio = ""
        var sidebarWidthPx = ""
        var contentPadding = ""
        var ReturnPage = "settingsScreen"
        when (defaultLanguage) {
            "en_US" -> {
                pageTitle = pageTitle_en_US_Settings
                statisticsLabel = statisticsLabel_en_US_Settings
                sidebarLabel = sidebarLabel_en_US
                sidebarElementAppearance = sidebarElementAppearance_en_US
                sidebarElementGPIO = sidebarElementGPIO_en_US
                sidebarElementCamera = sidebarElementCamera_en_US
                sidebarElementAudio = sidebarElementAudio_en_US
                sidebarWidthPx = "250"
                contentPadding = "300"
            }
            "ru_RU" -> {
                pageTitle = pageTitle_ru_RU_Settings
                statisticsLabel = statisticsLabel_ru_RU_Settings
                sidebarLabel = sidebarLabel_ru_RU
                sidebarElementAppearance = sidebarElementAppearance_ru_RU
                sidebarElementGPIO = sidebarElementGPIO_ru_RU
                sidebarElementCamera = sidebarElementCamera_ru_RU
                sidebarElementAudio = sidebarElementAudio_ru_RU
                sidebarWidthPx = "350"
                contentPadding = "400"
            }
            "ua_UA" -> {
                pageTitle = pageTitle_ua_UA_Settings
                statisticsLabel = statisticsLabel_ua_UA_Settings
                sidebarLabel = sidebarLabel_ua_UA
                sidebarElementAppearance = sidebarElementAppearance_ua_UA
                sidebarElementGPIO = sidebarElementGPIO_ua_UA
                sidebarElementCamera = sidebarElementCamera_ua_UA
                sidebarElementAudio = sidebarElementAudio_ua_UA
                sidebarWidthPx = "350"
                contentPadding = "400"
            }
            else -> {
                ReturnPage = "errorLang"
            }
        }
        model["title"] = pageTitle
        model["label"] = statisticsLabel
        model["sidebar_label"] = sidebarLabel
        model["sidebar_element_appearance"] = sidebarElementAppearance
        model["sidebar_element_gpio"] = sidebarElementGPIO
        model["sidebar_element_camera"] = sidebarElementCamera
        model["sidebar_element_audio"] = sidebarElementAudio
        model["sidebar_width_px"] = sidebarWidthPx
        model["content_padding"] = contentPadding
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
        var sidebarLabel = ""
        var sidebarElementAppearance = ""
        var sidebarElementGPIO = ""
        var sidebarElementCamera = ""
        var sidebarElementAudio = ""
        var sidebarWidthPx = ""
        var contentPadding = ""
        var returnPage = "settingsAppearanceScreen"
        when (defaultLanguage) {
            "en_US" -> {
                pageTitle = pageTitle_en_US_SettingsAppearance
                labelTitle = labelTitle_en_US_SettingsAppearance
                themeSettingsLabel = "Theme"
                themeSelectDefault = "System default"
                themeSelectDark = "Dark"
                themeSelectLight = "Light"
                langSettingsLabel = "Language"
                sidebarLabel = "Settings"
                sidebarElementAppearance = "Appearance"
                sidebarElementGPIO = "Выводы"
                sidebarElementCamera = "Camera"
                sidebarElementAudio = "Audio"
                sidebarWidthPx = "250"
                contentPadding = "300"
            }
            "ru_RU" -> {
                pageTitle = pageTitle_ru_RU_SettingsAppearance
                labelTitle = labelTitle_ru_RU_SettingsAppearance
                themeSettingsLabel = "Тема"
                themeSelectDefault = "Системная"
                themeSelectDark = "Темная"
                themeSelectLight = "Светлая"
                langSettingsLabel = "Язык"
                sidebarLabel = "Настройки"
                sidebarElementAppearance = "Внешний вид"
                sidebarElementGPIO = "GPIO"
                sidebarElementCamera = "Камера"
                sidebarElementAudio = "Аудио"
                sidebarWidthPx = "350"
                contentPadding = "400"
            }
            "ua_UA" -> {
                pageTitle = pageTitle_ua_UA_SettingsAppearance
                labelTitle = labelTitle_ua_UA_SettingsAppearance
                themeSettingsLabel = "Тема"
                themeSelectDefault = "Системна"
                themeSelectDark = "Темна"
                themeSelectLight = "Світла"
                langSettingsLabel = "Мова"
                sidebarLabel = "Налаштування"
                sidebarElementAppearance = "Зовнішній вигляд"
                sidebarElementGPIO = "GPIO"
                sidebarElementCamera = "Камера"
                sidebarElementAudio = "Аудіо"
                sidebarWidthPx = "350"
                contentPadding = "400"
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
        model["sidebar_label"] = sidebarLabel
        model["sidebar_element_appearance"] = sidebarElementAppearance
        model["sidebar_element_gpio"] = sidebarElementGPIO
        model["sidebar_element_camera"] = sidebarElementCamera
        model["sidebar_element_audio"] = sidebarElementAudio
        model["sidebar_width_px"] = sidebarWidthPx
        model["content_padding"] = contentPadding
        return returnPage
    }
}