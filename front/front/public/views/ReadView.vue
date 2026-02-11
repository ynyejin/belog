<script setup lang="ts">
import {defineProps, onMounted, ref } from "vue";
import axios from "axios";
import {useRouter} from "vue-router";

const props = defineProps( {
  postId: {
    type: [Number, String],
    required: true,
  }
})

const post = ref({
  id: 0,
  title: "",
  content: "",
});

const router = useRouter();

const moveToEdit = () => {
  router.push({
    name: "edit",
    params: { postId: props.postId }
  });
}

onMounted(() => {
  axios.get(`/api/posts/${props.postId}`).then((response) => {
    post.value = response.data;
  });
});
</script>

<template>
  <el-card shadow="never" class="read-card">
    <h1 class="read-title">{{ post.title }}</h1>
    <div class="read-content">{{ post.content }}</div>

    <div class="btn-area">
      <el-button type="warning" @click="moveToEdit()">수정</el-button>
    </div>
  </el-card>
</template>

<style scoped>
.read-card {
  padding: 30px;
}

.read-title {
  font-size: 26px;
  margin-bottom: 20px;
}

.read-content {
  line-height: 1.8;
  white-space: pre-line;
  margin-bottom: 30px;
}

.btn-area {
  text-align: right;
}
</style>
