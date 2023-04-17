package com.example.exercicio.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "tb_Usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Usuario {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) //ele gera um ID automatico
  private long idUsuario;
  private String nome;
  private String sobreNome;
  @Column(unique=true)
  private String email;
  private LocalDate dataNascimento;
  private String senha;
  @ManyToOne
  @JoinColumn(name="idTipoUsuario")
  private TipoUsuario tipoUsuario;

    public Usuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }


}
