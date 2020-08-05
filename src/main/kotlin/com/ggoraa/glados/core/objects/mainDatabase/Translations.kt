package com.ggoraa.glados.core.objects.mainDatabase

import org.jetbrains.exposed.sql.Table

object Translations : Table() {
    val name = text("name")
    val defaultValue = text("default")
    val en_US = text("en_US")
    val ru_RU = text("ru_RU")
    val ua_UA = text("ua_UA")
}