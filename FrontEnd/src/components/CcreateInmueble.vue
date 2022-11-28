<template>
  <div class="margen">
    <div class="bg-img">
      <form action="#" class="container">
        <div class="tituloradio">
          <h1>Crear Inmueble</h1>
        </div>
        <div class="imgprincipal">
          <img class="imginterna" src="../img/inmueble8.png" alt="No se encontró">
        </div><br><br><br>
        <label for="cinmueble"><b></b></label>
        <input type="text" placeholder="Código Inmueble" name="cinmueble" id="cinmueble" v-model="cinmueble" required>
        <label for="tinmueble"><b></b></label>
        <input type="text" placeholder="Tipo Inmueble" name="tinmueble" id="tinmueble" v-model="tinmueble" required>


        <label for="vinmueble"><b></b></label>
        <input type="text" placeholder="Valor Arriendo" name="vinmueble" id="vinmueble" v-model="vinmueble" required>

        <label for="direccion"><b></b></label>
        <input type="text" placeholder="Direccion Inmueble" name="direccion" id="direccion" v-model="direccion" required>

        <label for="especificaciones"><b></b></label>
        <input type="text" placeholder="Especificaciones" name="especificaciones" id="especificaciones" v-model="especificaciones"><br><br>
        <div class="img">
          <div class="imagenagregar">
            <img class="imgagrega" src="../img/agregarinmueble.png" alt="No se encontró">
            <div class="img">
              <div class="imagen">
                <a><img class="imgclass" src="../img/crearInmueble.png" alt="No se encontró" v-on:click="GuardarInmueble"></a>
              </div>
              <div class="imagen">
                <a><img class="imgclass" src="../img/consultarinmueble.png" alt="No se encontró"></a>
              </div>
            </div>
          </div>
        </div>
        <div class="imagenultimo">
          <div class="img">
            <div class="imagen">
              <a><img class="imgultim" src="../img/actualizarinmueble.png" alt="No se encontró"></a>
            </div>
            <div class="imagen">
              <a><img class="imgultim" src="../img/eliminarinmueble.png" alt="No se encontró"></a>
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

/* @media (max-width: 767px) {
    
    body {
      background-color: rgb(0, 255, 98);
      height: 1000px;
    }

   
} */

.center {
  text-align: center;
  position: relative;
  margin: 0 auto;

}

a,
p {
  color: #ffffff;
}



.enlac {
  color: #000000;
  height: 50px;
  position: relative;
  width: 100%;
  top: -30px;
  font-family: 'Times New Roman', Times, serif;
  text-align: center;
  border-radius: 30px;
  background-color: #0997F9;
  padding: 0px 0px;
  border: none;
  cursor: pointer;
  opacity: 0.9;
  padding-top: 20px;
}

.enlaceRegistro {
  color: #000000;
  height: 50px;
  position: relative;
  width: 100%;
  top: -20px;
  font-family: 'Times New Roman', Times, serif;
  text-align: center;
  border-radius: 30px;
  background-color: #0997F9;
  padding: 0px 0px;
  border: none;
  cursor: pointer;
  opacity: 0.9;
  padding-top: 20px;
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

/* Add styles to the form container */
.container {
  position: center;
  right: 0;
  margin: 20px;
  max-width: 300px;
  padding: 16px;
  /* background-color: white; */
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

/* Full-width input fields */
input[type=text],
input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 2px 0;
  border: none;
  /* background: #f1f1f1; */
}

input[type=text]:focus,
input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for the submit button */
.btn {
  background-color: #0997f9;
  color: black;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
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
  left: 20px;
  top: -30px;

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
  top: -40px;
  left: 20px;

}

/* p{
    font-family: 'Times New Roman', Times, serif;
    font-size: 10px;
    margin-top: 0px;
  } */
.imgagrega {
  width: 100%;
  margin-top: 10%;
  border-radius: 20px;
  left: 0px;
}

/* .imag {
    width: 100%;
    display: flex;
    padding-left: 0%;
  
  }
  .img{
    padding: 6px;
  } */

/* .imgclass{
    width:100%;
  } */

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
      especificaciones: "",

      // datos: [],
      busqueda: "",
      inmueble: "",
    }
  },

  methods: {
    GuardarInmueble() {
      var endpoint = "http://localhost:8080/inmueble/guardar";
      var opciones = {
        method: "POST",
        headers: { "Content-type": "Application/json" },
        body: JSON.stringify({ cinmueble: this.cinmueble, tinmueble: this.tinmueble, vinmueble: this.vinmueble, direccion: this.direccion, especificaciones: this.especificaciones })
      }
      fetch(endpoint, opciones).then(async Response => {
        // alert('Guardado Correctamente');
        try {
          if (Response.status)
            Swal.fire({
              icon: 'question',
              title: 'Desea Registrar Usuario?',
              showDenyButton: true,
              showCancelButton: false,
              confirmButtonText: 'Registrar',
              denyButtonText: `Cancelar`,
            }).then((result) => {
              if (result.isConfirmed) {
                Swal.fire('Guardado con exito', '', 'success')
                this.$router.push('/');

              } else if (result.isDenied) {
                Swal.fire('Los cambios no se guardaron', '', 'warning')
                return false
              }
            })
          else {
            alert("error")
          }
        } catch (error) {
          return "{\"sucess\":false ,\"message\":\"Error al intentar registrar.\"}";
        }
      })
    },
    // BuscarInmueble() {
    //   var endpoint = "http://localhost:8080/inmueble/verinmueble/" + this.busqueda;
    //   var opciones = { method: "GET" };
    //   fetch(endpoint, opciones).then(async response => {
    //     this.inmueble = await response.json();
    //   })


    // }
  }
}
</script>