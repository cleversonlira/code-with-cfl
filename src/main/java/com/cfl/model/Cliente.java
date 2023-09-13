package com.cfl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Cliente /*extends PanacheEntity*/ {
    @Id
    public Long id;
    public String nome;
    @Transient
    public String chave;
}
