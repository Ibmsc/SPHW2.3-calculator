package CalculateAplication.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    public int plus(Integer a, Integer b) {
        return a + b;
    }
    public int minus(Integer a, Integer b) {
        return a - b;
    }
    public int multiply(Integer a, Integer b) {
        return a * b;
    }
    public double divide(Integer a, Integer b){
    return a / b;
    }
}
