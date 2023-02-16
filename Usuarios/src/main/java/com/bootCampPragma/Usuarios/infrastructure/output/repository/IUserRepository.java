package com.bootCampPragma.Usuarios.infrastructure.output.repository;

import com.bootCampPragma.Usuarios.infrastructure.output.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, Long>{

}
