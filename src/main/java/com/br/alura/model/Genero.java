package com.br.alura.model;

public enum Genero {
    ROCK("rock"),
    SERTANEJO("sertanejo"),
    POP("pop"),
    MPB("mpb"),
    CLASSICA("clássica");

    private String generoMusical;

    Genero(String generoMusical){
        this.generoMusical = generoMusical;

    }

    public static Genero fromString(String text) {
        for (Genero categoria : Genero.values()) {
            if (categoria.generoMusical.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
}
