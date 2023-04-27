package academy.devdojo.maratonajava.javacore.Ainintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Ainintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fiat";
        carro1.ano = 2014;
        carro1.modelo = "Chevrolet";

        System.out.println();

        carro2.nome = "Ferrari";
        carro2.ano = 2018;
        carro2.modelo = "chevrolet";

        carro1 = carro2;

        System.out.println(carro1.nome + " " + carro1.ano + " " + carro1.modelo);
        System.out.println(carro2.nome + " " + carro2.ano + " " + carro2.modelo);

    }
}
