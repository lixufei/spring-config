package com.thoughtworks.bean;

import com.thoughtworks.bean.operation.AddCalculator;
import com.thoughtworks.bean.operation.ICalculator;
import com.thoughtworks.bean.operation.PlusCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorClientTest {

    private CalculatorClient calculatorClient;

    @Before
    public void setUp() {
        ICalculator addCalculator = new AddCalculator();
        ICalculator plusCalculator = new PlusCalculator();
        calculatorClient = new CalculatorClient();
        calculatorClient.setAddCalculator(addCalculator);
        calculatorClient.setPlusCalculator(plusCalculator);
    }

    @Test
    public void shouldAdd() {
        assertThat(calculatorClient.add("23", "12"), is("35"));
        assertThat(calculatorClient.add("123", "12"), is("Error"));
    }

    @Test
    public void shouldPlus() {
        assertThat(calculatorClient.plus("23", "12"), is("2312"));
        assertThat(calculatorClient.plus("123", "12"), is("Error"));
    }
}