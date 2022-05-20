package ComAbstrata;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    static public void main(String[] args){
        
        List <Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Jooje"));
        animais.add(new Gato("Nina"));
        animais.add(new Pato("Cleiton"));

        for(Animal a: animais){
            System.out.println(a);
        }

        for(Animal a: animais){
            a.aumentaIdade();
        }

        for(Animal a: animais){
            System.out.println(a);
        }
    }    
}
