package com.bootCampPragma.Usuarios.domain.exception;

public class InvalidDocumentException extends RuntimeException{
    public InvalidDocumentException() {
        super("Documento de identidad invalido");
    }
}
