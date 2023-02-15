package com.bootCampPragma.Usuarios.domain.exception;

public class InvalidNumberPhoneException extends RuntimeException{
    public InvalidNumberPhoneException() {
        super("La estructura del telefono es invalida");
    }
}
