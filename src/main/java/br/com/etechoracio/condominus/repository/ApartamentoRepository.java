package br.com.etechoracio.condominus.repository;

import br.com.etechoracio.condominus.Entity.Apartamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ApartamentoRepository  extends JpaRepository<Apartamento, Long>  {
}
