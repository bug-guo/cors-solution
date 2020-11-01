// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import axios from 'axios'

import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

Vue.use(ElementUI)

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: {App},
  template: '<App/>'
})

axios.defaults.baseURL = 'http://127.0.0.1:8000'
axios.defaults.withCredentials = true
// axios.defaults.headers.common['Access-Control-Allow-Origin'] = 'true'
axios.interceptors.request.use(config => {
  // config.headers['Access-Control-Allow-Origin'] = true
  // config.headers['Content-Type'] = 'application/json;charset=utf-8'
  config.headers.Authorization = window.sessionStorage.getItem('token')
  return config
})
Vue.prototype.$http = axios
