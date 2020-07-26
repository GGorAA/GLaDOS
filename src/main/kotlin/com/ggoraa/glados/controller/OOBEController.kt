@file:Suppress("LocalVariableName")

package com.ggoraa.glados.controller

import com.ggoraa.glados.config.defaultLanguage
import com.ggoraa.glados.config.passedOOBE
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Suppress("FunctionName")
@Controller
class OOBEController {
    @GetMapping("/oobe")
    fun OOBEHome(
            @RequestParam(value = "page", required = false, defaultValue = "1") page: Int, model: Model
    ): String? {
        var ReturnPage = ""
        var MainHeader = ""
        var SecondaryHeader = ""
        var SetDefaultsButton = ""
        var ThemeLight = ""
        var ThemeDark = ""
        var ThemeSystem = ""
        var DoneButton = ""
        if (passedOOBE) {
            ReturnPage = "errors/OOBEIsPassed"
        } else {
            when (page) {
                1 -> {
                    ReturnPage = "setup/start"
                }
                2 -> {
                    ReturnPage = "setup/gpio"
                    when (defaultLanguage) {
                        "en_US" -> {
                            MainHeader = "Let's setup GPIO."
                            SecondaryHeader = "Write in every field your GPIO numbers. If you followed build tutorial at wiring part, you can click 'Set defaults' button."
                            SetDefaultsButton = "Set defaults"
                            DoneButton = "Done"
                        }
                        "ru_RU" -> {
                            MainHeader = "Давайте настроим выводы GPIO."
                            SecondaryHeader = "Запишите в каждое поле свой номер GPIO. Если вы полностью следовали инструкции по сборке в части с подключением компонентов, вы можете нажать кнопку 'Установить стандартные'."
                            SetDefaultsButton = "Установить стандартные"
                            DoneButton = "Готово"
                        }
                        "ua_UA" -> {
                            MainHeader = "Давайте налаштуємо виходи GPIO."
                            SecondaryHeader = "Запишіть в кожне поле свій номер GPIO. Якщо ви повністю слідували інструкціЇ по збірці в частині з підключенням компонентів, ви можете нажати кнопку 'Встановити стандартні'"
                            SetDefaultsButton = "Встановити стандартні"
                            DoneButton = "Готово"
                        }
                    }
                    model["main_header"] = MainHeader
                    model["secondary_header"] = SecondaryHeader
                    model["set_defaults_button"] = SetDefaultsButton
                    model["done_button"] = DoneButton
                }
                3 -> {
                    when (defaultLanguage) {
                        "en_US" -> {
                            MainHeader = "Now let's setup your appearance."
                            SecondaryHeader = "Select your color theme."
                            ThemeLight = "Light"
                            ThemeDark = "Dark"
                            ThemeSystem = "System default"
                            DoneButton = "Done"
                        }
                        "ru_RU" -> {
                            MainHeader = "Теперь давайте настроим внешний вид."
                            SecondaryHeader = "Выберите свою цветовую тему."
                            ThemeLight = "Светлая"
                            ThemeDark = "Темная"
                            ThemeSystem = "Системная"
                            DoneButton = "Готово"
                        }
                    }
                    ReturnPage = "setup/appearance"
                    model["main_header"] = MainHeader
                    model["secondary_header"] = SecondaryHeader
                    model["theme_light"] = ThemeLight
                    model["theme_dark"] = ThemeDark
                    model["theme_system"] = ThemeSystem
                    model["done_button"] = DoneButton
                }
            }
        }
        return ReturnPage
    }
}