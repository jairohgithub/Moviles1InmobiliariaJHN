import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import VLogin from '../views/VLogin.vue'
import Vcrearcuenta from '../views/Vcrearcuenta.vue'
import Vbuscador from '../views/Vbuscador.vue'
import VbuscarUsuario from '../views/VbuscarUsuario.vue'
import Vcrearinmueble from '../views/Vcrearinmueble.vue'
import actualizarUser from '../views/actualizarUser.vue'
import VeliminarUsuario from '../views/VeliminarUsuario.vue'
import Vbuscarinmueble from '../views/Vbuscarinmueble.vue'
import Vactualizarinmueble from '../views/Vactualizarinmueble.vue'
import Veliminarinmueble from '../views/Veliminarinmueble.vue'
import Vusuarios from '../views/Vusuarios.vue'
import Vpass from '../views/Vpass.vue'
import Vbusquedainmueble from '../views/Vbusquedainmueble.vue'
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'login',
      component: VLogin

    },
    {
      path: '/pass',
      name: 'Pass',
      component: Vpass

    },

    {
      path: '/cuenta',
      name: 'Cuenta',
      component: Vcrearcuenta

    },

    {
      path: '/buscador',
      name: 'Buscador',
      component: Vbuscador

    },

    {
      path: '/busquedainmueble',
      name: 'BusquedaInmueble',
      component: Vbusquedainmueble

    },

    {
      path: '/usuarios',
      name: 'Usuarios',
      component: Vusuarios

    },

    {
      path: '/buscadorUsuario',
      name: 'BuscadorUsuario',
      component: VbuscarUsuario

    },

    {
      path: '/crearinmueble',
      name: 'Crearinmueble',
      component: Vcrearinmueble

    },

    {
      path: '/actualizarUser',
      name: 'ActualizarUser',
      component: actualizarUser

    },

    {
      path: '/eliminarUser',
      name: 'EliminarUser',
      component: VeliminarUsuario

    },
    {
      path: '/buscarinmueble',
      name: 'BuscarInmueble',
      component: Vbuscarinmueble

    },
    {
      path: '/actualizarinmueble',
      name: 'ActualizarInmueble',
      component: Vactualizarinmueble
    },
    {
      path: '/eliminarinmueble',
      name: 'EliminarInmueble',
      component: Veliminarinmueble
    },
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/AboutView.vue')
    }
  ]
})

export default router
