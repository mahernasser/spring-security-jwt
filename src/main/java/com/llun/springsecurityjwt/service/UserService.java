package com.llun.springsecurityjwt.service;

import com.llun.springsecurityjwt.mapper.UserMapper;
import com.llun.springsecurityjwt.model.User;
import com.llun.springsecurityjwt.payload.request.SignupRequest;
import com.llun.springsecurityjwt.repository.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepo userRepository;

    private final PasswordEncoder encoder;

    public User registerUser(SignupRequest signUpRequest) {
        User user = UserMapper.INSTANCE.signupRequestToUser(signUpRequest);
        user.setPassword(encoder.encode(user.getPassword()));
        user.getRoles().add("USER");
        return userRepository.save(user);
    }
}