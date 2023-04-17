package com.example.exercicio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "tb_TipoUsuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoUsuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) //ele gera um ID automatico
  private long idTipoUsuario;
  private String nome;

}
