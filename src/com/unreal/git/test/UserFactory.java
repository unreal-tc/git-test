package com.unreal.git.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author tangchao
 * @date 2020/11/11
 */
public class UserFactory {
    public static final User xiaoHong = new User(1,"小红",12,"15011002233");
    public static final User xiaoMing = new User(2,"小明",13,"15111002233");
    public static final User xiaoGang = new User(3,"小刚",11,"15211002233");

    public static List<User> getExample(){
        return Arrays.asList(xiaoHong,xiaoMing,xiaoGang);
    }
}
