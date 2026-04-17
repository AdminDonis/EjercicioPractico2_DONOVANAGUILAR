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
import java.util.List;

public interface UsuarioService {

    public List<Usuario> getUsuarios();

    public Usuario getUsuario(Usuario usuario);

    public void save(Usuario usuario);

    public void delete(Usuario usuario);
}