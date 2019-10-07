package com.softvision.training.service;

import com.softvision.training.dao.ContactRepository;
import com.softvision.training.dto.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    ContactRepository dao;

    public Contact save(Contact contact) {
        return dao.saveAndFlush(contact);
    }


}
