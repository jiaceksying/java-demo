package com.example.demo.xiaomei;

import java.util.*;

/**
 * @author ksying
 * @date 2022/4/26 22:19
 */
public class BasicLesson1 {
    public static void main(String[] args) {
        // 循环
        List<String> str = new ArrayList<>();
        str.add("asdf");
        str.add("asdf");
        str.add("aef");
        str.add("asdf");
        str.add("asdf");
        User user = new User("xiaomei", "aa");
        User user1 = new User("xiaomei1", "aa");
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        // fori
        User u1 = null;
        for (int i = 0; i < users.size(); i++) {
            if ("xiaomei".equals(users.get(i).getName())) {
                u1 = users.get(i);
                break;
            }
            System.out.println(str.get(i));
        }
        System.out.println("******************************");
        // for
        for (String s : str) {
            if ("sdf".equals(s)) {
                s = "ges";
            }
            System.out.println(s);
        }
        System.out.println(str);
        // foreach
        str.forEach(s -> System.out.println(s));
        // while
        int i = 0;
        while (true && i < 10000) {
            i++;
        }
        // do-while
        do {
            System.out.println("aa");
        } while (false);
        // 判断
        // if-else
        if (true) {
            System.out.println("aa");
        } else if(true) {
            System.out.println("ccc");
        } else {
            System.out.println("bb");
        }
        // switch
        int i2 = 10;
        switch (i2) {
            case 10:
                System.out.println("aaa");
            case 20:
                System.out.println("bbb");
            default:
                System.out.println("ccc");
        }

    }
    public void basicVar() {
        // byte short int long float double char boolean
        byte a = 0;
        short sh = 0;
        int i = 0;
        Integer in = 20;
        System.out.println("sd34dg".hashCode());
        long l = 0L;
        float f = 0.0F;
        double d = 0.0;
        boolean bool = false;
        char ch = 'a';
    }
}


class User{
    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
