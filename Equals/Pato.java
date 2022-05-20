package Equals;

import java.util.Objects;

class Pato implements Comparable<Pato> {
    String nome;
    int idade;

    public Pato(String aNome, int aIdade){
        this.nome = aNome;
        this.idade = aIdade;
    }

    // Implementação de equals
    @Override
    public boolean equals(Object o){

        // Verifica se é o mesmo objeto
        if(this==o){
            return true;}

        // Verifica se o outro objeto é nulo
        if(o==null){
            return false;}

        // Verifica se é a mesma classe
        if(this.getClass() != o.getClass()){
            return false;}


        // Como é o mesmo objeto, vamos tratar "o" como outro Pato
        Pato oPato = (Pato)o;

        // Delega a verificação de igualdade a classe Objects
        return Objects.equals(this.nome, oPato.nome) &&
               Objects.equals(this.idade, oPato.idade);
    }

    // Implementação de Compare<Pato>:
    // Primeiro pelo nome
    // Depois pela idade
    @Override
    public int compareTo(Pato o){
        // Compara primeiro pelo nome
        if(!this.nome.equals(o.nome)){
            return this.nome.compareTo(o.nome);
        }
        // Se o nome é igual, compara pela idade
        return Integer.compare(this.idade, o.idade);
    }

    @Override
    public String toString(){
        return "Pato(Nome = " + nome + ", idade = " + idade + ")";
    }

}
