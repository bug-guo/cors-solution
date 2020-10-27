import Vue from 'vue'
import Router from 'vue-router'
import LoginSuccess from '@/components/loginSuccess'
import Login from '@/components/login'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'login',
      component: Login
    },
    {
      path: '/LoginSuccess',
      name: 'loginSuccess',
      component: LoginSuccess
    }
  ]
})
