package com.example.Proyecto_B1_Inmobiliaria.Modelo;

import org.springframework.data.annotation.Id;

public class RegistroInmuebleModelo {
    @Id
    private int cinmueble;
    private String tinmueble;
    private String vinmueble;
    private String direccion;
    private String especificaciones;

    
    public RegistroInmuebleModelo() {
    }
    public RegistroInmuebleModelo(int cinmueble, String tinmueble, String vinmueble, String direccion,
            String especificaciones) {
        this.cinmueble = cinmueble;
        this.tinmueble = tinmueble;
        this.vinmueble = vinmueble;
        this.direccion = direccion;
        this.especificaciones = especificaciones;
    }
    public int getCinmueble() {
        return cinmueble;
    }
    public void setCinmueble(int cinmueble) {
        this.cinmueble = cinmueble;
    }
    public String getTinmueble() {
        return tinmueble;
    }
    public void setTinmueble(String tinmueble) {
        this.tinmueble = tinmueble;
    }
    public String getVinmueble() {
        return vinmueble;
    }
    public void setVinmueble(String vinmueble) {
        this.vinmueble = vinmueble;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getEspecificaciones() {
        return especificaciones;
    }
    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    } 
}
