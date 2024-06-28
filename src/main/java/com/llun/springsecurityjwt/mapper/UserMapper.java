package com.llun.springsecurityjwt.mapper;

import com.llun.springsecurityjwt.model.User;
import com.llun.springsecurityjwt.payload.request.SignupRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

//    @Mapping(source = "username", target = "username")
//    @Mapping(source = "password", target = "password")
//    SignupRequest userToSignupRequest(User user);

    @Mapping(source = "username", target = "username")
    @Mapping(source = "password", target = "password")
    User signupRequestToUser(SignupRequest signupRequest);
}