/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejerciciopractico2.eventos.controller;

import com.ejerciciopractico2.eventos.domain.Evento;
import com.ejerciciopractico2.eventos.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
@Controller
@RequestMapping("/evento")
/**
 *
 * @author Donovan
 */
public class EventoController {
 @Autowired
    private EventoService eventoService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = eventoService.getEventos();
        model.addAttribute("eventos", lista);
        return "evento/listado";
    }

    @GetMapping("/nuevo")
    public String nuevo(Evento evento) {
        return "evento/modifica";
    }

    @PostMapping("/guardar")
    public String guardar(Evento evento) {
        eventoService.save(evento);
        return "redirect:/evento/listado";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(Evento evento) {
        eventoService.delete(evento);
        return "redirect:/evento/listado";
    }

    @GetMapping("/modificar/{id}")
    public String modificar(Evento evento, Model model) {
        evento = eventoService.getEvento(evento);
        model.addAttribute("evento", evento);
        return "evento/modifica";
    }
   @GetMapping("/consulta")
public String consulta() {
    return "evento/consulta";
}

@PostMapping("/buscarNombre")
public String buscarNombre(@RequestParam String nombre, Model model) {
    var lista = eventoService.buscarPorNombre(nombre);
    model.addAttribute("eventos", lista);
    return "evento/listado";
}

@PostMapping("/buscarFechas")
public String buscarFechas(@RequestParam String inicio,
                           @RequestParam String fin,
                           Model model) {

    Date fechaInicio = java.sql.Date.valueOf(inicio);
    Date fechaFin = java.sql.Date.valueOf(fin);

    var lista = eventoService.buscarPorFechas(fechaInicio, fechaFin);
    model.addAttribute("eventos", lista);

    return "evento/listado";
}

@GetMapping("/activos")
public String activos(Model model) {
    var lista = eventoService.getEventosActivos(true);
    model.addAttribute("eventos", lista);
    return "evento/listado";
}
}
