package com.bootCampPragma.Usuarios.infrastructure.output.entity;

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

}
