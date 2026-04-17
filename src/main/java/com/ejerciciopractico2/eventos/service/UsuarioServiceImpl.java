/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejerciciopractico2.eventos.service;

/**
 *
 * @author Donovan
 */
import com.ejerciciopractico2.eventos.domain.Usuario;
import com.ejerciciopractico2.eventos.repository.UsuarioRepository;
import com.ejerciciopractico2.eventos.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ejerciciopractico2.eventos.service.EmailService;
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }
    @Autowired
    private EmailService emailService;
    @Override
    public Usuario getUsuario(Usuario usuario) {
        return usuarioRepository.findById(usuario.getId()).orElse(null);
    }

    
    @Override
    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);

        emailService.enviarCorreo(usuario.getEmail());
    }

    @Override
    public void delete(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }
}
