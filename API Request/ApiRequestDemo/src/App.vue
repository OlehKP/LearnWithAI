<script setup>
import { reactive, onMounted } from "vue";
import axios from "axios";

const postObj = reactive({
  postList: [],
});

onMounted(() => {
  axios.get("http://localhost:3000/posts").then((response) => {
    postObj.postList = response.data;
  });
});
</script>

<template>
  <div>RequestOPedia</div>
  <hr />

  <div v-for="post in postObj.postList" :key="post.id">
    <h2>{{ post.title }}</h2>
    <p>{{ post.body }}</p>
  </div>
</template>
