package com.melvin.BackendDeveloperChallenge.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Data
public class Pais {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, unique = true)
    @Size(min = 2)
    private String nome;
    @Column(nullable = false)
    @Size(min = 2)
    private String capital;
    @Column(nullable = false)
    @Size(min = 2)
    private String regiao;
    @Column(nullable = false)
    @Size(min = 2)
    private String subRegiao;
    @Column(nullable = false)
    @Size(min = 2)
    private String area;
}
