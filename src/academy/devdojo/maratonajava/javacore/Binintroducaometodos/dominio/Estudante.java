package academy.devdojo.maratonajava.javacore.Binintroducaometodos.dominio;
//Objetos do tipo referência | 49
public class Estudante {

    public String nome;
    public int idade;
    public char sexo;

    //this significa esse, leitura: Esse.nome
    //também considerado como uma variável de referência
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
