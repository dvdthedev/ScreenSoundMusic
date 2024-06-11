package com.br.alura.principal;

import com.br.alura.model.Artista;
import com.br.alura.model.Genero;
import com.br.alura.model.Integrantes;
import com.br.alura.repository.ArtistaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private List<Artista> artistas = new ArrayList<>();
    private ArtistaRepository repositorio;

    public Principal(ArtistaRepository repositorio) {this.repositorio = repositorio;}

    public void exibeMenu() {
        var opcao = -1;
        while(opcao != 0) {
            var menu = """
                    1- Cadastrar artistas 
                    2- Cadastrar músicas 
                    3- Listar músicas 
                    4- Buscar música por artistas 
                    5- Pesquisar dados sobre um artista
                                    
                    0 - Sair                                 
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarArtista();
                    break;
                case 2:
                    cadastrarMusica();
                    break;
                case 3:
                    listarMusica();
                    break;
                case 4:
                    buscarMusicaPorArtista();
                    break;
                case 5:
                    dadosArtista();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }


    private void dadosArtista() {

    }

    private void buscarMusicaPorArtista() {
    }

    private void listarMusica() {
    }

    private void cadastrarMusica() {
    }

    private void cadastrarArtista() {
        System.out.println("Insira o nome de um artista, dupla ou grupo");
        var artista = leitura.nextLine();
        System.out.println("É solo, dupla ou grupo?");
        var integrantes = leitura.nextLine();
        System.out.println("Qual o genêro músical?");
        var genero = leitura.nextLine();
        var novoArtista = new Artista(artista, Integrantes.fromPortugues(integrantes), Genero.fromString(genero));
        artistas.add(novoArtista);
        repositorio.save(novoArtista);
        System.out.println(novoArtista);

    }

}
