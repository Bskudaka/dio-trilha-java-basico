package desafio.steamapi.exercicios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Desafio7 {

    //Desafio 7 - Encontrar o segundo número maior da lista:
    //Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaiorNumero = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst();

        segundoMaiorNumero.ifPresent(n -> System.out.println("Segundo maior numero da lista: " + n));


    }

}
