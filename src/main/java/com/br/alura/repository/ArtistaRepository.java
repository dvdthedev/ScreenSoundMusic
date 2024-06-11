package com.br.alura.repository;

import com.br.alura.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArtistaRepository extends JpaRepository<Artista, Long> {

}
