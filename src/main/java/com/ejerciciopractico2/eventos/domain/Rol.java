/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejerciciopractico2.eventos.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "rol")
/**
 *
 * @author Donovan
 */
public class Rol {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
}