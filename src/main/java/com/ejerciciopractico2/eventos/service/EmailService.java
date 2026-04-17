/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejerciciopractico2.eventos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
/**
 *
 * @author Donovan
 */
public class EmailService {
      @Autowired
    private JavaMailSender mailSender;

    public void enviarCorreo(String destino) {
        SimpleMailMessage mensaje = new SimpleMailMessage();
        mensaje.setTo(destino);
        mensaje.setSubject("Bienvenido");
        mensaje.setText("Bienvenido a la plataforma de eventos");

        mailSender.send(mensaje);
    } 
}
