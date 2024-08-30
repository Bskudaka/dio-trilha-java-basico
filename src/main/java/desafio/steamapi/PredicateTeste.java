package desafio.steamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTeste {

    /**
     * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
     * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
     */

    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        Predicate<String> maisDeCincoPalavras = p -> p.length() > 5 ;

        palavras.stream()
                .filter(maisDeCincoPalavras)
                .forEach(System.out::println);

        System.out.println("\nPalavras2: ");
        palavras.stream()
                        .filter(p -> p.length() > 5)
                        .forEach(System.out::println);

        System.out.println("\nImprimindo numero pares que tem na lista: ");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Predicate<Integer> numeroPar = n -> n % 2 == 0;
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

    }

}
