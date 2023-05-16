package com.example.Agenda.repositorio;

import com.example.Agenda.entidad.contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepositorio  extends JpaRepository<contacto,Integer> {
}


