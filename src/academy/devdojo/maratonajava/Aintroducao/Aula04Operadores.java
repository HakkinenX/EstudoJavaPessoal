package academy.devdojo.maratonajava.Aintroducao;

public class Aula04Operadores {

    public static void main(String[] args) {

        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        //%
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDiferenteDeDez = 10 != 10.0;


        System.out.println("isDezMaiorQueVinte: "+ isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: "+ isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte: "+ isDezIgualADez);
        System.out.println("isDezIgualADez: "+ isDezIgualADez);
        System.out.println("isDiferenteDeDez: "+ isDiferenteDeDez);

        // && (AND)   || (OR)   ! (NOT)

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiVinte = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiTrinta" + isDentroDaLeiTrinta);
        System.out.println("isDentroDaLeiVinte" + isDentroDaLeiVinte);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        double playStationComprare = 5000;

        boolean isPlayStationComprar = valorTotalContaCorrente >= playStationComprare ||
                valorTotalContaPoupanca >= playStationComprare;
        System.out.println("É possível comprar o playstation? " + isPlayStationComprar);



        // =  +=  -=  *=  /=  %=

        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        // ++   --
        int contador = 0;
        contador += 1;
        contador ++;
        contador --;
        ++ contador;
        -- contador;
        int contador2 = 0;

        System.out.println(++contador2);
    }

}
