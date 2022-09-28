package com.melvin.BackendDeveloperChallenge.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Pais {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = false)
    private String capital;
    @Column(nullable = false)
    private String regiao;
    @Column(nullable = false)
    private String subRegiao;
    @Column(nullable = false)
    private String area;
}
