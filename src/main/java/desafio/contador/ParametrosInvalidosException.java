package desafio.contador;

public class ParametrosInvalidosException extends RuntimeException {

    ParametrosInvalidosException(){
        super("Segundo parametro deve ser maior que o Parametro um");
    }


}
