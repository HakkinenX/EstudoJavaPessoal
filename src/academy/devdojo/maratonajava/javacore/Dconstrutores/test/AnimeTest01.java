package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {


    public static void main(String[] args) {
        Anime anime = new Anime("Naruto","Anime",255,"Fantasia","Hebert");
       // anime.init("Naruto","Fantasia",255,"Animação");

        anime.imprime();
    }
}
