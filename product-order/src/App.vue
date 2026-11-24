<script setup>
const products = [
  {
    name: "Keyboard",
    price: 50,
    isAvailable: true,
  },
  {
    name: "Mouse",
    price: 25,
    isAvailable: true,
  },
  {
    name: "Monitor",
    price: 200,
    isAvailable: false,
  },
];

import productCard from "./components/productCard.vue";
</script>

<template>
  <div v-for="product in products">
    <productCard
      :name="product.name"
      :price="product.price"
      :accessibility="product.isAvailable"
    ></productCard>
  </div>
</template>
