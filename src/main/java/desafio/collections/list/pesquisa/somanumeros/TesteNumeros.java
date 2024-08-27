package desafio.collections.list.pesquisa.somanumeros;

public class TesteNumeros {

    public static void main(String[] args) {

        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(1);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);

        numeros.exibirNumeros();

        int maiorNumero = numeros.encontrarMaiorNumero();
        System.out.println("Numero maior da lista: " + maiorNumero);

        int menorNumero = numeros.encontrarMenorNumero();
        System.out.println("Numero menor da lista: " + menorNumero);

        numeros.calcularSoma();


    }

}
