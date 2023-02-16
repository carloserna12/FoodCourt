package com.bootCampPragma.Usuarios.domain.model;

public enum Rol {
    ADMINISTRADOR("Administrador"),
    PROPIETARIO("Propietario"),
    EMPLEADO("Empleado"),
    CLIENTE("Cliente");

    private String nombre;

    Rol(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
