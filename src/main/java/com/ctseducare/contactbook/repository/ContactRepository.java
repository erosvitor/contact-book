package com.ctseducare.contactbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctseducare.contactbook.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
