package academy.devdojo.maratonajava.javacore.Binintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Binintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int Numero1 = 1;
        int Numero2 = 2;
        calculadora.alteraDoisNumeros(Numero1,Numero2);
        System.out.println("Dentro CalculadoraTest04");
        System.out.println("Numero1 "+Numero1);
        System.out.println("numero2 "+Numero2);

    }
}
