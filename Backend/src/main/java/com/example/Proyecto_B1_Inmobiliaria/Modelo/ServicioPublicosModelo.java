package com.example.Proyecto_B1_Inmobiliaria.Modelo;

import org.springframework.data.annotation.Id;

public class ServicioPublicosModelo {
    @Id
    private int    idinmueble;
    private String reciboenergia ;
    public  String reciboagua;
    private String recibogas;
    public  String serviciosopcionales;
    private String otroserviciosopcionales;
    
    public ServicioPublicosModelo(int idinmueble, String reciboenergia, String reciboagua, String recibogas,
            String serviciosopcionales, String otroserviciosopcionales) {
        this.idinmueble = idinmueble;
        this.reciboenergia = reciboenergia;
        this.reciboagua = reciboagua;
        this.recibogas = recibogas;
        this.serviciosopcionales = serviciosopcionales;
        this.otroserviciosopcionales = otroserviciosopcionales;
    }

    public int getIdinmueble() {
        return idinmueble;
    }

    public void setIdinmueble(int idinmueble) {
        this.idinmueble = idinmueble;
    }

    public String getreciboenergia() {
        return reciboenergia;
    }

    public void setreciboenergia(String reciboenergia) {
        this.reciboenergia = reciboenergia;
    }

    public String getReciboagua() {
        return reciboagua;
    }

    public void setReciboagua(String reciboagua) {
        this.reciboagua = reciboagua;
    }

    public String getRecibogas() {
        return recibogas;
    }

    public void setRecibogas(String recibogas) {
        this.recibogas = recibogas;
    }

    public String getServiciosopcionales() {
        return serviciosopcionales;
    }

    public void setServiciosopcionales(String serviciosopcionales) {
        this.serviciosopcionales = serviciosopcionales;
    }

    public String getOtroserviciosopcionales() {
        return otroserviciosopcionales;
    }

    public void setOtroserviciosopcionales(String otroserviciosopcionales) {
        this.otroserviciosopcionales = otroserviciosopcionales;
    }
}
