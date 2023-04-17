package com.example.exercicio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.exercicio.model.TipoUsuario;
import com.example.repository.TipoUsuarioRepository;

@RestController
public class TipoUsuarioController {
  
  @PostMapping(value = "/tipoUsuarios")
  public TipoUsuario criarNovoTipoUsuario(@RequestBody TipoUsuario tipoUsuario) {
    return tipoUsuarioRepository.save(tipoUsuario);
  }

  @GetMapping(value = "/tipoUsuarios" )
  public List<TipoUsuario> obterTipoUsuario() {
    return tipoUsuarioRepository.findAll();
  }

  @GetMapping(value = "/tipoUsuarios/{id}")
  public Optional<TipoUsuario> obterTipoUsuarioPeloId(@PathVariable(value = "id")int id) {
    return tipoUsuarioRepository.findById(id);
  }

  @DeleteMapping(value = "tipoUsuarios/{id}")
  public String deletarTipoUsuarioPeloId(@PathVariable(value = "id") int id) {
      tipoUsuarioRepository.deleteById(id);

    return "Pessoa deletada com sucesso!";
  }

  @PutMapping(value = "/tipoUsurios")
  public TipoUsuario atualizarTipoUsuario(@RequestBody TipoUsuario tipoUsuario) {
    return tipoUsuarioRepository.save(tipoUsuario);

  }

  @Autowired
  private TipoUsuarioRepository tipoUsuarioRepository;

}
