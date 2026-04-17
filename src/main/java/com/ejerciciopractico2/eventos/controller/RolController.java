/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejerciciopractico2.eventos.controller;

import com.ejerciciopractico2.eventos.domain.Rol;
import com.ejerciciopractico2.eventos.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/rol")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = rolService.getRoles();
        model.addAttribute("roles", lista);
        return "rol/listado";
    }

    @GetMapping("/nuevo")
    public String nuevo(Rol rol) {
        return "rol/modifica";
    }

    @PostMapping("/guardar")
    public String guardar(Rol rol) {
        rolService.save(rol);
        return "redirect:/rol/listado";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(Rol rol) {
        rolService.delete(rol);
        return "redirect:/rol/listado";
    }

    @GetMapping("/modificar/{id}")
    public String modificar(Rol rol, Model model) {
        rol = rolService.getRol(rol);
        model.addAttribute("rol", rol);
        return "rol/modifica";
    }
}