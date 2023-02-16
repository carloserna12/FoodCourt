package com.bootCampPragma.Usuarios.infrastructure.output.adapter;

import com.bootCampPragma.Usuarios.domain.model.UserModel;
import com.bootCampPragma.Usuarios.domain.spi.IUserPersistencePort;
import com.bootCampPragma.Usuarios.infrastructure.output.entity.UserEntity;
import com.bootCampPragma.Usuarios.infrastructure.output.mapper.IUserEntityMapper;
import com.bootCampPragma.Usuarios.infrastructure.output.repository.IUserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserJpaAdapter implements IUserPersistencePort {

    private final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;
    @Override
    public UserModel saveUser(UserModel userModel) {
        UserEntity userEntity = userRepository.save(userEntityMapper.toEntity(userModel));
        return userEntityMapper.toUserModel(userEntity);
    }
}
