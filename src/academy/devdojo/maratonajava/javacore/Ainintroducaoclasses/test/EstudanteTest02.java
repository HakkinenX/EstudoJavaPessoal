package academy.devdojo.maratonajava.javacore.Ainintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Ainintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);

        System.out.println("------------------------");

        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);
        System.out.println(estudante02.nome);
    }
}
