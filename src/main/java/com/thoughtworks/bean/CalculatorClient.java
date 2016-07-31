package com.thoughtworks.bean;

import com.thoughtworks.bean.operation.AddCalculator;
import com.thoughtworks.bean.operation.ICalculator;
import com.thoughtworks.bean.operation.PlusCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorClient {
    @Autowired
    private ICalculator addCalculator;
    @Autowired
    private ICalculator plusCalculator;

    public CalculatorClient() {
    }

    public String add(String a, String b) {
        return addCalculator.add(a, b);
    }

    public String plus(String a, String b) {
        return plusCalculator.add(a, b);
    }

    public void setAddCalculator(ICalculator addCalculator) {
        this.addCalculator = addCalculator;
    }

    public void setPlusCalculator(ICalculator plusCalculator) {
        this.plusCalculator = plusCalculator;
    }
}
