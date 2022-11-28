import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import VLogin from '../views/VLogin.vue'
import Vcrearcuenta from '../views/Vcrearcuenta.vue'
import Vbuscador from '../views/Vbuscador.vue'
import VbuscarUsuario from '../views/VbuscarUsuario.vue'
import Vcrearinmueble from '../views/Vcrearinmueble.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/login',
      name: 'Login',
      component: VLogin

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
