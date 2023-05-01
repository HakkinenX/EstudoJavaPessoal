package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class AssosiacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjos");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca");
    }
}
