import reqresApi from '$root/pages/reqres.api';
import * as data from '$root/data/user.data';
import { assert } from 'chai';
import { getParams } from '../helpers/lib-api';

describe('List User', () => {
    it('dfdfd', async () => {
        const param = getParams(data.LIST_USER_PARAM['page']);
        const response = await reqresApi.listUser(param);

        assert.equal(response.status, 200)
    })
})