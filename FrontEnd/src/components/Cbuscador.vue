<template>
     <div class="margen">
        <div class="bg-img">
            <form action="#" class="container">
                <div class="tituloradio">
                    <h1>Buscador</h1>
                    <label for="ubicacion"><b></b></label>
                    <input type="text" placeholder="Ubicación" name="Ubicación">
                    <label for="tipoinmueble"><b></b></label>
                    <input type="text" placeholder="Tipo Inmueble" name="tipoinmueble">
                    <label for="ubicacion"><b></b></label>
                    <input type="text" placeholder="Tipo Arriendo" name="Ubicación">
                    <div class="enlace">
                        <a class="color" href="../../vistas/resultadoBusqueda.html">Buscar</a>
                    </div><br>
                    <!-- :key="index" v-for="(item,index) in 5" -->
                    <h2>Recomendados</h2>
                    <div class=" imag">
                        <div class="img">
                            <img class="imgclass" src="../img/inmueble1.png" alt="No se encontró">
                            <p>350.000 COP</p>
                            <p>AGUACHICA-CESAR</p>
                            <p>BARRIO:</p>
                            <p>MARIA EUGENIA ALTO</p>
                        </div>
                        <div class="img">
                            <img class="imgclass" src="../img/inmueble2.jpg" alt="No se encontró">
                            <p>250.000 COP</p>
                            <p>AGUACHICA-CESAR</p>
                            <p>BARRIO:</p>
                            <p>MARIA EUGENIA ALTO</p>
                        </div>
                    </div><br>
                    <div class=" imag">
                        <div class="img">
                            <img class="imgclass" src="../img/inmueble3.jpg" alt="No se encontró">
                            <p>350.000 COP</p>
                            <p>AGUACHICA-CESAR</p>
                            <p>BARRIO:</p>
                            <p>MARIA EUGENIA ALTO</p>
                        </div>
                        <div class="img">
                            <img class="imgclass" src="../img/inmueble4.png" alt="No se encontró">
                            <p>250.000 COP</p>
                            <p>AGUACHICA-CESAR</p>
                            <p>BARRIO:</p>
                            <p>MARIA EUGENIA ALTO</p>
                        </div>
                    </div><br>
                    <div class="enlac">
                        <a class="color" href="../../vistas/crearInmueble.html">Crear Inmueble</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
</template>
<style scoped>

* {
  box-sizing: border-box
}


body {
  height: 100%;
}

/* Slideshow container */
.slideshow-container {
  max-width: 100%;
  width: 100%;
  position: relative;
  margin: auto;
}

@-webkit-keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

@keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}


.mySlides {
  display: none;

}

/* Next & previous buttons */
.prev,
.next {
  cursor: pointer;
  position: absolute;
  top: 50%;
  width: auto;
  margin-top: -22px;
  padding: 16px;
  color: white;
  font-weight: bold;
  font-size: 18px;
  transition: 0.6s ease;
  border-radius: 0 3px 3px 0;
  user-select: none;
}

a.color{
    color: white;
}

/* Position the "next button" to the right */
.next {
  right: 0;
  border-radius: 3px 0 0 3px;
}

/* On hover, add a black background color with a little bit see-through */
.prev:hover,
.next:hover {
  background-color: rgba(0, 0, 0, 0.8);
}

/* Caption text */
.text {
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 100%;
  text-align: center;
}

/* Number text (1/3 etc) */
.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}

/* The dots/bullets/indicators */
.dot {
  cursor: pointer;
  height: 15px;
  width: 15px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}

.active,
.dot:hover {
  background-color: #717171;
}

/* Fading animation */
.fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}

@-webkit-keyframes fade {
  from {
    opacity: .4
  }

  to {
    opacity: 1
  }
}

@keyframes fade {
  from {
    opacity: .4
  }

  to {
    opacity: 1
  }
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

.container {
  position: center;
  right: 0;
  margin: 20px;
  max-width: 300px;
  padding: 16px;
  /* background-color: white; */
}

.margen {
  position: relative;
  width: 100%;
  margin: 0 auto;
}

h1 {
  text-align: center;
  font-family: 'Times New Roman', Times, serif;
  color: #ffffff;
  font-size: 24px;
}

input::placeholder {
  text-align: center;
  font-family: 'Times New Roman', Times, serif;
  font-size: 10px;
}

/* Full-width input fields */
input[type=text],
input[type=password] {
  width: 40%;
  padding: 15px;
  margin: 5px 0 22px 0;
  border: none;
  border-radius: 30px;
  top: 6px;
  left: 20px;

  /* background: #f1f1f1; */
}

input[type=text]:focus,
input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Full-width input fields */
input[type=tinmueble],
input[type=password] {
  width: 40%;
  padding: 15px;
  margin: 5px 0 22px 0;
  border: none;
  border-radius: 30px;
  margin-left: 10%;
  margin-top: -80%;
  top: 10px;
  left: 10px;
  /* background: #f1f1f1; */
}

input[type=text]:focus,
input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

.enlace {
  color: #000000;
  height: 50px;
  position: relative;
  width: 40%;
  left: 10px;
  margin-left: 50%;
  margin-top: -30%;
  top: 20px;
  font-family: 'Times New Roman', Times, serif;
  text-align: center;
  border-radius: 30px;
  background-color: #0997F9;
  padding: 0px 0px;
  border: none;
  cursor: pointer;
  opacity: 0.9;
  padding-top: 15px;
}

p {
  color: #ffffff;
  font-family: Arial, Helvetica, sans-serif;
  font-size: 10px;
  margin: 0;
}

h2 {
  color: #ffffff;
}

.imag {
  width: 100%;
  display: flex;
  padding-left: 0%;

}

.imgclass{
  width:100%;
  padding: 4px;
}

.enlac {
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

img{
    position: relative;
    left: -10px;
    top: 1px;
}
</style>