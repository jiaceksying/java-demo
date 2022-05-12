package com.example.demo.xiaomei.datastruct;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author ksying
 * @date 2022/5/12 22:57
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aaaa");
        set.add("bbbb");
        set.add("vvvv");
        set.add("cccc");
        set.add("jjjj");
        set.add("4444");
        set.add("vvvv");
        set.add("vvvv");
        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // 交集 差集 并集

    }
}
