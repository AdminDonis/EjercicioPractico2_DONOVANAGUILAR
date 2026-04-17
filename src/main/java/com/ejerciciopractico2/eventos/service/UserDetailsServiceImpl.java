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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

@Override
public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    Usuario usuario = usuarioRepository.findByEmail(email);
    
    if (usuario == null) {
        throw new UsernameNotFoundException("Usuario no encontrado: " + email);
    }

    if (usuario.getRol() == null || usuario.getRol().getNombre() == null) {
        throw new UsernameNotFoundException("El usuario no tiene un rol asignado");
    }
    
    return User.builder()
        .username(usuario.getEmail())
        .password(usuario.getPassword())
        .roles(usuario.getRol().getNombre()) 
        .build();
}
}
