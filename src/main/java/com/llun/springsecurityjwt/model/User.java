package com.llun.springsecurityjwt.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Document(collection = "users")
@Getter
@Setter
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private final Set<String> roles = new HashSet<>();

}