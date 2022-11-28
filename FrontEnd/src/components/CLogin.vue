<script>

</script>

<template>
<div class="margen">
    <div class="bg-img">
      <form action="#" class="container">
        <div class="tituloradio">
          <h1>Arriendo de Inmobiliaria</h1>
          <div class="img">
            <img src= "../img/usuario.png" alt="No se encontró">
          </div><br><br>
          <label for="email"><b></b></label>
          <input type="text" placeholder="Correo Electronico" name="email" id="email" v-model="email">

          <label for="pass"><b></b></label>
          <input type="password" placeholder="Contraseña" name="pass" id="pass" v-model="pass"><br><br>

          <div class="enlac">
            <a href="#" v-on:click="ValidarUsuario">INGRESAR</a>
          </div>
          <!-- <button type="submit" class="btn"></button><br><br> -->
          <div class="center">
            <strong >
              <a class="olvidopass" href="../../vistas/olvidoContraseña.html">olvido su contraseña
              </a>
              <br>
              <br>
              <br>
              <p class="notienecuentap"> 
                <u> No tienes una cuenta registrate

                </u>
              </p>

              <div class="enlace">
                <RouterLink to="/cuenta">Registrarse</RouterLink>
              </div>
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