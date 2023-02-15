package com.bootCampPragma.Usuarios.application.dto.request;

import com.bootCampPragma.Usuarios.domain.model.Rol;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {
    private String nombre;
    private String apellido;
    private String celular;
    private Long documentoIdentidad;
    private String email;
    private String contraseña;
    private Rol idRol;
}
