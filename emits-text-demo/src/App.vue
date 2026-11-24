<script setup>
import { ref } from "vue";
import TextSizeButton from "./components/TextSizeButton.vue";
import TextDisplay from "./components/TextDisplay.vue";

const fontSize = ref(20);

function increaseFontSize() {
  fontSize.value += 2;
}

function decreaseFontSize() {
  if (fontSize.value > 12) {
    fontSize.value -= 2;
  }
}
</script>

<template>
  <main>
    <h1>Text Size with Vue Emits</h1>

    <div class="controls">
      <TextSizeButton label="Increase Text" @press="increaseFontSize" />
      <TextSizeButton label="Decrease Text" @press="decreaseFontSize" />
    </div>

    <p>Font size: {{ fontSize }} px (minimum: 12 px)</p>
    <TextDisplay text="I am learning Vue component events." :font-size="fontSize" />
  </main>
</template>
