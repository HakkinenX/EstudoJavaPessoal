package academy.devdojo.maratonajava.javacore.Binintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;


    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > 90) {
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

}
