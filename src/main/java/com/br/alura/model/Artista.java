package com.br.alura.model;

import com.br.alura.service.ConsultaChatGpt;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity


public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Integrantes integrantes;
    private String sobre;
    @Enumerated(EnumType.STRING)
    private Genero genero;

    @OneToMany(mappedBy = "artista", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Musica> musicasDoArtista = new ArrayList<>();

    public Artista(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integrantes getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Integrantes integrantes) {
        this.integrantes = integrantes;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Musica> getMusicasDoArtista() {
        return musicasDoArtista;
    }

    public void setMusicasDoArtista(List<Musica> musicasDoArtista) {
        this.musicasDoArtista = musicasDoArtista;
    }

    public Artista(String nome, Integrantes integrantes, Genero genero) {
        this.nome = nome;
        this.integrantes = integrantes;
        this.sobre = ConsultaChatGpt.obterTraducao(nome);
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nome='" + nome + '\'' +
                ", integrantes=" + integrantes +
                ", sobre='" + sobre + '\'' +
                ", genero=" + genero +
                ", musicasDoArtista=" + musicasDoArtista +
                '}';
    }
}
