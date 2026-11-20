package com.vsiaf.examen.controller;

import com.vsiaf.examen.model.Estado;
import com.vsiaf.examen.service.EstadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/estado")
@CrossOrigin(origins = "*")
public class EstadoController {

    private final EstadoService service;

    public EstadoController(EstadoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Estado> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Optional<Estado> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Estado crear(@RequestBody Estado estado) {
        return service.crear(estado);
    }

    @PutMapping("/{id}")
    public Optional<Estado> actualizar(@PathVariable Long id, @RequestBody Estado estado) {
        return service.actualizar(id, estado);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}