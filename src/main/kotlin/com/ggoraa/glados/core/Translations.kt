@file:Suppress("FunctionName", "ClassName")

package com.ggoraa.glados.core

import com.ggoraa.glados.core.objects.mainDatabase.Translations
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.Query
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.transactions.transaction

// This file is used for translations.
// Values are generated using SQLite database.
// The refreshTranslations() function is used to fetch new data from database and create values for database. Typically used on startup and when changing values on-the-fly.

val db = Database.connect("jdbc:sqlite:/Users/egoryakovenko/Documents/GitHub/GLaDOS/databases/main.sqlite", "org.sqlite.JDBC")
@Suppress("FunctionName")

fun getRu_RUString(text: String): Query {
    return transaction(db) {
        Translations.slice(Translations.ru_RU).select {
            Translations.name eq text
        }
    }
}
fun getEn_USString(text: String): Query {
    return transaction(db) {
        Translations.slice(Translations.en_US).select {
            Translations.name eq text
        }
    }
}
fun getUa_UAString(text: String) {
    return transaction(db) {
        Translations.slice(Translations.ua_UA).select {
            Translations.name eq text
        }
    }
}
object Translations {
    object en_US {
        object Homepage {
            val pageTitle = "GLaDOS Control Panel"
        }
        object Settings {
            object Appearance {
                val pageTitle = "GLaDOS Settings: Appearance"
                val labelTitle = "Appearance"
            }
            val pageTitle = "GLaDOS Settings"
            val statisticsLabel = "Statistics"
            val sidebarLabel = "Settings"
            val sidebarElementAppearance = "Appearance"
            val sidebarElementGPIO = "GPIO"
            val sidebarElementCamera = "Camera"
            val sidebarElementAudio = "Audio"
        }
    }
    object ru_RU {
        object Homepage {
            val pageTitle = "Панель управления GLaDOS"
        }
        object Settings {
            object Appearance {
                val pageTitle = "Настройки GLaDOS: Внешний вид"
                val labelTitle = "Внешний вид"
            }
            val pageTitle = "Настройки GLaDOS"
            val statisticsLabel = "Статистика"
            val sidebarLabel = "Настройки"
            val sidebarElementAppearance = "Внешний вид"
            val sidebarElementGPIO = "GPIO"
            val sidebarElementCamera = "Камера"
            val sidebarElementAudio = "Аудио"
        }
    }
    object ua_UA {
        object Homepage {
            val pageTitle = "Панель Управління GLaDOS"
        }
        object Settings {
            object Appearance {
                val pageTitle = "Налаштування GLaDOS: Зовнішній вигляд"
                val labelTitle = "Зовнішній вигляд"
            }
            val pageTitle = "Налаштування GLaDOS"
            val statisticsLabel = "Статистика"
            val sidebarLabel = "Налаштування"
            val sidebarElementAppearance = "Зовнішній вигляд"
            val sidebarElementGPIO = "GPIO"
            val sidebarElementCamera = "Камера"
            val sidebarElementAudio = "Аудіо"
        }
    }
    fun refresh() {

    }
}