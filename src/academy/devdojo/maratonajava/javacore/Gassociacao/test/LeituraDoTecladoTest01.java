package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Escreva seu nome abaixo:");
        String nome = Entrada.nextLine();
        System.out.println("Escreva sua Idade abaixo:");
        int idade = Entrada.nextInt();
        System.out.println("Escreva M para masculino e F para feminino :");
        char sexo = Entrada.next().charAt(0);

        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Sexo: "+ sexo);
    }
}
