/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejerciciopractico2.eventos.controller;
import com.ejerciciopractico2.eventos.domain.Usuario;
import com.ejerciciopractico2.eventos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/usuario")
/**
 *
 * @author Donovan
 */
public class UsuarioController {
   @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = usuarioService.getUsuarios();
        model.addAttribute("usuarios", lista);
        return "usuario/listado";
    }

    @GetMapping("/nuevo")
    public String nuevo(Usuario usuario) {
        return "usuario/modifica";
    }

    @PostMapping("/guardar")
    public String guardar(Usuario usuario) {
        usuarioService.save(usuario);
        return "redirect:/usuario/listado";
    }

@GetMapping("/eliminar/{id}")
public String eliminar(Usuario usuario) {
    usuarioService.delete(usuario);
    return "redirect:/usuario/listado";
}

@GetMapping("/modificar/{id}")
public String modificar(Usuario usuario, Model model) {
    usuario = usuarioService.getUsuario(usuario);
    model.addAttribute("usuario", usuario);
    return "usuario/modifica";
}
}