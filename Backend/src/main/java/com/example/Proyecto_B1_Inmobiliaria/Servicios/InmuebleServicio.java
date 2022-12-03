package com.example.Proyecto_B1_Inmobiliaria.Servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto_B1_Inmobiliaria.Modelo.RegistroInmuebleModelo;
import com.example.Proyecto_B1_Inmobiliaria.Repositorio.InmuebleRegistroRepositorio;

@Service
public class InmuebleServicio{
    
    @Autowired
    InmuebleRegistroRepositorio repositorio;

    public RegistroInmuebleModelo GuardarInmueble(RegistroInmuebleModelo inmueble) {
        
        return repositorio.save(inmueble);
    }

    public ArrayList<RegistroInmuebleModelo> VerInmuebles(){
        return (ArrayList<RegistroInmuebleModelo>) repositorio.findAll();
    }

    public Optional<RegistroInmuebleModelo> verInmueble(Long codigoinmueble){
        return repositorio.findById(codigoinmueble);
    }
    public ArrayList<RegistroInmuebleModelo> BuscarUbicacion(String tinmueble, String ubicacion){
        ArrayList<RegistroInmuebleModelo> buscarUbicacion=repositorio.findByTinmuebleAndUbicacion(tinmueble,ubicacion);
        return buscarUbicacion;
     }
    // public ArrayList<RegistroInmuebleModelo> verTinmueble(String tipoinmueble){
    //     return repositorio.findByTinmueble(tipoinmueble);
    // }
    

    public boolean EliminarInmueble(Long codigoinmueble){
        if(repositorio.existsById(codigoinmueble)){
            repositorio.deleteById(codigoinmueble);
            return true;
        }else{
            return false;
        }
    }

}
