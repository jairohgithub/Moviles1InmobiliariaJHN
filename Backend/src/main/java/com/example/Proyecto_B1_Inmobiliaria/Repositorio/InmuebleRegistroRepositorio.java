package com.example.Proyecto_B1_Inmobiliaria.Repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import com.example.Proyecto_B1_Inmobiliaria.Modelo.RegistroInmuebleModelo;

@Repository
public interface InmuebleRegistroRepositorio extends MongoRepository<RegistroInmuebleModelo, Long> {
    public ArrayList<RegistroInmuebleModelo> findByTinmuebleAndUbicacion(String tinmueble, String ubicacion);
}
