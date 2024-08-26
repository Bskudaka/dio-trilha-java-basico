package desafio.salario;

import java.util.Scanner;

public class CalcularSalario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Favor informar o salário (valor bruto): ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Favor informar o benefício adicional: ");
        double beneficioAdicional = sc.nextDouble();

        double imposto = calcularImposto(salarioBruto);

        double salarioTransferido = (salarioBruto - imposto) + beneficioAdicional;

        System.out.printf("Salário a ser transferido para o funcionário é de R$: %.2f", salarioTransferido);

    }

    static double calcularImposto(double salarioBruto) {
        double imposto = 0;
        if (salarioBruto > 0 && salarioBruto <= 1100) {
            System.out.println("Imposto aplicado foi de 5%");
            return imposto = salarioBruto *= 0.05;
        } else if (salarioBruto > 1100 && salarioBruto <= 2500) {
            System.out.println("Imposto aplicado foi de 10%");
            return imposto = salarioBruto *= 0.1;
        } else {
            System.out.println("Imposto aplicado foi de 15%");
            return imposto = salarioBruto *= 0.15;
        }
    }
}
