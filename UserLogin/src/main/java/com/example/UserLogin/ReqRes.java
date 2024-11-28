package com.example.UserLogin;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
public class ReqRes {


    private int statusCode;
    private String error;
    private String message;
    private String token;
    private String refreshToken;
    private String expirationTime;
    private Integer id;
    private String name;
    private String email;
    private String password;
    public  String role;
    private OurUsers ourUsers;
    private List<OurUsers> ourUsersList;
}
