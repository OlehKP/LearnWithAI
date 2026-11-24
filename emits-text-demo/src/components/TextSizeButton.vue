<script setup>
defineProps({
  label: {
    type: String,
    required: true,
  },
});

const emit = defineEmits(["press"]);
</script>

<template>
  <button type="button" @click="emit('press')">{{ label }}</button>
</template>
