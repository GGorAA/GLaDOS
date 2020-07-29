package com.ggoraa.glados.core.gpio

import com.ggoraa.glados.core.objects.mainDatabase.DeviceSettings
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.transactions.transaction

class HeadController {
    val db = Database.connect("jdbc:sqlite:/Users/egoryakovenko/Documents/GitHub/GLaDOS/databases/main.sqlite", "org.sqlite.JDBC")
    val getData = transaction(db) {
        DeviceSettings.select {
            DeviceSettings.id eq 1
        }
    }
}

