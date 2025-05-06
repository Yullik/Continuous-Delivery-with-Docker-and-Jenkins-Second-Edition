package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Calculator class that performs basic arithmetic operations.
 */
public class Calculator {

    /**
     * Adds two numbers and returns the result.
     * 
     * @param num1 the first number
     * @param num2 the second number
     * @return the sum of the two numbers
     */
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}
