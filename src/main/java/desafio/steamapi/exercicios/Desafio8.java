package desafio.steamapi.exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {

    //Desafio 8 - Somar os dígitos de todos os números da lista:
    //Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDigitos = numeros.stream()
                .map(String::valueOf)
                .flatMapToInt(s -> s.chars()) // Converte cada caractere da string em um fluxo de valores inteiros
                .map(c -> c - '0') //Converte o valor ASCII para o valor numérico correspondente
                .sum();

        System.out.println(somaDigitos);


    }

}
