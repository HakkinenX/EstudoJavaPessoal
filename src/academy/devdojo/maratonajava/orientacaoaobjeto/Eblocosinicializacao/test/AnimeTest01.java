package academy.devdojo.maratonajava.orientacaoaobjeto.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.orientacaoaobjeto.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
