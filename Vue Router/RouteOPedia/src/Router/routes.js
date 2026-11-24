import { createRouter, createWebHistory } from "vue-router";
import Contact from "@/components/Home/Contact.vue";
import HomePage from "@/components/Home/HomePage.vue";
import ProductList from "@/components/Product/ProductList.vue";
import ProductDetail from "@/components/Product/ProductDetail.vue";
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: "/", component: HomePage },
    { path: "/contact", component: Contact },
    { path: "/productDetail", component: ProductDetail },
    { path: "/productList", component: ProductList },
  ],
});

export default router;
