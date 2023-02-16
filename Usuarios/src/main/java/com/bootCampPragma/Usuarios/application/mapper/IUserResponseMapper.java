package com.bootCampPragma.Usuarios.application.mapper;
import com.bootCampPragma.Usuarios.application.dto.response.UserResponseDto;
import com.bootCampPragma.Usuarios.domain.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IUserResponseMapper {

    UserResponseDto toResponse(UserModel userModel);
}
