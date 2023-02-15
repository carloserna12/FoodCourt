package com.bootCampPragma.Usuarios.infrastructure.output.entity;

import com.bootCampPragma.Usuarios.domain.model.Rol;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "userTable")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {
    private Long id;
    private String nombre;
    private String apellido;
    private Long documentoIdentidad;
    private String celular;
    private String email;
    private String contraseña;
    private Rol idRol;
}
