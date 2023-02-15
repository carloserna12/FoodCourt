package com.bootCampPragma.Usuarios.infrastructure.input.rest;

import com.bootCampPragma.Usuarios.application.dto.request.UserRequestDto;
import com.bootCampPragma.Usuarios.application.handler.IUserHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserRestController {
    private final IUserHandler userHandler;

    @PostMapping("/")
    public ResponseEntity<Void>saveUser(@RequestBody UserRequestDto userRequestDto){
        userHandler.saveUser(userRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
