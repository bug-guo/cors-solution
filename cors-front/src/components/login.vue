<template>
  <el-container>
    <el-main>
      <h3>普通登录方式</h3>
      <el-row style="margin-top: 10px">
        <el-col :span="6"></el-col>
        <el-col :span="3">用户名：</el-col>
        <el-col :span="3">
          <el-input v-model="user.username"/>
        </el-col>
        <el-col :span="6"/>
      </el-row>
      <el-row style="margin-top: 10px">
        <el-col :span="3">密码：</el-col>
        <el-col :span="3">
          <el-input v-model="user.password"/>
        </el-col>
      </el-row>
      <el-row style="margin-top: 10px">
        <el-col :span="4">
          <el-button type="primary" @click="submit">普通登录</el-button>
        </el-col>
        <el-col :span="4">
          <el-button type="primary" @click="submit(1)">CorsOrigin登录</el-button>
        </el-col>
        <el-col :span="4">
          <el-button type="primary" @click="submit(2)">基于过滤器登录</el-button>
        </el-col>
        <el-col :span="4">
          <el-button type="primary" @click="submit(3)">基于拦截器登录</el-button>
        </el-col>
      </el-row>

    </el-main>
  </el-container>
</template>

<script>
  import Axios from 'axios'

  export default {
    name: 'HelloWorld',
    data () {
      return {
        user: {
          username: 'admin',
          password: '123'
        }
      }
    },
    methods: {
      submit (type) {
        let that = this
        let url = 'http://www.cas.com:8000'
        if (type === null) {
        } else if (type === 1) {
          url += '/cors'
        } else if (type === 2) {
          url += '/filter'
        } else if (type === 3) {
          url += '/webfilter'
        }
        url += '/login'
        this.$http.post(url, this.user).then(function (res) {
          console.log(res.data)
          that.$router.push({path: 'LoginSuccess', params: {tips: res.data}})
        }).catch(function (error) {
          console.log(error)
        })
      }
    }
  }
</script>
