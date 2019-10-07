package com.softvision.training.api;

import com.softvision.training.dto.Contact;
import com.softvision.training.service.ContactService;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ContactsApi {

    @Autowired
    ContactService contactService;

    @Autowired
    Mapper mapper;

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public Contact getById() {
        return new Contact(1L, "John", "Doe", "+57 311 222 3344", "john@sinbugs.com");
    }

    @RequestMapping(value="/contact", method = RequestMethod.POST)
    public ContactResponse updateOrSave(@RequestBody @Valid ContactRequest contactRequest) {
        /**Map into contact with the request **/
        Contact contact = mapper.map(contactRequest, Contact.class);

        /**Update contact with de mapping result **/
        Contact updatedContact = contactService.save(contact);

        /**Map with the response **/
        ContactResponse contactResponse = mapper.map(updatedContact, ContactResponse.class);

        return contactResponse;
    }
}
