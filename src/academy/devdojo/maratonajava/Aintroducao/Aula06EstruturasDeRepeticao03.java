package academy.devdojo.maratonajava.Aintroducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break; // para break ser utilizado precisa está dentro de um switch ou um loop
            }
            System.out.println(i);

        }
    }
}
