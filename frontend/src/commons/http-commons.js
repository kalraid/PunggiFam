import axios from 'axios';

export const AXIOS = axios.create({
  baseURL: 'http://localhost:30080',
  headers: {
    'Access-Control-Allow-Origin': 'http://localhost:8080/',
  },
});
