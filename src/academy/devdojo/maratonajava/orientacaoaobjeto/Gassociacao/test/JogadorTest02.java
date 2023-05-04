package academy.devdojo.maratonajava.orientacaoaobjeto.Gassociacao.test;

import academy.devdojo.maratonajava.orientacaoaobjeto.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.orientacaoaobjeto.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
