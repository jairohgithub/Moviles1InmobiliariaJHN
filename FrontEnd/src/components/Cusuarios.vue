<template>
    <div class="margen">
        <div class="bg-img">
            <form action="#" class="container">
                <div class="tituloradio">
                    <h1>Usuarios Registrados</h1>
                </div>
                <div class="imguser">
                    <img class="imguser" src="../img/usuario.png" alt="No se encontró">
                </div><br>
                <!-- <label for="tinmueble"></label>
          <input type="text" placeholder="Tipo Inmueble" name="tinmueble" id="tinmueble" v-model="tinmueble" required>
          <label for="ubicacion"><b></b></label>
          <input type="text" placeholder="Ubicación Inmueble" name="ubicacion" id="ubicacion" v-model="ubicacion"
            required> -->
                <br>
                <button type="submit" name="buscar" id="buscar" v-on:click="BuscadorInmuebles">Buscar Usuarios</button>
                <div class="table-container">
                    <table>
                        <div id="div1" style="text-align= center" >
                            <table border="1">
                                <tr>
                                    <th>Cedula</th>
                                    <th>Nombre</th>
                                    <th>Telefono</th>
                                    <th>Direccion</th>
                                    <th>Correo</th>
                                    <!-- <th>Password</th> -->
                                </tr>

                                <tr v-for="dato in datos">
                                    <th>{{ dato.cedula }}</th>
                                    <th>{{ dato.nombre }}</th>
                                    <th>{{ dato.telefono }}</th>
                                    <th>{{ dato.direccion }}</th>
                                    <th>{{ dato.correo }}</th>
                                    <!-- <th>{{ dato.pass }}</th> -->
                                </tr>
                            </table>
                        </div>
                    </table>
                </div> <br>
                <RouterLink to="/cuenta"><button type="submit" name="buscar" id="buscar">Registrar
                        Usuario</button></RouterLink>
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

#div1 {
    overflow: scroll;
    height: 290px;
    width: 300px;
}

#div1 table {
    width: 50px;
    background-color: rgb(172, 232, 241);
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

button {
    background-color: #0997F9;
    top: -10px;
}

input[type=text]:focus,
input[type=password]:focus {
    background-color: #ddd;
    outline: none;
}

/* .imginterna {
    position: relative;
    width: 100%;
    left: 0px;
    top: 0px;
} */

img.imguser {
    position: relative;
    right: -80px;
    top: 20px;
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
            cedula: "",
            nombre: "",
            telefono: "",
            direccion: "",
            correo: "",
            // pass: "",
            datos: [],
        }
    },

    methods: {
        BuscadorInmuebles() {
            var endpoint = "http://localhost:8080/usuario/ver";
            var opciones = { method: "GET" }
            fetch(endpoint, opciones).then(async response => {
                this.datos = await response.json();
            })
        }
    }
}
</script>