package com.pratham.blog.springngblog.controller;

import com.pratham.blog.springngblog.dto.AuthenticationResponse;
import com.pratham.blog.springngblog.dto.LoginRequest;
import com.pratham.blog.springngblog.dto.RegisterRequest;
import com.pratham.blog.springngblog.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*",maxAge = 3600L)
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody RegisterRequest registerRequest){
        authService.signup(registerRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody LoginRequest loginRequest){
        return authService.login(loginRequest);
    }


}
