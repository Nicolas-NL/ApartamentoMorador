package br.com.etechoracio.condominus.repository;


import br.com.etechoracio.condominus.Entity.Morador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoradorRepository  extends JpaRepository<Morador, Long> {
}
