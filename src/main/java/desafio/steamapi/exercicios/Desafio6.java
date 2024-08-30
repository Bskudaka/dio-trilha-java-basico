package desafio.steamapi.exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {

    //Desafio 6 - Verificar se a lista contém algum número maior que 10:
    //Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(11, 2, 30, 4, 5, 60, 7, 8, 9, 100, 5, 40, 3);

        numeros.stream().filter(n -> n > 10)
                .sorted()
                .forEach(System.out::println);

    }

}
