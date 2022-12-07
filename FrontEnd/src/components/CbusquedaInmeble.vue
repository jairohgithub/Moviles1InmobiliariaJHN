<template>
    <div class="margen">
        <div class="bg-img">
            <form action="" method="GET" @submit.prevent="BuscarInmueble" class="container">
                <div class="tituloradio">
                    <h1>Buscar Inmueble</h1>
                </div>
                <div class="imgprincipal">
                    <img class="imginterna" src="../img/inmueble8.png" alt="No se encontró">
                </div>
                <label for="Busquedatinmueble"></label>
                <input type="text" placeholder="Tipo Inmueble" name="Busquedatinmueble" id="Busquedatinmueble"
                    v-model="Busquedatinmueble" required>
                <label for="BusquedaUbicacion"><b></b></label>
                <input type="text" placeholder="Ubicación Inmueble" name="BusquedaUbicacion" id="BusquedaUbicacion"
                    v-model="BusquedaUbicacion" required>
                <br>
                <button type="submit" name="buscar" id="buscar">Buscar Inmueble</button>
                <div class="table-container">
                    <table>
                        <div id="div1" align="center">
                            <table border="1">
                                <tr>
                                    <th>Código Inmueble</th>
                                    <th>Tipo Inmueble</th>
                                    <th>Valor Inmueble</th>
                                    <th>Direccion</th>
                                    <th>Ubicación</th>
                                    <th>Especificaciones</th>
                                </tr>

                                <tr v-for="dato in datos">
                                    <th>{{ dato.cinmueble }}</th>
                                    <th>{{ dato.tinmueble }}</th>
                                    <th>{{ dato.vinmueble }}</th>
                                    <th>{{ dato.direccion }}</th>
                                    <th>{{ dato.ubicacion }}</th>
                                    <th>{{ dato.especificaciones }}</th>
                                </tr>
                            </table>
                        </div>
                    </table>
                </div> <br>
                <RouterLink to="/crearinmueble"><button type="submit" name="buscar" id="buscar">Registrar
                        Inmueble</button></RouterLink>
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
    height: 200px;
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

.imginterna {
    position: relative;
    width: 100%;
    left: 0px;
    top: -15px;
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
            datos: [],
            Busquedatinmueble: "",
            BusquedaUbicacion: "",
        }
    },

    methods: {
        BuscarInmueble() {
            var endpoint = "http://localhost:8080/inmueble/busquedainmueble/" + this.Busquedatinmueble + '/' + this.BusquedaUbicacion;
            var opciones = { method: "GET" }
            fetch(endpoint, opciones).then(async response => {
                this.datos = await response.json();

                if (!this.datos.length) {
                    Swal.fire({
                        width: 300,
                        icon: 'question',
                        title: 'No hay Inmuebles disponibles por el momento',
                        text: "Inmueble no encontrado",
                        showConfirmButton: false,
                        timer: 1000
                    })
                }

            })
        }
    }
}
</script>