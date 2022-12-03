<template>
    <div class="margen">
      <div class="bg-img">
        <form action="#" class="container">
          <div class="tituloradio">
            <h1>Buscar Inmueble</h1>
          </div>
          <div class="imgprincipal">
            <img class="imginterna" src="../img/inmueble8.png" alt="No se encontró">
          </div><br>
          <label for="busqueda"></label>
          <input type="text" placeholder="Código Inmueble" name="busqueda" id="busqueda" v-model="busqueda" required>
          <label for="tinmueble"><b></b></label>
          <input type="text" placeholder="Tipo Inmueble" name="tinmueble" id="tinmueble" v-model="inmueble.tinmueble" required>
  
  
          <label for="vinmueble"></label>
          <input type="text" placeholder="Valor Arriendo" name="vinmueble" id="vinmueble" v-model="inmueble.vinmueble" required>
  
          <label for="direccion"></label>
          <input type="text" placeholder="Direccion Inmueble" name="direccion" id="direccion" v-model="inmueble.direccion" required>

          <label for="ubicacion"></label>
          <input type="text" placeholder="Ubicacion Inmueble" name="ubicacion" id="ubicacion" v-model="inmueble.ubicacion" required>
  
          <label for="especificaciones"></label>
          <input type="text" placeholder="Especificaciones" name="especificaciones" id="especificaciones" v-model="inmueble.especificaciones">
          <br><br>
          <div class="img">
            <div class="imagenagregar">
              <div class="img">
                <div class="imagen">
                  <RouterLink to="/crearinmueble"><img class="imgclass" src="../img/crearInmueble.png" alt="No se encontró"></RouterLink>
                </div>
                <div class="imagen">
                  <a><img class="imgclass" src="../img/consultarinmueble.png" alt="No se encontró" v-on:click="BuscarInmueble"></a>
                </div>
              </div>
            </div>
          </div>
          <div class="imagenultimo">
            <div class="img">
              <div class="imagen">
                <RouterLink to="/actualizarinmueble"><img class="imgultim" src="../img/actualizarinmueble.png" alt="No se encontró"></RouterLink>
              </div>
              <div class="imagen">
                <RouterLink to="/eliminarinmueble"><img class="imgultim" src="../img/eliminarinmueble.png" alt="No se encontró"></RouterLink>
              </div>
            </div>
          </div>
        </form>
      </div>
    </div>
  </template>
  
  <style scoped>
  * {
    box-sizing: border-box;
  }
  
  body {
    height: 100%;
  }
   
  a,
  p {
    color: #ffffff;
  }
  
  .bg-img {
    margin: 0 auto;
    width: 360px;
    height: 640px;
    background: url("../img/fondo.png");
    background-repeat: no-repeat;
    background-position: center center;
    background-size: cover;
    opacity: 1;
    position: relative;
    top: 0px;
    left: 0px;
    overflow: hidden;
    border-radius: 50px;
  }
  
  .tituloradio {
    width: 100%;
    height: 30px;
    position: relative;
    top: -20px;
    border-radius: 30px;
    background-color: #0997F9;
  }
  
  input {
    width: 100%;
    position: relative;
    border-radius: 30px;
  
  }
  
  .container {
    position: center;
    right: 0;
    margin: 20px;
    max-width: 300px;
    padding: 16px;
  }
  
  input::placeholder {
    text-align: center;
  }
  
  h1 {
    text-align: center;
    font-family: 'Times New Roman', Times, serif;
    color: #ffffff;
    font-size: 24px;
  }
  
  input[type=text],
  input[type=password] {
    width: 100%;
    padding: 15px;
    margin: 5px 0 2px 0;
    border: none;
    top:-30px;
  }
  
  input[type=text]:focus,
  input[type=password]:focus {
    background-color: #ddd;
    outline: none;
  }
    
  .imagenagregar {
    width: 100%;
    display: flex;
  }
  
  .img {
    width: 100%;
    display: flex;
    padding-left: 0%;
  }
  
  .imagen {
    padding: 6px;
  }
  
  .imgclass {
    border-radius: 30px;
    border-radius: 30px;
    left: 50px;
    top: -60px;
  
  }
  
  .imginterna {
    position: relative;
    width: 100%;
    left: 0px;
  }
  
  .imgultim {
    position: relative;
    width: 100%;
    margin-left: 100%;
    border-radius: 30px;
    top: -78px;
    left: -34px;
  
  }

  .imgagrega {
    width: 100%;
    margin-top: 10%;
    border-radius: 20px;
    left: 0px;
  }
  
  .margen {
    position: relative;
    width: 100%;
    margin: 0 auto;
  
  }
  
  .btn:hover {
    opacity: 1;
  }
  </style>
  <script>
  export default {
    data() {
      return {
        cinmueble: "",
        tinmueble: "",
        vinmueble: "",
        direccion: "",
        ubicacion:"",
        especificaciones: "",
        busqueda: "",
        inmueble: "",
      }
    },
  
    methods: {
      BuscarInmueble() {
            var endpoint = "http://localhost:8080/inmueble/verinmueble/" + this.busqueda;
            var opciones = { method: "GET" };
            fetch(endpoint, opciones)
            .then( response => response.json())
            .then( data => {this.inmueble = data; console.log(data)})    
        }
    }
  }
  </script>