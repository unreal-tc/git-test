package com.unreal.git.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=input.nextInt();
        System.out.println(new UserServiceImpl().get(i));
    }
}
