package com.example.Agenda.controlador;

import com.example.Agenda.entidad.contacto;
import com.example.Agenda.servicio.ContactoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

public class ContactoControlador {
    @Autowired
    private ContactoServicio contactoServicio;

    @GetMapping("/")
    public String verPaginaDeInicio (Model modelo) {
        List<contacto> contactos = contactoServicio.listarTodosLosContactos();
        modelo.addAttribute("Contacto", contactos);
        return "index";
    }
        @GetMapping ("/registros")
        public String mostrarFormularioDeRegistrarContacto(Model modelo) {
            modelo.addAttribute("Contacto",new contacto());
            return "registros";
        }
       @PostMapping("/save")
        public String guardarContacto(@Validated contacto Contacto, BindingResult bindingResult,
                              RedirectAttributes redirect, Model model) {

        if(bindingResult.hasErrors()) {
            model.addAttribute("Contacto", Contacto);
            return "registros";

        }
        contactoServicio.guardarContacto(Contacto);
        redirect.addFlashAttribute ("msgExito", "El contacto ha sido agreado con éxito");
        return "redirect:/";

}

    }

