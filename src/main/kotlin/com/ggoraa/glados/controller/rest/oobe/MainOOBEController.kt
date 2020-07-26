package com.ggoraa.glados.controller.rest.oobe

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.view.RedirectView

@RestController
class MainOOBEController {
    @GetMapping("/rest/oobe/setup/lang/{lang}")
    fun setupLanguage(
            @PathVariable lang: String
    ): RedirectView {
        return RedirectView("/oobe?page=2")
    }
}