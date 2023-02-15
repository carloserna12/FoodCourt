package com.bootCampPragma.Usuarios.application.mapper;

import com.bootCampPragma.Usuarios.application.dto.request.UserRequestDto;
import com.bootCampPragma.Usuarios.domain.model.UserModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IUserRequestMapper {
    UserModel toUser(UserRequestDto userRequestDto);
}
