package SemAbstrata;
public class Teste {
    static public void main(String []args){
        Cachorro cachorro = new Cachorro("Brutus");
        Gato gato = new Gato("Nina");
        Pato pato = new Pato("Donald");

        System.out.println(cachorro);
        System.out.println(gato);
        System.out.println(pato);

        cachorro.aumentaIdade();
        gato.aumentaIdade();
        pato.aumentaIdade();

        System.out.println(cachorro);
        System.out.println(gato);
        System.out.println(pato);
    }
}
