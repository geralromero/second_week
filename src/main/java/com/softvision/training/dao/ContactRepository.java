package com.softvision.training.dao;

import com.softvision.training.dto.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}

/** Los parámetros de esta interfaz son: la entidad a gestionar (Contact)
 * y el tipo de dato de su clave primaria (Long) **/