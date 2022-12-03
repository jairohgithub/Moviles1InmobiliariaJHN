package com.example.Proyecto_B1_Inmobiliaria.Repositorio;

import java.util.ArrayList;

//import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Proyecto_B1_Inmobiliaria.Modelo.InmobiliariaModeloUsuario;
// import com.example.Proyecto_B1_Inmobiliaria.Modelo.UserModelo;

@Repository
public interface InmobiliariaRespositorio extends MongoRepository<InmobiliariaModeloUsuario,Long>  {   
    // public Optional<InmobiliariaModeloUsuario> findByCorreo(String correo);
    public ArrayList<InmobiliariaModeloUsuario> findByCorreoAndPass(String correo, String pass);
    
}

