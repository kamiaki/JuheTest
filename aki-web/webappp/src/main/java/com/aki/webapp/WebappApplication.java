package com.aki.webapp;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.aki.common"})
@RestController
public class WebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebappApplication.class, args);
    }

    @Autowired
    private Animal animal;

    @RequestMapping(value = "test")
    public String test(){
        Map map = new HashMap();
        map.put("aaaa","dsdsa");
        map.put("aabaa","bdsdsa");
        Gson gson = new Gson();
        String s = gson.toJson(map);
        animal.eat();
        animal.roar();
        return "测试" + s;
    }

}
