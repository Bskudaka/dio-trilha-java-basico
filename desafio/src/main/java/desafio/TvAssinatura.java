package desafio;

import java.util.Scanner;

public class TvAssinatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Favor informar os serviços contratados separando por (,) vírgula: ");
        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();

    }

    // movel, banda larga, TV

    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // TODO: Itere sobre os serviços contratados
        for (String servico : servicosContratados) {

            if (servico.trim().equalsIgnoreCase("movel")) {
                movelContratado = true;
            }
            if (servico.trim().equalsIgnoreCase("banda larga")) {
                bandaLargaContratada = true;
            }
            if (servico.trim().equalsIgnoreCase("tv")) {
                tvContratada = true;
            }
        }

        boolean comboCompleto = movelContratado && bandaLargaContratada && tvContratada;

        // TODO: Verifique se todos os serviços foram contratados
        if (comboCompleto) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }


}
