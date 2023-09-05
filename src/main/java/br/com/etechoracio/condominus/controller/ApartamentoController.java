package br.com.etechoracio.condominus.controller;

import br.com.etechoracio.condominus.Entity.Apartamento;
import br.com.etechoracio.condominus.repository.ApartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
    @RestController
    @RequestMapping("/apartamentos")
    public class ApartamentoController {
        @Autowired
        private ApartamentoRepository repository;

        @GetMapping
        public List<Apartamento> buscarTodos() {

            return repository.findAll();
        }
        @GetMapping("/{id}")
        public Optional<Apartamento> buscarPorId(@PathVariable Long id){
            return repository.findById(id);
        }
    }
