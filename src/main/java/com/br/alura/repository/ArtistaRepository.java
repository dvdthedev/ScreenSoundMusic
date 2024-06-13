package com.br.alura.repository;

import com.br.alura.model.Artista;
import com.br.alura.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface ArtistaRepository extends JpaRepository<Artista, Long> {

    Optional<Artista> findByNomeEqualsIgnoreCase(String artista);


    }
