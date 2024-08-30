package desafio.steamapi;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTeste {

    /**
     * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
     * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
     */

    public static void main(String[] args) {

        Supplier<String> saudacao = () -> "Olá, seja bem vindo!";

        List<String> saudacoes = Stream.generate(() -> "Olá, seja bem vindo!")
                .limit(5)
                .toList();

        List<String> saudacoes2 = Stream.generate(saudacao)
                .limit(5)
                .toList();

        List<Integer> numeros = Stream.generate(() -> 1)
                        .limit(5)
                                .toList();

        numeros.forEach(System.out::println);

        saudacoes.forEach(System.out::println);
        System.out.println("\nSaudações2: ");
        saudacoes2.forEach(System.out::println);
    }

}
