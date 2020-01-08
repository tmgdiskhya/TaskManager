package com.example.taskmanager.Serverresponse;

public class SignupResponse {
    private  String status;
    private String token;

    public SignupResponse(String status, String token) {
        this.status = status;
        this.token = token;
    }
}
