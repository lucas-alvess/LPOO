package Equals;

import java.util.Set;
import java.util.TreeSet;

class SetPatoTeste {
    static public void main (String[] args){
        Set<Pato> patos = new TreeSet<>();

        patos.add(new Pato("Malakoi", 10));
        patos.add(new Pato("Jonas", 10));
        patos.add(new Pato("Malakoi", 15));
        patos.add(new Pato("Jonas", 15));
        patos.add(new Pato("Malakoi", 15));
        patos.add(new Pato("Jonas", 15));

        System.out.println("Tamanho: " + patos.size());
        System.out.println("Conjunto: " + patos);

        System.out.println("Conjunto contem o Malako, 10?" + patos.contains(new Pato("Malako", 10)));
        System.out.println("Conjunto contem o Malako, 5? " + patos.contains(new Pato("Malako", 5)));

        patos.add(new Pato("Malako", 10));

        System.out.println("Tamanho: " + patos.size());
        System.out.println("Conjunto: " + patos);

        patos.remove(new Pato("Malako", 10));

        System.out.println("Conjunto: " + patos);
        System.out.println("Cojunto contem o Malakoi, 10? " + patos.contains(new Pato("Malakoi", 10)));

        for(Pato p: patos){
            System.out.println(p);
        }

    }

}
