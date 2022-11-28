package com.example.Proyecto_B1_Inmobiliaria.Servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto_B1_Inmobiliaria.Modelo.ServicioPublicosModelo;
//import com.example.Proyecto_B1_Inmobiliaria.Repositorio.LoginRepo;
import com.example.Proyecto_B1_Inmobiliaria.Repositorio.ServicioPublicosRepositorio;

@Service
public class ServicioPublicosServicios {
    
    @Autowired
    ServicioPublicosRepositorio repositorioSevicioPublico;
    //LoginRepo repo;

    public ServicioPublicosModelo GuardarServicios(ServicioPublicosModelo servicios) {
        
        return repositorioSevicioPublico.save(servicios);
    }

    // public boolean LoginUser(String correo, String pass){
    //     if(repo.exists(correo,pass)){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }

    public ArrayList<ServicioPublicosModelo> VerServicios(){
        return (ArrayList<ServicioPublicosModelo>) repositorioSevicioPublico.findAll();
    }

    public Optional<ServicioPublicosModelo> VerServicio(int idinmueble){
        return repositorioSevicioPublico.findById(idinmueble);
    }

    public boolean EliminarServiciosPublicos(int idinmueble){
        if(repositorioSevicioPublico.existsById(idinmueble)){
            repositorioSevicioPublico.deleteById(idinmueble);
            return true;
        }else{
            return false;
        }
    }
}