package com.bootCampPragma.Usuarios.infrastructure.output.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import javax.validation.constraints.Email;

import javax.persistence.*;

@Entity
@Table(name= "user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column( nullable = false)
    private Long id;

    @Column(length = 50)
    private String nombre;

    @Column(length = 50)
    private String apellido;
   @Column(length = 50)
    private Long documentoIdentidad;
    @Column(length = 50)
    private String celular;
   // @Email
    @Column(length = 50)
    private String email;
    @Column(length = 50)
    private String contraseña;
    @Column(length = 50)
    private String idRol;
}
