package com.bootCampPragma.Usuarios.domain.spi;

import com.bootCampPragma.Usuarios.domain.model.UserModel;

public interface IUserPersistencePort {

    UserModel saveUser(UserModel userModel);
}
