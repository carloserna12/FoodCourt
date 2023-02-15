package com.bootCampPragma.Usuarios.domain.exception;

public class InvalidEmailStructException extends RuntimeException{
    public InvalidEmailStructException() {
        super("La estructura del email es invalida");
    }
}
