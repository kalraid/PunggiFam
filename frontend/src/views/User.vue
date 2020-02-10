<template>
  <div class="home">
    <AxiosTest msg="Welcome to Your Vue.js App"/>
  </div>
</template>

<script>
// @ is an alias to /src
import AxiosTest from '@/components/AxiosTest.vue';

export default {
  name: 'User',
  components: {
    AxiosTest,
  },
};
</script>
