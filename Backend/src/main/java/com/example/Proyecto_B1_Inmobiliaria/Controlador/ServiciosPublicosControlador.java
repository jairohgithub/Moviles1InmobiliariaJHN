package com.example.Proyecto_B1_Inmobiliaria.Controlador;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Proyecto_B1_Inmobiliaria.Modelo.ServicioPublicosModelo;
import com.example.Proyecto_B1_Inmobiliaria.Servicios.ServicioPublicosServicios;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/servicio")
public class ServiciosPublicosControlador {
    @Autowired
    ServicioPublicosServicios serviciopublicos;
    
    @PostMapping(value = "/guardar")
    public ServicioPublicosModelo postMethodName(@RequestBody ServicioPublicosModelo Usuario) {
        
       return serviciopublicos.GuardarServicios(Usuario); 
    }
    
    @GetMapping(path="/ver")
    public ArrayList<ServicioPublicosModelo> VerServicios() {  
       return serviciopublicos.VerServicios(); 
    }

    @GetMapping(path="/verservicio/{idinmueble}")
    public Optional<ServicioPublicosModelo> VerServicios(@PathVariable("idinmueble") int idinmueble) {  
       return serviciopublicos.VerServicio(idinmueble); 
    }

    @DeleteMapping(path="/eliminarservicio/{idinmueble}")
    public boolean EliminarServicios(@PathVariable("idinmueble") int idinmueble) {  
       return serviciopublicos.EliminarServiciosPublicos(idinmueble); 
    }
}