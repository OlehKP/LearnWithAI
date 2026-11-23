<script setup>
defineProps(["name", "price", "accessibility"]);
import selectButton from "./selectButton.vue";
//defineEmits(["sendSelectedProducts"]);
let isSelected = false;
function getSelectedProduct(event) {
  isSelected = true;
  event.target.disabled = true;
  const parent = event.target.parentElement.parentElement;
  const selectedProductPrice = parent.firstChild.nextSibling.textContent;
  console.log(selectedProductPrice);
}
</script>
<template>
  <div class="productCards">
    <div class="product">
      <h2>{{ name }}</h2>
      <p>{{ price + "$" }}</p>
      <p v-if="accessibility">Avaible</p>
      <p v-else>Not avaible</p>
      <div v-show="accessibility">
        <selectButton @product-selected="getSelectedProduct"></selectButton>
      </div>
    </div>
  </div>
</template>
<style scoped>
.product {
  background-color: rgb(208, 211, 211);
  padding: 20px;
  border-radius: 20px;
}
.product:hover {
  background-color: aliceblue;
}
.productCards {
  margin: 30px;
  padding: 20px;
  float: left;
}
</style>
