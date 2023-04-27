package academy.devdojo.maratonajava.Aintroducao;


public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        char caractere = '\u0041';
        String nome = "Qualquer texto";

        System.out.println("A idade é "+idade+" anos");
        System.out.println(verdadeiro);
        System.out.println("char"+caractere);
        System.out.println(numeroGrande);
        System.out.println(nome);

    }
}
