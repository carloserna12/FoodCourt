package com.bootCampPragma.Usuarios.infrastructure.configuration;

import com.bootCampPragma.Usuarios.domain.api.IUserServicePort;
import com.bootCampPragma.Usuarios.domain.spi.IUserPersistencePort;
import com.bootCampPragma.Usuarios.domain.usecase.UserUseCase;
import com.bootCampPragma.Usuarios.infrastructure.output.adapter.UserJpaAdapter;
import com.bootCampPragma.Usuarios.infrastructure.output.mapper.IUserEntityMapper;
import com.bootCampPragma.Usuarios.infrastructure.output.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;

    @Bean
    public IUserPersistencePort userPersistencePort() {
        return new UserJpaAdapter(userRepository, userEntityMapper);
    }

    @Bean
    public IUserServicePort userServicePort() {
        return new UserUseCase(userPersistencePort());
    }
}
