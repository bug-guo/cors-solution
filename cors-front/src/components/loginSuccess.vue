<template>
  <el-container>
    <el-tag v-model="tips"></el-tag>

  </el-container>
</template>

<script>

  export default {
    name: 'HelloWorld',
    created () {
      console.log(this.$router.params)
      this.tips = this.$router.params.tips
    },
    data () {
      return {
        tips: ''
      }
    }
  }
</script>
