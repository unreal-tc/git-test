package com.unreal.git.test;

/**
 * @author tangchao
 * @date 2020/11/11
 */
public class AddressServiceImpl implements AddressService{
    @Override
    public Address get(int id) {
        for (Address address : AddressFactory.getExample()) {
            if (address.getId()==id) return address;
        }
        return null;
    }

    @Override
    public Address getByUserId(int userId) {
        for (Address address : AddressFactory.getExample()) {
            if (address.getUserId()==userId) return address;
        }
        return null;
    }
}
