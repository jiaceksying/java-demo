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
        Set<String> result = new HashSet<>();
        Set<String> set1 = new HashSet<String>() {
            {
                add("aaa");
                add("ddd");
                add("bbb");
                add("fff");
            }
        };
        Set<String> set2 = new HashSet<String>() {
            {
                add("aaa");
                add("bbb");
                add("ccc");
            }
        };

        result.clear();
        result.addAll(set1);
        result.retainAll(set2);
        System.out.println("交集：" + result);

        result.clear();
        result.addAll(set1);
        result.removeAll(set2);
        System.out.println("差集：" + result);

        result.clear();
        result.addAll(set1);
        result.addAll(set2);
        System.out.println("并集：" + result);
    }
}
