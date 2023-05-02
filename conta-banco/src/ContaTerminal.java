import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
     
        int numero;
        String agencia, nomeCliente;
        double saldo = 237.47;

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor digite o seu nome: ");
        nomeCliente = sc.next();

        System.out.print("Por favor digite o numero da conta: ");
        numero = sc.nextInt();

        System.out.print("Por favor digite a sua agencia: ");
        agencia = sc.next();

        System.out.println("Olá" + " " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
