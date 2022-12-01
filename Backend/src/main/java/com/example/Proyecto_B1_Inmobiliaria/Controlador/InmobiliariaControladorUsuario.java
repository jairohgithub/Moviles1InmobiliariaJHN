package com.example.Proyecto_B1_Inmobiliaria.Controlador;

import java.util.ArrayList;
// import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Proyecto_B1_Inmobiliaria.Modelo.InmobiliariaModeloUsuario;
// import com.example.Proyecto_B1_Inmobiliaria.Modelo.UserModelo;
import com.example.Proyecto_B1_Inmobiliaria.Servicios.InmobiliariaServiciosUsuario;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class InmobiliariaControladorUsuario {
   @Autowired
   InmobiliariaServiciosUsuario servicio;

   @PostMapping(value = "/guardar")
   public InmobiliariaModeloUsuario postMethodName(@RequestBody InmobiliariaModeloUsuario Usuario) {

      return servicio.GuardarUsuario(Usuario);
   }

   // @PostMapping(value = "/login")
   // public boolean login(@RequestBody UserModelo usuario) {
   // return servicio.LoginUser(usuario);
   // }

   // @PostMapping(value = "/login")
   // public String login(@RequestBody Map<String, String> data) {
   // try {
   // String correo = data.get("correo");
   // String password = data.get("pass");

   // Optional<InmobiliariaModeloUsuario> usuario = servicio.LoginUser(correo);

   // if (correo != "" & password != "") {

   // if (usuario != null) {
   // InmobiliariaModeloUsuario user = usuario.get();
   // if (usuario != null && user.getPass().equals(password))
   // return "{\"success\": true, \"message\": \"Login Correcto.\"}";
   // else
   // return "{\"success\": false, \"message\": \"Datos Incorrectos.\"}";
   // } else
   // return "{\"success\": false, \"message\": \"El usuario no existe.\"}";
   // } else
   // return "{\"success\": false, \"message\": \"Los campos no pueden estar
   // vacíos.\"}";
   // } catch (Exception e) {
   // return "{\"success\": false, \"message\": \"Error de comunicación con el
   // servidor.\"}";
   // }
   // }

   @GetMapping(path = "/ver")
   public ArrayList<InmobiliariaModeloUsuario> VerUsuario() {
      return servicio.VerUsuarios();
   }

   @GetMapping(path = "/verusuario/{cedula}")
   public Optional<InmobiliariaModeloUsuario> VerUsuario(@PathVariable("cedula") int cedula) {
      return servicio.verUsuario(cedula);
   }

   @DeleteMapping(path = "/eliminarusuario/{cedula}")
   public boolean EliminarUsuariio(@PathVariable("cedula") int cedula) {
      return servicio.EliminarUser(cedula);
   }
}