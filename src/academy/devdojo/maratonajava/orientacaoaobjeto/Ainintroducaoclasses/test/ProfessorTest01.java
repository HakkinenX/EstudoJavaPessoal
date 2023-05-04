package academy.devdojo.maratonajava.orientacaoaobjeto.Ainintroducaoclasses.test;

import academy.devdojo.maratonajava.orientacaoaobjeto.Ainintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Paulera";
        professor.sexo = 'M';
        professor.idade = 28;
        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
