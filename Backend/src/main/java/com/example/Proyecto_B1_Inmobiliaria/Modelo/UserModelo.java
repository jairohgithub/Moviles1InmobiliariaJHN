package com.example.Proyecto_B1_Inmobiliaria.Modelo;

import org.springframework.data.annotation.Id;

public class UserModelo {
    @Id
    public  String correo;
    public String pass;

    public UserModelo(String correo, String pass) {
        this.correo = correo;
        this.pass = pass;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
}
