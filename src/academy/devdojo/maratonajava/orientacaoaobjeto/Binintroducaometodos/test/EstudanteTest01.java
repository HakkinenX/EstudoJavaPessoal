package academy.devdojo.maratonajava.orientacaoaobjeto.Binintroducaometodos.test;

import academy.devdojo.maratonajava.orientacaoaobjeto.Binintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.orientacaoaobjeto.Binintroducaometodos.dominio.ImpressoraEstudante;
//Objetos do tipo referência | 49
public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante Impressora = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

//        Utiliza a impressora como impressão

        Impressora.Imprime(estudante01);
        Impressora.Imprime(estudante02);


    }
}
