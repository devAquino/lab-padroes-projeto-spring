package one.digitalinnovation.gof.model;

public class InvalidCepException extends Exception{

    public InvalidCepException(String cep){
        super(String.format("Esse cep é inválido %s", cep));
    }
}
