package com.example.Proyecto_B1_Inmobiliaria.Servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto_B1_Inmobiliaria.Modelo.InmobiliariaModeloUsuario;
// import com.example.Proyecto_B1_Inmobiliaria.Modelo.UserModelo;
import com.example.Proyecto_B1_Inmobiliaria.Repositorio.InmobiliariaRespositorio;

@Service
public class InmobiliariaServiciosUsuario {

    @Autowired
    InmobiliariaRespositorio repositorio;

    public InmobiliariaModeloUsuario GuardarUsuario(InmobiliariaModeloUsuario estudiante) {

        return repositorio.save(estudiante);
    }

    // public boolean LoginUser(UserModelo usuario) {
    //     InmobiliariaModeloUsuario user = repositorio.findByUsuario(usuario);
    //     return user != null;
    // }

    //  public boolean LoginUser(InmobiliariaModeloUsuario correo) {
    //     InmobiliariaModeloUsuario user = repositorio.findBy(correo);
    //     return user != null;
    // }

    public ArrayList<InmobiliariaModeloUsuario> VerUsuarios() {
        return (ArrayList<InmobiliariaModeloUsuario>) repositorio.findAll();
    }

    public Optional<InmobiliariaModeloUsuario> verUsuario(int cedula) {
        return repositorio.findById(cedula);
    }

    public boolean EliminarUser(int cedula) {
        if (repositorio.existsById(cedula)) {
            repositorio.deleteById(cedula);
            return true;
        } else {
            return false;
        }
    }
}
