<template>
  <el-header class="header">
    <el-menu mode="horizontal" :ellipsis="false">
      <el-menu-item index="1">
        <router-link to="/">Home</router-link>
      </el-menu-item>

      <el-menu-item index="2">
        <router-link to="/write">글 작성</router-link>
      </el-menu-item>
    </el-menu>
  </el-header>
</template>

<style scoped>
.header {
  padding: 0 40px;
  height: 60px;
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.06);
}
</style>
