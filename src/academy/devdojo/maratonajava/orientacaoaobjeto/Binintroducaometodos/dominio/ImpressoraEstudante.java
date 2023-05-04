package academy.devdojo.maratonajava.orientacaoaobjeto.Binintroducaometodos.dominio;
//Objetos do tipo referência | 49
//A copia não é alterada a não ser que
// seja alterado a passagem de parametro via referência
public class ImpressoraEstudante {
    public void Imprime(Estudante estudante) {

//        estudante.nome = "Gohan"; Aqui ele imprimira ambos apenas como gohan

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

//        estudante.nome = "Gohan; aqui ele imprimira ambos após a impressão do nome atual do metódo
//        e continuara mantenduo alterado apos o procedimento

    }
}
