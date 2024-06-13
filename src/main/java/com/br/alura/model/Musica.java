package com.br.alura.model;

import jakarta.persistence.*;

@Entity
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String album;

    @ManyToOne
    @JoinColumn(name = "artista_id")
    private Artista artista;



    public Musica(){}

    public Musica(String nomeMusica, String album) {
        this.titulo = nomeMusica;
        this.album = album;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return  "titulo='" + titulo + '\'' +
                ", album='" + album + '\'';
    }
}
