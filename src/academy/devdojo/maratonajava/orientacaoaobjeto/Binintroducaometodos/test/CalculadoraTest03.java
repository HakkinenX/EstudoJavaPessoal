package academy.devdojo.maratonajava.orientacaoaobjeto.Binintroducaometodos.test;

import academy.devdojo.maratonajava.orientacaoaobjeto.Binintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(10,0);
        System.out.println(resultado);
    }
}
