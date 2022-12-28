package com.ctseducare.contactbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ctseducare.contactbook.model.Contact;
import com.ctseducare.contactbook.repository.ContactRepository;

@Controller
public class ContactController {

    @Autowired
    ContactRepository repository;

    @GetMapping("/contacts")
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView("Contact");
        modelAndView.addObject("contacts", repository.findAll());
        modelAndView.addObject("contact", new Contact());
        return modelAndView;
    }

    @PostMapping("/contacts")
    public String save(Contact contact) {
        repository.save(contact);
        return "redirect:/contacts";
    }

}
