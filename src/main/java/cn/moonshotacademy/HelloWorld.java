package cn.moonshotacademy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("HelloWorld1")
public class HelloWorld implements HelloInterface {
    private String name;

    public HelloWorld() {

    }

    public HelloWorld(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Value("Hello, World!")
    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name);
    }
}