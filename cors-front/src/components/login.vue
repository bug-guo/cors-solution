<template>
  <el-container>
    <el-row >
      <el-col :span="12"><label>用户名：</label></el-col>
      <el-col :span="12"><el-input v-model="user.username"/></div></el-col>
    </el-row>
    <el-row >
      <el-col :span="12"><el-label>密码：</el-label></el-col>
      <el-col :span="12"><el-input v-model="user.password"/></div></el-col>
    </el-row>
    <el-row >
     <el-col :span="24"> <el-button type="primary" onclick="submit">登录</el-button></el-col>
    </el-row>

  </el-container>
</template>

<script>
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
    method: {
      submit () {

      }
    }
  }
</script>
