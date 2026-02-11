<script setup lang="ts">
import axios from "axios";
import {ref} from "vue";
import {useRouter} from "vue-router";

const router = useRouter();

const posts = ref([]);

axios.get("/api/posts?page=1&size=5").then((response) => {
  response.data.forEach((r: any) => {
    posts.value.push(r);
  })
})

</script>

<template>
  <div>
    <el-card
      v-for="post in posts"
      :key="post.id"
      class="post-card"
      shadow="hover"
    >
      <h3 class="title">
        <router-link :to="{ name: 'read', params: { postId: post.id }}">
          {{ post.title }}
        </router-link>
      </h3>

      <p class="content">
        {{ post.content }}
      </p>
    </el-card>
  </div>
</template>

<style scoped>
.post-card {
  margin-bottom: 20px;
}

.title {
  margin-bottom: 10px;
}

.content {
  color: #666;
}
</style>
