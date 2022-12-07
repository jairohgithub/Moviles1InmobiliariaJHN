package com.example.Proyecto_B1_Inmobiliaria.Servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto_B1_Inmobiliaria.Modelo.InmobiliariaModeloUsuario;
import com.example.Proyecto_B1_Inmobiliaria.Repositorio.InmobiliariaRespositorio;

@Service
public class InmobiliariaServiciosUsuario {

    @Autowired
    InmobiliariaRespositorio repositorio;

    public InmobiliariaModeloUsuario GuardarUsuario(InmobiliariaModeloUsuario usuario) {
        return repositorio.save(usuario);
    }

    // public boolean LoginUser(UserModelo usuario) {
    // InmobiliariaModeloUsuario user = repositorio.findByUsuario(usuario);
    // return user != null;
    // }

    // public boolean LoginUser(InmobiliariaModeloUsuario correo) {
    // InmobiliariaModeloUsuario user =
    // repositorio.findByCorreoAndPass(correo,pass)(correo);
    // return user != null;
    // }

    public ArrayList<InmobiliariaModeloUsuario> LoginUser(String correo, String pass) {

        try {
            ArrayList<InmobiliariaModeloUsuario> user = repositorio.findByCorreoAndPass(correo, pass);

            if (user != null) {
                System.out.println(user);
                return user;
            } else {
                return null;
            }

        } catch (Exception e) {
            return null;
        }
    }

    public ArrayList<InmobiliariaModeloUsuario> VerUsuarios() {
        return (ArrayList<InmobiliariaModeloUsuario>) repositorio.findAll();
    }

    public ArrayList<InmobiliariaModeloUsuario> Login(String correo, String pass) {
        ArrayList<InmobiliariaModeloUsuario> login = repositorio.findByCorreoAndPass(correo, pass);
        return login;
    }

    public Optional<InmobiliariaModeloUsuario> verUsuario(Long cedula) {
        return repositorio.findById(cedula);
    }

    public boolean EliminarUser(Long cedula) {
        if (repositorio.existsById(cedula)) {
            repositorio.deleteById(cedula);
            return true;
        } else {
            return false;
        }
    }
}
