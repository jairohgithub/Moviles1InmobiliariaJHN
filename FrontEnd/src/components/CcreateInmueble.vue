<template>
  <div class="margen">
    <div class="bg-img">
      <form action="#" class="container">
        <div class="tituloradio">
          <h1>Crear Inmueble</h1>
        </div>
        <div class="imgprincipal">
          <img class="imginterna" src="../img/inmueble8.png" alt="No se encontró">
        </div>
        <label for="cinmueble"><b></b></label>
        <input type="text" placeholder="Código Inmueble" name="cinmueble" id="cinmueble" v-model="cinmueble" required>
        <label for="tinmueble"><b></b></label>
        <input type="text" placeholder="Tipo Inmueble" name="tinmueble" id="tinmueble" v-model="tinmueble" required>


        <label for="vinmueble"><b></b></label>
        <input type="text" placeholder="Valor Arriendo" name="vinmueble" id="vinmueble" v-model="vinmueble" required>

        <label for="direccion"><b></b></label>
        <input type="text" placeholder="Direccion Inmueble" name="direccion" id="direccion" v-model="direccion"
          required>

        <label for="ubicacion"><b></b></label>
        <input type="text" placeholder="Ubicacion Inmueble" name="ubicacion" id="ubicacion" v-model="ubicacion"
          required>

        <label for="especificaciones"><b></b></label>
        <input type="text" placeholder="Especificaciones" name="especificaciones" id="especificaciones"
          v-model="especificaciones">

        <div class="img">
          <div class="imagenagregar">
            <div class="img">
              <div class="imagen">
                <img class="imgclass" src="../img/crearInmueble.png" alt="No se encontró" v-on:click="GuardarInmueble">
              </div>
              <div class="imagen">
                <RouterLink to="/buscarinmueble"><img class="imgclass" src="../img/consultarinmueble.png"
                    alt="No se encontró"></RouterLink>
              </div>
            </div>
          </div>
        </div>
        <div class="imagenultimo">
          <div class="img">
            <div class="imagen">
              <RouterLink to="/actualizarinmueble"><img class="imgultim" src="../img/actualizarinmueble.png"
                  alt="No se encontró"></RouterLink>
            </div>
            <div class="imagen">
              <RouterLink to="/eliminarinmueble"><img class="imgultim" src="../img/eliminarinmueble.png"
                  alt="No se encontró"></RouterLink>
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
  top: -18px;
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
  left: 45px;
  top: -20px;

}

.imginterna {
  position: relative;
  width: 100%;
  left: 0px;
  top: -12px;
}

.imgultim {
  position: relative;
  width: 100%;
  margin-left: 100%;
  border-radius: 30px;
  top: -32px;
  left: -40px;

}

.margen {
  position: relative;
  width: 100%;
  margin: 0 auto;

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
      ubicacion: "",
      especificaciones: "",
      busqueda: "",
    }
  },

  methods: {
    GuardarInmueble() {
      var endpoint = "http://localhost:8080/inmueble/guardar";
      var opciones = {
        method: "POST",
        headers: { "Content-type": "Application/json" },
        body: JSON.stringify({ cinmueble: this.cinmueble, tinmueble: this.tinmueble, vinmueble: this.vinmueble, direccion: this.direccion, ubicacion: this.ubicacion, especificaciones: this.especificaciones })
      }
      fetch(endpoint, opciones).then(async Response => {
        // alert('Guardado Correctamente');
        try {
          if (Response.status)
            Swal.fire({
              icon: 'question',
              title: 'Desea Registrar Inmueble?',
              showDenyButton: true,
              showCancelButton: false,
              confirmButtonText: 'Registrar',
              denyButtonText: `Cancelar`,
            }).then((result) => {
              if (result.isConfirmed) {
                Swal.fire('Guardado con exito', '', 'success')
                this.$router.push('/buscador');
              } else if (result.isDenied) {
                Swal.fire('Error al guardar el inmueble', '', 'warning')
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
    }
  }
}
</script>