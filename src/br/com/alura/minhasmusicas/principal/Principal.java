package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("As Quatro Estações");
        musica.setArtista("Antonio Vivaldi");
        for (int i = 0; i < 10; i++) {
            musica.reproduz();
        }
        for (int i = 0; i < 150; i++) {
            musica.curte();
        }
        System.out.println("Quantidade de reproduções da música '" + musica.getTitulo() +
                 "' = " + musica.getTotalDeReproducoes());
        System.out.println("Número de curtidas = " + musica.getTotalDeCurtidas());
        System.out.println("Classificação da música = " + musica.getClassificacao());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Podcast podcast = new Podcast();
        podcast.setApresentador("Jô Soares");
        podcast.setTitulo("Entrevista com David Servan-Schriber");
        for (int i = 0; i < 8; i++) {
            podcast.reproduz();
        }
        for (int i = 0; i < 300; i++) {
            podcast.curte();
        }
        System.out.println("Número de reproduções do podcast = " + podcast.getTotalDeReproducoes());
        System.out.println("Número de curtidas do podcast = " + podcast.getTotalDeCurtidas());
        System.out.println("Classificação do podcast = " + podcast.getClassificacao());

        System.out.println("");

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(musica);
        minhasPreferidas.inclui(podcast);
    }
}
