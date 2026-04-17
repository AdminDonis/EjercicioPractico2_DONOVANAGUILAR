/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejerciciopractico2.eventos.domain;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
/**
 *
 * @author Donovan
 */
public class Usuario {

       @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   

    private String nombre;

    @Column(name = "email")
    private String email;  

    private String password;

    private boolean activo;

    
    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;
}