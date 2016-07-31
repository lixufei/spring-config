package com.thoughtworks.bean.operation;

import org.springframework.stereotype.Component;

@Component
public class PlusCalculator extends ICalculator {
    public PlusCalculator() {
    }

    @Override
    public String operate(String a, String b) {
        return a + b;
    }
}
