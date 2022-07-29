package com.softka.contactos.service.interfaces;

import com.softka.contactos.domain.Contacto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICrud {
    public List<Contacto> getList();

    public List<Contacto> searchContacto(String dataToSearch);

    public Contacto createContacto(Contacto newContacto);

    Contacto updateContacto(Integer id, Contacto contacto);

    Contacto deleteContacto(Integer id);
}
