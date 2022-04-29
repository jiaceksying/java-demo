package com.example.demo.freemarker;

import com.example.demo.model.entity.User;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ksying
 * @date 2022/4/25 19:12
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        try (FileWriter writer = new FileWriter("src/main/resources/static/test.html")) {
            Configuration configuration = new Configuration(Configuration.getVersion());
            configuration.setDirectoryForTemplateLoading(new File("src/main/resources/templates"));
            configuration.setDefaultEncoding("utf-8");
            Template template = configuration.getTemplate("list.ftl");

            List<User> users = new ArrayList<>();
            User user = new User();
            user.setName("zhangsan");
            user.setEmail("aaa");
            users.add(user);
            User user2 = new User();
            user2.setName("lisi");
            user2.setEmail("aaa");
            users.add(user2);
            User user3 = new User();
            user3.setName("wangwu");
            user3.setEmail("aaa");
            users.add(user3);
            User user4 = new User();
            user4.setName("xiaomei");
            user4.setEmail("aaa");
            users.add(user4);
            Map<Object, Object> map = new HashMap<>();
            map.put("users", users);

//            Map<String, String> hashMap = new HashMap<>(4);
//            hashMap.put("name", "jay");
//            hashMap.put("message", "this is a test message");
            //7.输出数据模型到文件中
            template.process(map, writer);
        } catch (TemplateException e) {
            throw new RuntimeException(e);
        }
    }
}
