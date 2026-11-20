<template>
  <div class="container">
    <div>{{ message }}</div>
    <ProductCard product-name="Iphone 18" price="1500"></ProductCard>
  </div>
</template>
<script setup>
import ProductCard from "./ProductCard.vue";
const message = "Hello Vue";
</script>
<style scoped></style>
