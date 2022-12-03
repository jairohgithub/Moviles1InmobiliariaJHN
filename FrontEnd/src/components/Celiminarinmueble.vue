<template>
    <div class="margen">
        <div class="bg-img">
            <form action="#" class="container">
                <div class="tituloradio">
                    <h1>Eliminar Inmueble</h1>
                </div>
                <div class="imgprincipal">
                    <img class="imginterna" src="../img/inmueble8.png" alt="No se encontró">
                </div><br>
                <label for="busqueda"><b></b></label>
                <input type="text" placeholder="Código Inmueble" name="busqueda" id="busqueda" v-model="busqueda"
                    required>
                <label for="tinmueble"><b></b></label>
                <input type="text" placeholder="Tipo Inmueble" name="tinmueble" id="tinmueble"
                    v-model="inmueble.tinmueble" required>


                <label for="vinmueble"><b></b></label>
                <input type="text" placeholder="Valor Arriendo" name="vinmueble" id="vinmueble"
                    v-model="inmueble.vinmueble" required>

                <label for="direccion"><b></b></label>
                <input type="text" placeholder="Direccion Inmueble" name="direccion" id="direccion"
                    v-model="inmueble.direccion" required>

                <label for="ubicacion"><b></b></label>
                <input type="text" placeholder="Ubicacion Inmueble" name="ubicacion" id="ubicacion"
                    v-model="inmueble.ubicacion" required>

                <label for="especificaciones"><b></b></label>
                <input type="text" placeholder="Especificaciones" name="especificaciones" id="especificaciones"
                    v-model="inmueble.especificaciones">
                <br><br>
                <div class="img">
                    <div class="imagenagregar">
                        <div class="img">
                            <div class="imagen">
                                <RouterLink to="/crearinmueble"><img class="imgclass" src="../img/crearInmueble.png"
                                        alt="No se encontró"></RouterLink>
                            </div>
                            <div class="imagen">
                                <img class="imgclass" src="../img/consultarinmueble.png" alt="No se encontró"
                                    v-on:click="BuscarInmueble">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="imagenultimo">
                    <div class="img">
                        <div class="imagen">
                            <RouterLink to="/actualizarinmueble"><img class="imgultim"
                                    src="../img/actualizarinmueble.png" alt="No se encontró"></RouterLink>
                        </div>
                        <div class="imagen">
                            <img class="imgultim" src="../img/eliminarinmueble.png" alt="No se encontró"
                                v-on:click="EliminarInmueble">
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
    top: -25px;
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
    left: 50px;
    top: -55px;

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
    top: -74px;
    left: -32px;

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
            busqueda: "",
            inmueble: "",
        }
    },

    methods: {
        BuscarInmueble() {
            var endpoint = "http://localhost:8080/inmueble/verinmueble/" + this.busqueda;
            var opciones = { method: "GET" };
            fetch(endpoint, opciones)
                .then(response => response.json())
                .then(data => { this.inmueble = data; console.log(data) })
        },
        EliminarInmueble() {
            var endpoint = "http://localhost:8080/inmueble/eliminarinmueble/" + this.busqueda;
            var opciones = { method: "DELETE" };
            fetch(endpoint, opciones)
                .then(response => response.json())
                .then(data => { this.inmueble = data; console.log(data) })
            alert("Usuario Eliminado con Exito");
        }
    }
}
</script>