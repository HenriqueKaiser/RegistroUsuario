package com.example.registrousuario.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
@Setter
@Getter

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private Long     id;
}
