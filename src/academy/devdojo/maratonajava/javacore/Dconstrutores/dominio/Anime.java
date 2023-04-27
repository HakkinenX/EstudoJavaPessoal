package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int epsodios;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int epsodios,String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.epsodios = epsodios;
        this.genero = genero;
    }
    public Anime(String nome, String tipo, int epsodios,String genero,String estudio){
        this(nome, tipo,epsodios,genero);
        this.estudio = estudio;
    }
    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.epsodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }


}
