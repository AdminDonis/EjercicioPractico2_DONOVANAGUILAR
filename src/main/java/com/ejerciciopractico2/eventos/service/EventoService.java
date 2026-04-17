/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejerciciopractico2.eventos.service;

import com.ejerciciopractico2.eventos.domain.Evento;
import java.util.List;
import java.util.Date;

/**
 *
 * @author Donovan
 */
public interface EventoService {

    public List<Evento> getEventos();

    public Evento getEvento(Evento evento);

    public void save(Evento evento);

    public void delete(Evento evento);
    public List<Evento> getEventosActivos(boolean activo);

public List<Evento> buscarPorNombre(String nombre);

public List<Evento> buscarPorFechas(Date inicio, Date fin);
}
