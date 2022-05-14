package com.example.demo.xiaomei.datastruct;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ksying
 * @date 2022/5/12 23:00
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("aaa", "aaaa");
        map.put("bbb", "aaaa");
        map.put("ccc", "aaaa");
        map.put("ddd", "aaaa");
        map.put("fff", "aaaa");
        map.put("eee", "aaaa");
        map.put("aaa", "aaa");
        System.out.println(map);

        Map<String, String> map1 = new ConcurrentHashMap<>();
        map1.put("sss", "fff");
    }
}
