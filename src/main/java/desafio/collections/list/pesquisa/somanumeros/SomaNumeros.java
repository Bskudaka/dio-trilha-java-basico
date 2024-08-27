package desafio.collections.list.pesquisa.somanumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Numeros> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosList.add(new Numeros(numero));
    }

    public void calcularSoma() {
        int valorTotal = -0;
//        Iterator<Numeros> iterator = numerosList.iterator();
//        while (iterator.hasNext()){
//            Numeros numero = iterator.next();
//            valorTotal += numero.getNumero();
//        }

        for (Numeros n : numerosList) {
            valorTotal += n.getNumero();
        }
        System.out.println("Valor total das somas: " + valorTotal);
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        for (Numeros n : numerosList) {
            if (n.getNumero() > maiorNumero) {
                maiorNumero = n.getNumero();
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        for (Numeros n : numerosList) {
            if (n.getNumero() <= menorNumero) {
                menorNumero = n.getNumero();
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(numerosList);
    }

}
