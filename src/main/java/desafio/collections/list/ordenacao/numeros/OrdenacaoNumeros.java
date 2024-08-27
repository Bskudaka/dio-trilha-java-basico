package desafio.collections.list.ordenacao.numeros;

import desafio.collections.list.pesquisa.somanumeros.Numeros;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        System.out.println("Ordenação Ascendente: ");
        List<Integer> listaNumerosAscendente = new ArrayList<>(this.numerosList);
        Collections.sort(listaNumerosAscendente);
        return listaNumerosAscendente;
    }

    public List<Integer> ordenarDescendente() {
        System.out.println("Ordenação Descendente: ");
        List<Integer> numerosDescente = new ArrayList<>(numerosList);
        numerosDescente.sort(Collections.reverseOrder());
        return numerosDescente;
    }

}
