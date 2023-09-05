package br.com.etechoracio.condominus.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Morador")
public class Morador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_morador")
    private Long id;

    @Column(name = "nome_morador")
    private String Nome;

    @Column(name = "cpf_morador")
    private char cpf;

    @Column(name = "telefone_morador")
    private String telefone;

    @JoinColumn(name = "id_apartamento_morad")
    @ManyToOne
    private Apartamento apartamento;
}
