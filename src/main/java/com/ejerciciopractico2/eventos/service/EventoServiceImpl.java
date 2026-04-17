/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejerciciopractico2.eventos.service;
import com.ejerciciopractico2.eventos.domain.Evento;
import com.ejerciciopractico2.eventos.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
/**
 *
 * @author Donovan
 */
public class EventoServiceImpl implements EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    @Override
    public List<Evento> getEventos() {
        return eventoRepository.findAll();
    }

    @Override
    public Evento getEvento(Evento evento) {
        return eventoRepository.findById(evento.getId()).orElse(null);
    }

    @Override
    public void save(Evento evento) {
        eventoRepository.save(evento);
    }

    @Override
    public void delete(Evento evento) {
        eventoRepository.delete(evento);
    }
    @Override
public List<Evento> getEventosActivos(boolean activo) {
    return eventoRepository.findByActivo(activo);
}

@Override
public List<Evento> buscarPorNombre(String nombre) {
    return eventoRepository.findByNombreContaining(nombre);
}

@Override
public List<Evento> buscarPorFechas(Date inicio, Date fin) {
    return eventoRepository.findByFechaBetween(inicio, fin);
}
}