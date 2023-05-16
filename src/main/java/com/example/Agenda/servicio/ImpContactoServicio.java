package com.example.Agenda.servicio;

import com.example.Agenda.entidad.contacto;
import com.example.Agenda.repositorio.ContactoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpContactoServicio implements ContactoServicio{

    @Autowired
    private ContactoRepositorio contactoRepositorio;


    @Override
    public List<contacto> listarTodosLosContactos() {
        return contactoRepositorio.findAll();
    }

    @Override
    public contacto guardarContacto(contacto Contacto) {
        return contactoRepositorio.save(Contacto);
    }

    @Override
    public contacto obtenerContactoPorId(Integer Id) {
        return contactoRepositorio.findById(Id).get();
    }

    @Override
    public contacto actualizarContacto(contacto Contacto) {
        return contactoRepositorio.save(Contacto);
    }

    @Override
    public void Eliminar(contacto Contacto){
    contactoRepositorio.delete(Contacto);

        }
    }

