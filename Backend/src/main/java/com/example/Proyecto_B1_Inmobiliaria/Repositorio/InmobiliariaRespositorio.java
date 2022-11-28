package com.example.Proyecto_B1_Inmobiliaria.Repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Proyecto_B1_Inmobiliaria.Modelo.InmobiliariaModeloUsuario;
// import com.example.Proyecto_B1_Inmobiliaria.Modelo.UserModelo;

@Repository
public interface InmobiliariaRespositorio extends MongoRepository<InmobiliariaModeloUsuario,Integer>  {   
    // public InmobiliariaModeloUsuario findByUsuario(UserModelo usuario);
}