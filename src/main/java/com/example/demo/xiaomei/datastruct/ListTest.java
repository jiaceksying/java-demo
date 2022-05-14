package com.example.demo.xiaomei.datastruct;

import org.apache.catalina.User;

import java.util.*;

/**
 * @author ksying
 * @date 2022/5/12 21:20
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("aaaa");
        list1.add("bbbb");
        list1.add("cccc");
        List<String> list = new ArrayList<>();
        // 添加元素
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add("dddd");
        list.add("eeee");
        list.add("ffff");
        list.add("gggg");
        System.out.println(list);
        list.addAll(list1);
        System.out.println(list);
        // 删
        list.remove("aaaa");
        list.remove(1);
        System.out.println(list);
        // 查
        System.out.println(list.get(0));
        // 改
        String a = list.get(0);
        String b = "ffff";
        if (!a.equals(b)){
            list.remove(0);
            list.add(0, a);
            System.out.println(list);
        }
//        [a, b, c]  [b, c, d]
        // ArrayList        查询快，操作慢
        // LinkedList       查询慢，操作快
//        时间复杂度
//        空间复杂度
//        ["1", "2", "3"] list.get(5kw) O(1) "5kw"
//        linkedList       5kw          O(n)
//                                      O(n^2)
//        for (int i = 0; i < 100; i++) {
//            for (int j = 0; j < 100 - i; j++) {
//                a = b;
//                b = c;
//                c = a;
//            }
//        }
        // 交集 差集 并集
        List<String> result = new ArrayList<>();
        List<String> list11 = new ArrayList<String>() {
            {
                add("aaa");
                add("aaa");
                add("ddd");
                add("bbb");
                add("fff");
            }
        };
        List<String> list22 = new ArrayList<String>() {
            {
                add("aaa");
                add("bbb");
                add("ccc");
            }
        };

        result.clear();
        result.addAll(list11);
        result.retainAll(list22);
        System.out.println("交集：" + result);

        // 交集简单实现
        result.clear();
        for (int i = 0; i < list11.size(); i++) {
            String s = list11.get(i);
            if (list22.contains(s)) {
                result.add(s);
            }
        }
        System.out.println(result);

        result.clear();
        result.addAll(list11);
        result.removeAll(list22);
        System.out.println("差集：" + result);

        result.clear();
        result.addAll(list11);
        result.addAll(list22);
        System.out.println("并集：" + result);
    }
}
