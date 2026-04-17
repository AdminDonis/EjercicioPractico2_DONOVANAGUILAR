/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejerciciopractico2.eventos.service;
import com.ejerciciopractico2.eventos.domain.Rol;
import java.util.List;
/**
 *
 * @author Donovan
 */
public interface RolService {

    public List<Rol> getRoles();

    public Rol getRol(Rol rol);

    public void save(Rol rol);

    public void delete(Rol rol);
}