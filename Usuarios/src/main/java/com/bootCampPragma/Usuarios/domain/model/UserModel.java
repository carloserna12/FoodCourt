package com.bootCampPragma.Usuarios.domain.model;

import com.bootCampPragma.Usuarios.domain.exception.InvalidDocumentException;
import com.bootCampPragma.Usuarios.domain.exception.InvalidEmailStructException;
import com.bootCampPragma.Usuarios.domain.exception.InvalidNumberPhoneException;

public class UserModel {

    private Long id;

    private String nombre;
    private String apellido;
    private Long documentoIdentidad;
    private String celular;
    private String email;
    private String contraseña;
    private  Rol idRol;

    public UserModel(Long id, String nombre, String apellido, Long documentoIdentidad, String celular, String email, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoIdentidad = documentoIdentidad;
        this.celular = celular;
        this.email = email;
        this.contraseña = contraseña;
        this.idRol = idRol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(Long documentoIdentidad) {
        if (!apellido.matches("\\d+")){
            throw new InvalidDocumentException();
        }
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        if (!email.matches("^\\+\\d{13}$")){
            throw new InvalidNumberPhoneException();
        }
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (!email.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {
            throw new InvalidEmailStructException();
        }
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


}
