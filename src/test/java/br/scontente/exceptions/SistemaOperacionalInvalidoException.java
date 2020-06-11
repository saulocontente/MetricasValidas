package br.scontente.exceptions;

public class SistemaOperacionalInvalidoException extends RuntimeException {

    public SistemaOperacionalInvalidoException(String mensagem, Throwable erro) {
        super(mensagem, erro);
    }

}
