package com.agrohelper.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class LoginRequestDTO {

    @NotBlank(message = "Email não pode estar em branco")
    @Email(message = "Formato de email inválido")
    private String email;

    @NotBlank(message = "Senha não pode estar em branco")
    private String password;

    // --- Getters and Setters ---
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
