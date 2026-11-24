<script setup>
const emit = defineEmits(["product-selected"]);
function sendEventInfo(event) {
  emit("product-selected", event);
}
</script>
<template>
  <button class="select" @click="sendEventInfo">Select</button>
</template>
<style scoped></style>
