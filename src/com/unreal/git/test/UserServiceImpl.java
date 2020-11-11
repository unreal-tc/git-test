package com.unreal.git.test;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author tangchao
 * @date 2020/11/11
 */
public class UserServiceImpl implements UserService{
    @Override
    public User get(int id) {
        for (User user : UserFactory.getExample()) {
            if(user.getId()==id) return user;
        }
        return null;
    }
}
