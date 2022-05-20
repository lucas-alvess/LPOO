package ComAbstrata;

abstract class Animal {
    private String nome;
    private int idade;

    public Animal(String aNome){
        this.nome = aNome;
        this.idade = 0;
    }

    public String getNome(){return this.nome;}
    public int getIdade(){return this.idade;}

    public void aumentaIdade(){this.idade++;}

    abstract public String fazBarulho();

    @Override
    public String toString(){
        String res = "";
        res += "Classe: " + this.getClass().getSimpleName() + "\n";
        res += "Nome: " + this.nome + "\n";
        res += "Idade: " + this.idade + "\n";
        res += "Barulho: " + this.fazBarulho() + "\n";
        return res;
    }

}
