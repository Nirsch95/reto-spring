package com.sofka.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "users")
@Data
public class User {

    @Id
    private String id;
    private String name;
    private String surName;
    private String documentType;
    private String document;
    private String email;
    private String address;
    private String city;
    private String level;
    private Number state;
}
