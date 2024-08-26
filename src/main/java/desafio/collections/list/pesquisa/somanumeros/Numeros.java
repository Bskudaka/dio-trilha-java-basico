package desafio.collections.list.pesquisa.somanumeros;

public class Numeros {

    private int numero;

    public Numeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return String.valueOf(numero);
    }
}
