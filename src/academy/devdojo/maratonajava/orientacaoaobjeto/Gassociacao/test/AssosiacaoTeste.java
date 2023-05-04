package academy.devdojo.maratonajava.orientacaoaobjeto.Gassociacao.test;

import academy.devdojo.maratonajava.orientacaoaobjeto.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.orientacaoaobjeto.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.orientacaoaobjeto.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.orientacaoaobjeto.Gassociacao.dominio.Seminario;

public class AssosiacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjos");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
