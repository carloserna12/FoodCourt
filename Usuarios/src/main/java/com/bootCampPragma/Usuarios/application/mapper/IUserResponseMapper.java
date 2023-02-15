package com.bootCampPragma.Usuarios.application.mapper;
import com.bootCampPragma.Usuarios.application.dto.response.UserResponseDto;
import com.bootCampPragma.Usuarios.domain.model.UserModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IUserResponseMapper {

    UserResponseDto toUser(UserModel userModel);
}
