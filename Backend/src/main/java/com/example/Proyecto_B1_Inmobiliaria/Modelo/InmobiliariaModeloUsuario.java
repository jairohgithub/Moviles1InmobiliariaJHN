package com.example.Proyecto_B1_Inmobiliaria.Modelo;
import org.springframework.data.annotation.Id;

public class InmobiliariaModeloUsuario {
    @Id
    private int cedula;
    private String nombre ;
    private String telefono;
    private String direccion;
    private String correo;
    private String pass;
    // private UserModelo usuario;
    
    public InmobiliariaModeloUsuario(int cedula, String nombre, String telefono, String direccion,  String correo, String pass) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo=correo;
        this.pass=pass;
        // this.usuario = usuario;
    }
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    // public UserModelo getUsuario() {
    //     return usuario;
    // }
    // public void setUsuario(UserModelo usuario) {
    //     this.usuario = usuario;
    // }   
    // public UserModelo(String correo, String pass) {
    //     this.correo = correo;
    //     this.pass = pass;
    // }
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
