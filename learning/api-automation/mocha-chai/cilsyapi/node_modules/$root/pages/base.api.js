import dotaenv from 'dotenv';
import axios from 'axios';

dotaenv.config();

const BaseApi = axios.create({
    baseURL: process.env.BASE_URL,
    headers:{
        "content-type": "application/json",
        "accept": "*/*"
    },
    validateStatus: function () {
        return true;
    }
})

export default BaseApi;