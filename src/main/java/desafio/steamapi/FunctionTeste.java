package desafio.steamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTeste {

    /**
     * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
     * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
     */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Function<Integer, Integer> dobrar = n -> n * 2;

        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .toList();

        List<Integer> numerosDobrados2 = numeros.stream()
                .map(n -> n * 2)
                .toList();

        System.out.println("numeros");
        numeros.forEach(System.out::println);

        numerosDobrados.forEach(System.out::println);
        System.out.println("\nNumerosDobrados2");
        numerosDobrados2.forEach(System.out::println);

    }

}
