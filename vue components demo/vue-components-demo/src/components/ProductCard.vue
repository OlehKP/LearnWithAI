<template>
  <p>Product name: {{ productName }}</p>
  <p>Price: {{ price }}</p>
</template>
<script setup>
defineProps(["productName", "price"]);
</script>
