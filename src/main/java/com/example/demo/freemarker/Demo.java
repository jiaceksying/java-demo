package com.example.demo.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
            Template template = configuration.getTemplate("test.ftl");

            Map<String, String> hashMap = new HashMap<>(4);
            hashMap.put("name", "jay");
            hashMap.put("message", "this is a test message");
            //7.输出数据模型到文件中
            template.process(hashMap, writer);
        } catch (TemplateException e) {
            throw new RuntimeException(e);
        }
    }
}
