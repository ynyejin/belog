<template>
  <el-main class="content">
    <el-row justify="center">
      <el-col :xs="24" :sm="20" :md="16" :lg="12">
        <RouterView />
      </el-col>
    </el-row>
  </el-main>
</template>

<style scoped>
.content {
  padding: 40px 20px;
  min-height: calc(100vh - 60px);
  background-color: #f5f7fa;
}
</style>
