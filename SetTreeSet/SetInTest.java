package SetTreeSet;

import java.util.Set;
import java.util.TreeSet;

public class SetInTest {
    static public void main (String[]args){
        Set<Integer> numeros = new TreeSet<>();

        numeros.add(5);
        numeros.add(8);
        numeros.add(3);
        numeros.add(9);
        numeros.add(1);

        System.out.println("Tamanho: " + numeros.size());
        System.out.println("Conjunto: " + numeros);

        System.out.println("Conjunto contem o 5? " + numeros.contains(5));
        System.out.println("Conjunto contem o 0?" + numeros.contains(0));

        numeros.add(5);
        numeros.add(5);
        numeros.add(5);

        System.out.println("Tamanho: " + numeros.size());
        System.out.println("Conjunto: " + numeros);

        numeros.remove(5);

        System.out.println("Conjunto depois de remover o 5: " + numeros);
        System.out.println("Conjunto contem o 5?" + numeros.contains(5));

        for(int n: numeros){
            System.out.println(n);
        }
    }
}
