package desafio;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Favor informar a quantidade de números: ");
        int quantidade = sc.nextInt();

        int numeros[] = new int[quantidade];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Favor informar o numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.printf("Numeros primos são: ");
        for (int numero: numeros){
            if (numero % 2 == 0){
                System.out.print(numero + " ");
            }
        }
        sc.close();
    }

}
