import reqresApi from '$root/pages/reqres.api';
import * as data from '$root/data/user.data';
import { assert } from 'chai';

describe('Register', function() {
    it('Should unseccesfully register when inserted invalid data', async () => {
        const response = await reqresApi.register(data.INVALID_REGISTER);

        assert.equal(response.status, 400);
        assert.isString(response.data.error);
        assert.equal(response.data.error, data.INVALID_REGISTER_RESPONSE.error);
    });

    it('Should succesfuly register when inserted valid data', async () => {
        const response = await reqresApi.register(data.VALID_REGISTER);

        assert.equal(response.status, 200);
        assert.containsAllKeys(response.data, ["id", "token"]);
        assert.isNumber(response.data.id);
        assert.isString(response.data.token);
    })
})