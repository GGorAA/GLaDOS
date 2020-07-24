package com.ggoraa.glados.core.`object`

import org.jetbrains.exposed.dao.id.IntIdTable

object mainDatabase_deviceSettings : IntIdTable() {
    val name = text("name")
    val GPIO = integer("gpio")
    val state = integer("state")
    val onLaunchState = integer("on_launch_state")
}