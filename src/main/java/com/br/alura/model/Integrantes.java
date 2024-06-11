package com.br.alura.model;

public enum Integrantes {
    SOLO("solo"),
    DUPLA("dupla"),
    GRUPO("grupo");

    private String integrantesArtista;

    Integrantes(String integrantesArtista) {
        this.integrantesArtista = integrantesArtista;
    }

    public static Integrantes fromPortugues(String text) {
        for (Integrantes integrantes : Integrantes.values()) {
            if (integrantes.integrantesArtista.equalsIgnoreCase(text.toLowerCase())) {
                return integrantes;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria de integrantes encontrada para a string fornecida: " + text);
    }
}
