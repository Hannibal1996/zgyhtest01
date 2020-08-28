package test;

import user.user;

public class test {
    public static void main(String[] args) {
        user user = new user();
        user.setId(1);
        user.setUsername("高永涵");
        user.setPassword("12345");
        System.out.println(user.getId());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
    }
}
