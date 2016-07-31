package com.thoughtworks.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static CalculatorClient calculatorClient;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        calculatorClient = (CalculatorClient) context.getBean("calculatorClient");
        System.out.println(calculatorClient.add("12", "35"));
        System.out.println(calculatorClient.add("112", "35"));
        System.out.println(calculatorClient.plus("12", "35"));
        System.out.println(calculatorClient.plus("112", "35"));
    }

}
