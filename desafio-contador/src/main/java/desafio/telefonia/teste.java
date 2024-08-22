package desafio.telefonia;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0].trim();
        boolean contratado = false;

        // Verifique se o serviço está na lista de serviços contratados usando for-each
        for (String parte : partes) {
            // Ignora o nome do cliente (que é a primeira parte)
            if (parte.equals(partes[0])) {
                continue;
            }

            // Verifica se o serviço atual corresponde ao serviço desejado
            if (parte.trim().equalsIgnoreCase(servico)) {
                contratado = true;
                break;
            }
        }

        // Exibe o resultado
        if (contratado) {
            System.out.println("O cliente " + nomeCliente + " contratou o serviço " + servico);
        } else {
            System.out.println("O cliente " + nomeCliente + " não contratou o serviço " + servico);
        }

        scanner.close();
    }

}

