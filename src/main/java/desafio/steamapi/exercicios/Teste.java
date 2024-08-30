package desafio.steamapi.exercicios;

import java.util.Optional;

public class Teste {

    public static void main(String[] args) {

        Optional<String> optionalValue = Optional.ofNullable("Bruno");
        String result = optionalValue.orElse("Default");
        System.out.println(result);

        Optional<String> optionalValue2 = Optional.ofNullable(null);
        String result2 = optionalValue2.orElseGet(() -> "Value from Supplier");
        System.out.println(result2);

    }

}
