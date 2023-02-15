package com.bootCampPragma.Usuarios.application.handler.impl;

import com.bootCampPragma.Usuarios.application.dto.request.UserRequestDto;
import com.bootCampPragma.Usuarios.application.handler.IUserHandler;
import com.bootCampPragma.Usuarios.application.mapper.IUserRequestMapper;
import com.bootCampPragma.Usuarios.application.mapper.IUserResponseMapper;
import com.bootCampPragma.Usuarios.domain.api.IUserServicePort;
import com.bootCampPragma.Usuarios.domain.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class UserHandler implements IUserHandler {
    private final IUserServicePort userServicePort;
    private final IUserRequestMapper userRequestMapper;
    private final IUserResponseMapper userResponseMapper;
    @Override
    public void saveUser(UserRequestDto userRequestDto) {
        UserModel userModel = userRequestMapper.toUser(userRequestDto);
        userServicePort.saveUser(userModel);

    }
}
