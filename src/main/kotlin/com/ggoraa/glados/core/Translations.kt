package com.ggoraa.glados.core

import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.transactions.transaction

// This file is used for translations.
// Values are generated using SQLite database.
// The refreshTranslations() function is used to fetch new data from database and create values for database. Typically used on startup and when changing values on-the-fly.

val db = Database.connect("jdbc:sqlite:/Users/egoryakovenko/Documents/GitHub/GLaDOS/databases/main.sqlite", "org.sqlite.JDBC")

fun refreshTranslations() {

}

fun getTranslationString(text: String, lang: String) {
    transaction(db) {

    }
}
// Homepage
const val pageTitle_en_US_Homepage = "GLaDOS Control Panel"
const val pageTitle_ru_RU_Homepage = "Панель управления GLaDOS"
const val pageTitle_ua_UA_Homepage = "Панель Управління GLaDOS"

// Settings homepage
const val pageTitle_en_US_Settings = "GLaDOS Settings"
const val pageTitle_ru_RU_Settings = "Настройки GLaDOS"
const val pageTitle_ua_UA_Settings = "Налаштування GLaDOS"
const val statisticsLabel_en_US_Settings = "Statistics"
const val statisticsLabel_ru_RU_Settings = "Статистика"
const val statisticsLabel_ua_UA_Settings = "Статистика"
// Settings sidebar
const val sidebarLabel_en_US = "Settings"
const val sidebarLabel_ru_RU = "Настройки"
const val sidebarLabel_ua_UA = "Налаштування"
const val sidebarElementAppearance_en_US = "Appearance"
const val sidebarElementAppearance_ru_RU = "Внешний вид"
const val sidebarElementAppearance_ua_UA = "Зовнішній вигляд"
const val sidebarElementGPIO_en_US = "GPIO"
const val sidebarElementGPIO_ru_RU = "GPIO"
const val sidebarElementGPIO_ua_UA = "GPIO"
const val sidebarElementCamera_en_US = "Camera"
const val sidebarElementCamera_ru_RU = "Камера"
const val sidebarElementCamera_ua_UA = "Камера"
const val sidebarElementAudio_en_US = "Audio"
const val sidebarElementAudio_ru_RU = "Аудио"
const val sidebarElementAudio_ua_UA = "Аудіо"
// Settings appearance page
const val pageTitle_en_US_SettingsAppearance = "GLaDOS Settings: Appearance"
const val pageTitle_ru_RU_SettingsAppearance = "Настройки GLaDOS: Внешний вид"
const val pageTitle_ua_UA_SettingsAppearance = "Налаштування GLaDOS: Зовнішній вигляд"
const val labelTitle_en_US_SettingsAppearance = "Appearance"
const val labelTitle_ru_RU_SettingsAppearance = "Внешний вид"
const val labelTitle_ua_UA_SettingsAppearance = "Зовнішній вигляд"