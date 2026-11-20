<template>
  <div class="container">
    <ProductCard product-name="Keyboard" :price="50"></ProductCard>
    <ProductCard product-name="Mouse" :price="25"></ProductCard>
  </div>
</template>
<script setup>
import ProductCard from "./ProductCard.vue";
</script>
<style scoped></style>
