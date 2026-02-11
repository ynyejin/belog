<script setup lang="ts">
import {ref} from "vue";

import axios from "axios";
import {useRouter} from "vue-router";

const title = ref("");
const content = ref("");

const router = useRouter();

const write = function() {
  axios.post("/api/posts", {
    title: title.value,
    content: content.value
  })
    .then(() => {
      router.replace({ name: "home" });
    });
};

</script>

<template>
  <el-card class="form-card">
    <el-input
      v-model="title"
      placeholder="제목을 입력해주세요"
      size="large"
    />

    <div class="mt">
      <el-input
        v-model="content"
        type="textarea"
        rows="15"
      />
    </div>

    <div class="btn-area">
      <el-button type="primary" @click="write()">글 작성완료</el-button>
    </div>
  </el-card>
</template>

<style scoped>
.form-card {
  padding: 30px;
}

.mt {
  margin-top: 20px;
}

.btn-area {
  margin-top: 20px;
  text-align: right;
}
</style>
