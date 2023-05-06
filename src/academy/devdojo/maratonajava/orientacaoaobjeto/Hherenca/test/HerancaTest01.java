package academy.devdojo.maratonajava.orientacaoaobjeto.Hherenca.test;

import academy.devdojo.maratonajava.orientacaoaobjeto.Hherenca.dominio.Endereco;
import academy.devdojo.maratonajava.orientacaoaobjeto.Hherenca.dominio.Funcionario;
import academy.devdojo.maratonajava.orientacaoaobjeto.Hherenca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa("Manoela");
        pessoa.setCpf("777.777.777-77");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        System.out.println("--------");
        funcionario.setCpf("777.777.777-77");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
    }
}
