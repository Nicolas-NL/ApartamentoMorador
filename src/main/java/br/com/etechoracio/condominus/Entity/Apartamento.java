package br.com.etechoracio.condominus.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name="Apartamento")

public class Apartamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_apartamento")
    private Long id;
    @Column(name = "telefone_apartamento")
    private String telefone;
    @Column(name = "numero")
    private String numero;
}

