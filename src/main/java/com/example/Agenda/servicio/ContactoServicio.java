package com.example.Agenda.servicio;

import com.example.Agenda.entidad.contacto;

import java.util.List;

public interface ContactoServicio {
    public List<contacto> listarTodosLosContactos();

    public contacto guardarContacto (contacto Contacto);

    public contacto obtenerContactoPorId (Integer Id);

    public contacto actualizarContacto (contacto Contacto);

    public void Eliminar (contacto Contacto);


}
