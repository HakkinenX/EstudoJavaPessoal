package academy.devdojo.maratonajava.javacore.Binintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Binintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

//        utiliza imprime dentro da classe estudante para impressão

        estudante01.imprime();
        estudante02.imprime();

    }
}
