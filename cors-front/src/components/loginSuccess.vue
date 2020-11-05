<template>
  <el-container>
    {{tips}}

  </el-container>
</template>

<script>

  export default {
    name: 'HelloWorld',
    created () {
      // console.log(this.$route.query)
      this.tips = this.$route.query.tips
      console.log(this.tips)
    },
    data () {
      return {
        tips: ''
      }
    }
  }
</script>
