<template>
  <div>
    <button style="col-12" @click="callHello()">api/hello</button>
    <button style="col-12" @click="callUserList()">api/user/list</button>
    <h3>{{ response }}</h3>
    <div>{{users}}</div>
  </div>
</template>

<script>
import { AXIOS } from '../commons/http-commons';

console.log(AXIOS.baseURL);
export default {
  name: 'AxiosTest',
  data() {
    return {
      response: [],
      errors: [],
      users: '',
    };
  },
  methods: {
    callHello: function callHello() {
      AXIOS.get('api/user/hello')
        .then((response) => {
        // JSON responses are automatically parsed.
          this.response = response.data;
        })
        .catch((e) => {
          this.errors.push(e);
        });
    },
    callUserList: function callUserList() {
      AXIOS.get('api/user/list')
        .then((response) => {
        // JSON responses are automatically parsed.
          this.response = response.data;
        })
        .catch((e) => {
          this.errors.push(e);
        });
    },
  },
  created() {
    this.$http.get('http://localhost:30080/api/user/list').then((resp) => {
      console.log(resp);
      this.users = resp.data.response;
    });
  },
};
</script>
