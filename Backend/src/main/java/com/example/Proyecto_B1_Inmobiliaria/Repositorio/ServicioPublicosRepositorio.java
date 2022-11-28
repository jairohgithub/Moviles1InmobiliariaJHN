package com.example.Proyecto_B1_Inmobiliaria.Repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Proyecto_B1_Inmobiliaria.Modelo.ServicioPublicosModelo;

@Repository
public interface ServicioPublicosRepositorio extends MongoRepository<ServicioPublicosModelo,Integer>  {   
}
