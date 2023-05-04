package academy.devdojo.maratonajava.orientacaoaobjeto.Gassociacao.test;

import academy.devdojo.maratonajava.orientacaoaobjeto.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.orientacaoaobjeto.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya Sensei");
        Professor[] professores = {professor};
        Escola escola = new Escola ("Konoha", professores);

        escola.imprime();
    }
}
