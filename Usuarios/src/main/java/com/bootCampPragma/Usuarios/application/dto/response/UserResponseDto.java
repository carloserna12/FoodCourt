package com.bootCampPragma.Usuarios.application.dto.response;

import com.bootCampPragma.Usuarios.domain.model.Rol;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDto {
    private Long id;
    private String nombre;
    private String apellido;
    private String celular;
    private Long documentoIdentidad;
    private String email;
    private Rol idRol;
}
