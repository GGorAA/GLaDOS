package com.ggoraa.glados.core.objects.mainDatabase

import org.jetbrains.exposed.dao.id.IntIdTable

object DeviceSettings : IntIdTable() {
    val name = text("name")
    val GPIO = integer("gpio")
    val state = integer("state")
    val onLaunchState = integer("on_launch_state")
}