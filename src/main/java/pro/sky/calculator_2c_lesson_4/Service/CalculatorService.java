package pro.sky.calculator_2c_lesson_4.Service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public float plus(float a, float b) {
        return a + b;
    }

    public float minus(float a, float b) {
        return a - b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public float divide(float a, float b) {
        return a / b;
    }
}