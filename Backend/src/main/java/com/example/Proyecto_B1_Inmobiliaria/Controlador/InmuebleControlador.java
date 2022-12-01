package com.example.Proyecto_B1_Inmobiliaria.Controlador;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Proyecto_B1_Inmobiliaria.Modelo.RegistroInmuebleModelo;

import com.example.Proyecto_B1_Inmobiliaria.Servicios.InmuebleServicio;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/inmueble")
@CrossOrigin("*")
public class InmuebleControlador {
    @Autowired
    InmuebleServicio servicio;
    
    @PostMapping(value = "/guardar")
    public RegistroInmuebleModelo postMethodName(@RequestBody RegistroInmuebleModelo Inmueble) {
        
       return servicio.GuardarInmueble(Inmueble); 
    }

    @GetMapping(path="/ver")
    public ArrayList<RegistroInmuebleModelo> VerInmuebles() {  
       return servicio.VerInmuebles(); 
    }

    @GetMapping(path="/verinmueble/{codigoinmueble}")
    public Optional<RegistroInmuebleModelo> VerInmueble(@PathVariable("codigoinmueble") int codigoinmueble) {  
       return servicio.verInmueble(codigoinmueble); 
    }

    @DeleteMapping(path="/eliminarinmueble/{codigoinmueble}")
    public boolean EliminarInmueble(@PathVariable("codigoinmueble") int codigoinmueble) {  
       return servicio.EliminarInmueble(codigoinmueble); 
    }
}