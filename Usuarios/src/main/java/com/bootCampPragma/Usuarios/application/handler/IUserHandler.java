package com.bootCampPragma.Usuarios.application.handler;

import com.bootCampPragma.Usuarios.application.dto.request.UserRequestDto;

public interface IUserHandler {
    void saveUser(UserRequestDto userRequestDto);
}
