package com.bootCampPragma.Usuarios.infrastructure.output.mapper;

import com.bootCampPragma.Usuarios.domain.model.UserModel;
import com.bootCampPragma.Usuarios.infrastructure.output.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IUserEntityMapper {
    UserEntity toEntity(UserModel userModel);
    UserModel toUserModel(UserEntity userEntity);
}
