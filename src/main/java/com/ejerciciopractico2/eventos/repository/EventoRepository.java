/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejerciciopractico2.eventos.repository;
import com.ejerciciopractico2.eventos.domain.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Donovan
 */
public interface EventoRepository extends JpaRepository<Evento, Long> {
 
List<Evento> findByActivo(boolean activo);

List<Evento> findByNombreContaining(String nombre);

List<Evento> findByFechaBetween(Date inicio, Date fin);  
}
