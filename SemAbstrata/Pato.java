package SemAbstrata;
public class Pato {
    private String nome;
    private int idade;

    public Pato(String aNome){
        this.nome = aNome;
        this.idade = 0;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void aumentaIdade(){
        this.idade++;
    }

    public String fazBarulho(){
        return "Quack Quack";
    }

    @Override
    public String toString(){
        String res = "";
        res += "Classe: Pato\n";
        res += "Nome: " + this.nome + "\n";
        res += "Idade: " + this.idade + "\n";
        res += "Barulho: " + this.fazBarulho() + "\n";
        return res;
    }
}
