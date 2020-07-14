package cn.moonshotacademy;

import cn.moonshotacademy.PackageInterface;

import org.springframework.beans.factory.annotation.Autowired;

import cn.moonshotacademy.HelloInterface;

public class Package implements PackageInterface {
    @Autowired
    private HelloInterface helloInterface;

    public HelloInterface getHelloInterface() {
        return helloInterface;
    }
    public void setHelloInterface(HelloInterface helloInterface) {
        this.helloInterface = helloInterface;
    }
}