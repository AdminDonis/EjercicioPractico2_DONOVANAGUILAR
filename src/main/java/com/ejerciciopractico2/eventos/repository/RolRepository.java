/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejerciciopractico2.eventos.repository;

/**
 *
 * @author Donovan
 */
import com.ejerciciopractico2.eventos.domain.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RolRepository extends JpaRepository<Rol, Long> {
    
}
