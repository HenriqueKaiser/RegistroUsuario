package com.example.registrousuario.controler;

import com.example.registrousuario.entity.Usuario;
import com.example.registrousuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CadastroControler {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("usuario/{id}")

    public Usuario buscarUsuario(@PathVariable Long id) {
        return usuarioService.buscarUsuario(id);
    }

    @PostMapping("usuario")
    public Usuario cadastraUsuario(@RequestBody Usuario usuario) {
        return usuarioService.cadastrarUsuario(usuario);

    }

    @GetMapping("usuarios")
    public List<Usuario> buscarUsuarios() {
        return usuarioService.buscarUsuarios();
    }

    @PutMapping("atualizar/{id}")
    public Usuario atualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
        return usuarioService.atualizarUsuario(id, usuario);
    }


}

