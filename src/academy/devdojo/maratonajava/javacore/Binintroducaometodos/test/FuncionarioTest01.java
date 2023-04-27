package academy.devdojo.maratonajava.javacore.Binintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Binintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sanji");
        funcionario.setIdade(50);
        funcionario.setSalarios(new double []{1200,2000.20,2000});
        funcionario.imprime();
        System.out.println(funcionario.getMedia());

    }
}
