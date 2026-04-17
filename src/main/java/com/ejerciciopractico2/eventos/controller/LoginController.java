/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejerciciopractico2.eventos.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author Donovan
 */
@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String login() {
        return "login";  
    }
    
    @GetMapping("/")
    public String index() {
        return "redirect:/evento/listado";
    }
}