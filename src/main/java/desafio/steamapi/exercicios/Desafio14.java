package desafio.steamapi.exercicios;

//Desafio 14 - Encontre o maior número primo da lista:
//Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Desafio14 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> numerosPrimos = numeros.stream()
                .filter(Desafio14::isPrimo)
                .max(Integer::compareTo);

        numerosPrimos.ifPresent(n -> System.out.println("Numeros primos: " + n));

    }

    static boolean isPrimo(int n){
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3 ; i <= Math.sqrt(n) ; i += 2){
            if (n % i == 0) return false;
        }

        return true;
    }
}
