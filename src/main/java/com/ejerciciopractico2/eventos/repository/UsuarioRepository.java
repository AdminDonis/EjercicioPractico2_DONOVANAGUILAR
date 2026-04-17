/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejerciciopractico2.eventos.repository;

import com.ejerciciopractico2.eventos.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Donovan
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByEmail(String email);

}