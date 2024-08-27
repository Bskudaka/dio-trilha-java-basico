package desafio.collections.list.ordenacao.numeros;

import java.util.List;

public class TesteOrdenacaoNumero {

    public static void main(String[] args) {

        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(1);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(6);
        numeros.adicionarNumero(100);


        List<Integer> listaAscendente = numeros.ordenarAscendente();
        System.out.println(listaAscendente);

        List<Integer> listaDescendente = numeros.ordenarDescendente();
        System.out.println(listaDescendente);


    }
}
