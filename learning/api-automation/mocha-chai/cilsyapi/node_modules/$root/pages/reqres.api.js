import BaseApi from '$root/pages/base.api';

const reqresApi = {
    register: (data) => BaseApi.post('/register', data),
    listUser: (param) => BaseApi.get(`/user?page=${param}`)
}

export default reqresApi;