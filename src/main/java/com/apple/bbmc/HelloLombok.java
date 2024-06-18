package com.apple.bbmc;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombok {

    private String hello;
    private int lombok;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setHello("Hello, Lombok!");
        helloLombok.setLombok(1);
        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }

}
