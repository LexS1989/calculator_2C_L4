package pro.sky.calculator_2c_lesson_4.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator_2c_lesson_4.Service.CalculatorService;

import java.util.Objects;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String Welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1", required = false) Float num1,
                       @RequestParam(value = "num2", required = false) Float num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Не верно переданы параметры";
        }
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(value = "num1", required = false) Float num1,
                        @RequestParam(value = "num2", required = false) Float num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Не верно переданы параметры";
        }
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Float num1,
                           @RequestParam(value = "num2", required = false) Float num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Не верно переданы параметры";
        }
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(value = "num1", required = false) Float num1,
                         @RequestParam(value = "num2", required = false) Float num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Не верно переданы параметры";
        }
        if (num2 == 0) {
            return "Calculation error! Деление на 0 не возможно";
        } else {
            return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
        }
    }
}
