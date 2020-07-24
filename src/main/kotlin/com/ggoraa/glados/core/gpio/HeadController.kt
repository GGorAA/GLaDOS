package com.ggoraa.glados.core.gpio

import com.ggoraa.glados.core.`object`.mainDatabase_deviceSettings
import org.jetbrains.exposed.sql.Database

class HeadController {
    val db = Database.connect("jdbc:sqlite:/Users/egoryakovenko/Documents/GitHub/GLaDOS/databases/main.sqlite", "org.sqlite.JDBC")
    val getData = mainDatabase_deviceSettings
}

