<script>

</script>

<template>
  <div class="margen">
    <div class="bg-img">
      <form action="#" class="container">
        <div class="tituloradio">
          <h1>Arriendo de Inmobiliaria</h1>
          <div class="img">
            <img src="../img/usuario.png" alt="No se encontró">
          </div><br><br>
          <label for="email"><b></b></label>
          <input type="text" placeholder="Correo Electronico" name="email" id="email" v-model="email">

          <label for="pass"><b></b></label>
          <input type="password" placeholder="Contraseña" name="pass" id="pass" v-model="pass"><br><br>

          <div class="enlac">
            <a href="#" v-on:click="login">INGRESAR</a>
          </div>
          <!-- <button type="submit" class="btn"></button><br><br> -->
          <div class="center">
            <strong>
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
<!-- 
<script>

login: async function (event) {
  try {
    url= "http://localhost:8080/usuario/login"

    let response = await fetch(url, {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify({
        correo: this.correo,
        pass= this.pass
      })
    }).then((response)=> response.json())
    .then(data => data)
    .catch(error => console.log(error))

    // if (response.success== true)
    //     if () {
          
    //     }
      
   
  } catch (error) {
    swal({
      title: "Error!";
    })
  }
}

</script> -->