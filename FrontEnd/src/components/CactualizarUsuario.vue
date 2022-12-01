<template>
    <div class="margen">
        <div class="bg-img">
            <form action="#" class="container">
                <div class="tituloradio">
                    <h1>Actualizar Usuario</h1>
                    <div class="img">
                        <img class="imguser" src="../img/usuario.png" alt="No se encontró">
                    </div><br><br>
                    <label for="busqueda"><b></b></label>
                    <input type="text" placeholder="Número de Documento para Buscar" name="busqueda" id="busqueda"
                        v-model="busqueda" required>

                    <label for="cedula"></label>
                    <input type="text" placeholder="Número de Documento" name="cedula" id="cedula"
                        v-model="usuario.cedula" required><br>

                    <label for="nombre"><b></b></label>
                    <input type="text" placeholder="Nombre Completo" name="nombre" id="nombre" v-model="usuario.nombre"
                         required>
                    <br>
                    <label for="telefono"><b></b></label>
                    <input type="text" placeholder="Telefono" name="telefono" id="telefono" v-model="usuario.telefono"
                       required><br>

                    <label for="direccion"><b></b></label>
                    <input type="text" placeholder="Direccion" name="direccion" id="direccion"
                        v-model="usuario.direccion" required><br>

                    <label for="email"><b></b></label>
                    <input type="email" placeholder="E-mail" name="email" id="correo" v-model="usuario.correo"
                        required><br>
                    <label for="pass"><b></b></label>
                    <input type="password" placeholder="Contraseña" name="pass" id="pass" v-model="usuario.pass"
                        required><br>

                </div>
            </form>
            <br>
            <div class="imgusuario">
                <div class="imagenagregar1">
                    <a><img class="imgclassusuario" src="../img/agragarUsuario.png" alt="No se encontró"></a>
                </div>
                <div class="imagenagregar2">
                    <a><img class="imgclassusuario" src="../img/buscarUsuario.png" alt="No se encontró"
                        v-on:click="BuscarUsuario"></a>
                </div>
            </div>


            <div class="imgusuario">
                <div class="imagenusuario">
                    <a><img class="imgclassusuario" src="../img/actualizarUsuario.png" alt="No se encontró"
                            v-on:click="ActualizarUsuario"></a>
                </div>
                <div class="imagenusuario">
                    <a><img class="imgclassusuario" src="../img/eliminarUsuario.png" alt="No se encontró"></a>
                </div>
            </div>
        </div>
    </div>
</template>
<style>
* {
    box-sizing: border-box;
}

/* .imguser {
    top: 10px;
} */

body {
    height: 100%;
}

img.imguser {
    position: relative;
    right: -80px;
    top: 20px;
}

.imgusuario {
    width: 100%;
    position: relative;
    display: flex;
    top: 355px;
    left: 70px;
    padding-left: 10px;
}

.imgclassusuario {
    padding-left: 10px;
}

.center {
    text-align: center;
    position: relative;
    margin: 0 auto;

}

a,
p {
    color: #ffffff;
}


.enlace {
    color: #000000;
    height: 50px;
    position: relative;
    width: 100%;
    top: 10px;
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

.enlaceRegistro2 {
    color: #000000;
    height: 50px;
    position: relative;
    width: 100%;
    top: -10px;
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

input,
button {
    width: 100%;
    height: 40px;
    position: relative;
    top: -20px;
    border-radius: 30px;
    text-align: center;

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
input[type=textusuario],
input[type=passwordusuario] {
    width: 100%;
    padding: 10px;
    margin: 5px 0 12px 0;
    border: none;
    /* background: #f1f1f1; */
}

input[type=textusuario]:focus,
input[type=passwordusuario]:focus {
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
            busqueda: "",
            usuario: {},
            cedula: "",
            nombre: "",
            telefono: "",
            direccion: "",
            correo: "",
            pass: "",

            // datos: [],

        }
    },

    methods: {
        ActualizarUsuario() {
            var endpoint = "http://localhost:8080/usuario/guardar";
            var opciones = {
                method: "POST",
                headers: { "Content-type": "Application/json" },
                body: JSON.stringify({ cedula: this.usuario.cedula, nombre: this.usuario.nombre, telefono: this.usuario.telefono, direccion: this.usuario.direccion, correo: this.usuario.correo, pass: this.usuario.pass })
            }
            fetch(endpoint, opciones).then(async Response => {
                // alert('Guardado Correctamente');
                try {
                    if (Response.status)
                        Swal.fire({
                            icon: 'question',
                            title: 'Desea Actualizar Usuario?',
                            showDenyButton: true,
                            showCancelButton: false,
                            confirmButtonText: 'Actualizar',
                            denyButtonText: `Cancelar`,
                        }).then((result) => {
                            if (result.isConfirmed) {
                                Swal.fire('Actualizado con exito', '', 'success')
                                this.$router.push('/');

                            } else if (result.isDenied) {
                                Swal.fire('Los cambios no se Actualizaron', '', 'warning')
                                return false
                            }
                        })
                    else {
                        alert("error")
                    }
                } catch (error) {
                    return "{\"sucess\":false ,\"message\":\"Error al intentar actualizar.\"}";
                }
            })
        },
        BuscarUsuario() {
            var endpoint = "http://localhost:8080/usuario/verusuario/" + this.busqueda;
            var opciones = { method: "GET" };
            fetch(endpoint, opciones)
                .then(response => response.json())
                .then(data => { this.usuario = data; console.log(data) })
        }

        // ValidarUsuario() {
        //     var endpoint = "http://localhost:8080/usuario/login";
        //     var opciones = {
        //         method: "POST",
        //         headers: { "Content-type": "Application/json" },
        //         body: JSON.stringify({ email: this.email, pass: this.pass})
        //     }
    }
}
</script>