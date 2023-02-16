package com.bootCampPragma.Usuarios.application.mapper;

import com.bootCampPragma.Usuarios.application.dto.request.UserRequestDto;
import com.bootCampPragma.Usuarios.domain.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IUserRequestMapper {
    UserModel toUser(UserRequestDto userRequestDto);
}
