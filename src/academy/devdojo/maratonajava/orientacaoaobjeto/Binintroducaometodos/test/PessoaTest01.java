package academy.devdojo.maratonajava.orientacaoaobjeto.Binintroducaometodos.test;

import academy.devdojo.maratonajava.orientacaoaobjeto.Binintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {


    Pessoa pessoa = new Pessoa();

    pessoa.setNome("Paulo");
    pessoa.setIdade(40);
    pessoa.imprime();
//        System.out.println(pessoa.getIdade());
//        System.out.println(pessoa.getNome());

    }
}
