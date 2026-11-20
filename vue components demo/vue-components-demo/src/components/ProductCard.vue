<template>
  <p>Product name: {{ productName }}</p>
  <p>Price: {{ price }} EUR</p>
</template>
<script setup>
defineProps(["productName", "price"]);
</script>
