package desafio.steamapi.exercicios;

//Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
//Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.

import java.util.Arrays;
import java.util.List;

public class Desafio15 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5, -6, 7, 8, -9, -10, -5, 4, 3);

        List<Integer> numerosNegativos = numeros.stream()
                .filter(n -> n < 0)
                .sorted()
                .toList();

        System.out.println(numerosNegativos);
    }

}
