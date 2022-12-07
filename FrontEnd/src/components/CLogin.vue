<template>
  <div class="margen">
    <div class="bg-img">
      <form action="GET" class="container" @submit.prevent="ValidarUsuario">
        <div class="tituloradio">
          <h1>Arriendo de Inmobiliaria</h1>
          <div class="img">
            <img src="../img/usuario.png" alt="No se encontró">
          </div><br><br>
          <label for="correo"><b></b></label>
          <input type="text" placeholder="Correo Electronico" name="correo" id="correo" v-model="correo" required>

          <label for="pass"><b></b></label>
          <input type="password" placeholder="Contraseña" name="pass" id="pass" v-model="pass" required><br><br>

          <div>
            <button type="submit">INGRESAR</button>
          </div>
          <div class="center">
            <strong>
              <RouterLink to="/pass"><a class="olvidopass">olvido su contraseña
                </a></RouterLink>
              <br>
              <br>
              <br>
              <p class="notienecuentap">
              <p> No tienes una cuenta registrate</p>
              </p>
              <div class="enlace"></div>
              <RouterLink to="/cuenta">Registrarse</RouterLink>
            </strong>
          </div>
        </div>
      </form>
    </div>
  </div>
</template>

<style scoped>
@import '../assets/styleMovi1Mobiliaria.css';
</style>

<script scoped>
export default {
  data() {
    return {
      correo: "",
      pass: "",
    }
  },
  methods: {
    // ValidarUsuario() {
    //   try {

    //     var endpoint = "http://localhost:8080/usuario/login/" + this.correo + '/' + this.pass;
    //     var opciones = { method: "GET" }
    //     fetch(endpoint, opciones).then(async response => {
    //       this.resultado = await response.json();
    //       if (resultado.length >= 1) {
    //         Swal.fire({
    //           width: 300,
    //           icon: 'success',
    //           title: 'Correcto',
    //           text: "Usuario Registrado",
    //           showConfirmButton: false,
    //           timer: 500
    //         })
    //         this.$router.push('/buscador')
    //       }
    //       else if (!resultado.length) {
    //         Swal.fire({
    //           width: 300,
    //           icon: 'question',
    //           title: 'Error',
    //           text: "Usuario no encontrado",
    //           showConfirmButton: false,
    //           timer: 500
    //         })
    //       }
    //       else
    //         Swal.fire({
    //           width: 300,
    //           icon: 'error',
    //           title: 'Error',
    //           text: "Usuario o Clave Incorrectos",
    //           showConfirmButton: false,
    //           timer: 2000
    //         })
    //       console.log(response)
    //     })

    //   } catch (error) {
    //     Swal({
    //       title: "Error",
    //     })
    //   }
    // },

    // ValidarUsuario: async function () {
    //   var endpoint = 'http://localhost:8080/usuario/login/' + this.correo + '/' + this.pass;
    //   var opciones = {
    //     method: 'POST',
    //     headers: {
    //       "Content-type": "Application/json",
    //       'Access-Control-Allow-Origin': '*',
    //       'Access-Control-Allow-Headers': 'Authorization'
    //     }
    //   }
    //   fetch(endpoint, opciones).then(async response => {
    //     this.resultado = await response.json();

    //     try {
    //       if (this.resultado.length >= 1) {
    //         Swal.fire({
    //           width: 300,
    //           icon: 'success',
    //           title: 'Correcto',
    //           text: "Usuario Registrado",
    //           showConfirmButton: false,
    //           timer: 500
    //         })
    //         this.$router.push('/buscador');
    //       }
    //       else if (!this.resultado.length) {
    //         Swal.fire({
    //           width: 300,
    //           icon: 'question',
    //           title: 'Error',
    //           text: "Usuario no encontrado",
    //           showConfirmButton: false,
    //           timer: 500
    //         })
    //       }
    //       else
    //         Swal.fire({
    //           width: 300,
    //           icon: 'error',
    //           title: 'Error',
    //           text: "Usuario o Clave Incorrectos",
    //           showConfirmButton: false,
    //           timer: 2000
    //         })
    //       // console.log(response)

    //     } catch (error) {
    //       Swal.fire({
    //         width: 300,
    //         icon: 'error',
    //         title: 'Error',
    //         text: "Error!! request server",
    //         showConfirmButton: false,
    //         timer: 2000
    //       })

    //     }
    //   }).then(data => data)
    //     // .catch(error => console.log(error));
    // }

    ValidarUsuario() {
      var endpoint = "http://localhost:8080/usuario/login/" + this.correo + '/' + this.pass;
      var opciones = { method: "GET" }
      fetch(endpoint, opciones).then(async response => {
        const resultado = await response.json();
        if (resultado.length >= 1) {
          Swal.fire({
            width: 300,
            icon: 'success',
            title: 'Correcto',
            text: "Usuario Registrado",
            showConfirmButton: false,
            timer: 500
          })
          this.$router.push('/buscador')
        }
        else if (resultado.length != null) {
          Swal.fire({
            width: 300,
            icon: 'error',
            title: 'Usuario o Clave Incorrectos',
            text: "Usuario no encontrado",
            showConfirmButton: false,
            timer: 1000
          })
        }
      })
    }
  }
}

</script>