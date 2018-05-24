package com.example.demo.controller

import com.example.demo.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping(path = "/persons")
@Controller
class PersonController {

    @Autowired
    PersonRepository personRepository

    @GetMapping
    String fetchProduct(Model model) {
        model.addAttribute("persons", personRepository.findAll())
        "persons/list"
    }
}
