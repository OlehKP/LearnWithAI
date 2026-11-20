<template>
  <div class="container">
    <div>{{ message }}</div>
    <Contact></Contact>
  </div>
  <button-counter></button-counter>
</template>
<script setup>
import Contact from "./Contact.vue";
import ButtonCounter from "./ButtonCounter.vue";
const message = "Hello Vue";
</script>
<style scoped></style>
