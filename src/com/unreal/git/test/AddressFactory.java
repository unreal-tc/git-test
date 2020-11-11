package com.unreal.git.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author tangchao
 * @date 2020/11/11
 */
public class AddressFactory {
    public static final Address xiaoHongAddress = new Address(1,1,"北京");
    public static final Address xiaoMingAddress = new Address(2,2,"天津");
    public static final Address xiaoGangAddress = new Address(3,3,"俄罗斯");

    public static List<Address> getExample(){
        return Arrays.asList(xiaoHongAddress,xiaoMingAddress,xiaoGangAddress);
    }
}
