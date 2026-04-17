/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejerciciopractico2.eventos.service;

import com.ejerciciopractico2.eventos.domain.Rol;
import com.ejerciciopractico2.eventos.repository.RolRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * @author Donovan
 */
public class RolServiceImpl implements RolService {

    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<Rol> getRoles() {
        return rolRepository.findAll();
    }

    @Override
    public Rol getRol(Rol rol) {
        return rolRepository.findById(rol.getId()).orElse(null);
    }

    @Override
    public void save(Rol rol) {
        rolRepository.save(rol);
    }

    @Override
    public void delete(Rol rol) {
        rolRepository.delete(rol);
    }
}
