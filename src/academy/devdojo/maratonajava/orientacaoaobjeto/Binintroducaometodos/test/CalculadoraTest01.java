package academy.devdojo.maratonajava.orientacaoaobjeto.Binintroducaometodos.test;

import academy.devdojo.maratonajava.orientacaoaobjeto.Binintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();

        System.out.println("Finalizando Soma");
        calculadora.subtraiDoisNumeros();


    }
}
