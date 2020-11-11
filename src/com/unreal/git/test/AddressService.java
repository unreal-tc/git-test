package com.unreal.git.test;

/**
 * @author tangchao
 * @date 2020/11/11
 */
public interface AddressService {
    Address get(int id);
    Address getByUserId(int userId);
}
