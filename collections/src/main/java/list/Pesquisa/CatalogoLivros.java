package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livros> livrosList;

    public CatalogoLivros(List<Livros> livrosList) {
        this.livrosList = new ArrayList<>();
    }


    public void adicionarLivro(String titulo, String autor, int anoPublicacao){

        livrosList.add(new Livros(titulo, autor, anoPublicacao));

    }

    public List<Livros> pesquisarPorAutor(String autor){

        List<Livros> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){

            for(Livros livro : livrosList){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }

        }

        return livrosPorAutor;
    }

    public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livros> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livros livro : livrosList){
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        }

        return livrosPorIntervaloAnos;

    }

    public Livros pesquisarPorTitulo(String titulo){
        Livros livroPorTitulo = null;
        if(!livrosList.isEmpty()){
            for(Livros livro : livrosList){
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                }
            }


            
        }

        return livroPorTitulo;
    }


    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros(null);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);
    
        // System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1990, 2021));
      }

}


