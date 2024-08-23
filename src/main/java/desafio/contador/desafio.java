package desafio.contador;

import java.util.Scanner;

public class desafio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informar o parametro 1: ");
        int parametroUm = sc.nextInt();

        System.out.print("Informar o parametro 2: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException();
        }
        int cotangem = parametroDois - parametroUm;
        for(int i = 0; i < cotangem; i++){
            System.out.println("Imprimindo o nº " + (i + 1));
        }
    }
}
