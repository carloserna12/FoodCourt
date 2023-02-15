package com.bootCampPragma.Usuarios.domain.usecase;

import com.bootCampPragma.Usuarios.domain.api.IUserServicePort;
import com.bootCampPragma.Usuarios.domain.model.UserModel;
import com.bootCampPragma.Usuarios.domain.spi.IUserPersistencePort;

public class UserUseCase implements IUserServicePort {
    private final IUserPersistencePort userPersistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public void saveUser(UserModel usermodel) {
        userPersistencePort.saveUser(usermodel);
    }
}
