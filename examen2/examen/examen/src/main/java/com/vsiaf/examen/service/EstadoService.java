package com.vsiaf.examen.service;

import com.vsiaf.examen.model.Estado;
import com.vsiaf.examen.repository.EstadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    private final EstadoRepository repository;

    public EstadoService(EstadoRepository repository) {
        this.repository = repository;
    }

    public List<Estado> listar() {
        return repository.findAll();
    }

    public Optional<Estado> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Estado crear(Estado estado) {
        estado.setCodestado(null);
        return repository.save(estado);
    }

    public Optional<Estado> actualizar(Long id, Estado datos) {
        return repository.findById(id).map(existente -> {
            existente.setNomestado(datos.getNomestado());
            return repository.save(existente);
        });
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}