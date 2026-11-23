<script setup>
defineProps({
  text: {
    type: String,
    required: true,
  },
  fontSize: {
    type: Number,
    required: true,
  },
});
</script>

<template>
  <p class="preview" :style="{ fontSize: fontSize + 'px' }">{{ text }}</p>
</template>
