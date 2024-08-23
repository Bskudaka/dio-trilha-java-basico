package desafio.telefonia;

import java.util.Scanner;

public class ServicoTelefonica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Favor informar o tipo de serviço: ");
        String servico = sc.nextLine().trim();

        System.out.printf("Informe o nome do cliente e separando por vírgula os tipos de serviços: ");
        String nomeCliente = sc.nextLine().trim();

        String[] partes = nomeCliente.split(",");

        boolean contratado = verificarServicoContratado(partes, servico);

        servicoEstaContradado(contratado);

        sc.close();
    }

    static void servicoEstaContradado(boolean contratado) {
        if (contratado) {
            System.out.println("Sim");
        } else {
            System.out.printf("Nao");
        }
    }

    static boolean verificarServicoContratado(String[] partes, String servico) {
        boolean contratado = false;
        for (String parte : partes) {
            if (parte.equalsIgnoreCase(partes[0])) {
                continue;
            }
            if (parte.trim().equalsIgnoreCase(servico)) {
                return contratado = true;
            }
        }
        return false;
    }

}