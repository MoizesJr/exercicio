package com.example.exercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exercicio.model.Usuario;
import com.example.repository.UsuarioRepository;

@RestController
@Service
public class UsuarioController {

  @PostMapping(value = "/usuarios")
  public Usuario criarNovoUsuario(@RequestBody Usuario usuario) {
    return usuarioRepository.save(usuario);
  }

  @GetMapping(value = "/usuarios")
  public List<Usuario> obterUsuario() {
    return usuarioRepository.findAll();
  }

  @GetMapping(value = "usuarios/{email}")
  public Usuario obterUsuarioPeloEmail(@PathVariable(value = "email") String email) {
    return usuarioRepository.findByEmail(email);
  }

  @DeleteMapping(value = "usuarios/{id}")
  public String deletarUsuarioPeloId(@PathVariable(value = "id") int id) {
    usuarioRepository.deleteById(id);

    return "Pessoa deletada com sucesso!";
  }

  @PutMapping(value = "/usurios")
  public Usuario atualizarUsuario(@RequestBody Usuario usuario) {
    return usuarioRepository.save(usuario);

  }

  @Autowired
  private UsuarioRepository usuarioRepository;

}
