package SetTreeSetString;

import java.util.Set;
import java.util.TreeSet;

public class SetStringTeste {
    static public void main (String[] args){
        Set<String> palavras = new TreeSet<>();

        palavras.add("Ana");
        palavras.add("ana");
        palavras.add("Beto");
        palavras.add("beto");
        palavras.add("Carlos");
        palavras.add("carlos");

        System.out.println("Tamanho: " + palavras.size());
        System.out.println("Conjunto : " + palavras);

        System.out.println("Conjunto contem Ana?" + palavras.contains("Ana"));
        System.out.println("Conjunto contem o Outra?" + palavras.contains("Outra"));

        palavras.add("Ana");
        palavras.add("Ana");
        palavras.add("Ana");
        palavras.add("Ana");
        palavras.add("Ana");

        System.out.println("Tamanho: " + palavras.size());
        System.out.println("Conjunto: " + palavras);
        System.out.println("Conjunto contem o Ana?" + palavras.contains("Ana"));

        palavras.remove("Ana");

        System.out.println("Conjunto depois de remover Ana: " + palavras);
        System.out.println("Conjunto contem o Ana? " + palavras.contains("Ana"));

        for(String p: palavras){
            System.out.println(p);
        }
    }
}
