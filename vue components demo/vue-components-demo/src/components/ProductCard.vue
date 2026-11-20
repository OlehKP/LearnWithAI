<template>
  <p>Product name: {{ productName }}</p>
  <p>Price: {{ price }} EUR</p>
</template>
<script setup>
defineProps({
  productName: {
    type: String,
    required: true,
  },
  price: {
    type: Number,
    required: true,
  },
});
</script>
