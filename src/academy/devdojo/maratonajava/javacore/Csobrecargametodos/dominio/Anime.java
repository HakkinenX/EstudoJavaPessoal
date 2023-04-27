package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int epsodios;
    private String genero;

    public void init(String nome, String tipo, int epsodios){
        this.nome = nome;
        this.tipo = tipo;
        this.epsodios = epsodios;
    }

    public void init(String nome, String tipo, int epsodios, String genero){
        this.init(nome,tipo,epsodios);
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.epsodios);
        System.out.println(this.nome);
        System.out.println(this.tipo);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpsodios() {
        return epsodios;
    }

    public void setEpsodios(int epsodios) {
        this.epsodios = epsodios;
    }
}
