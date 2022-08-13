package CalculateAplication.controller;

import CalculateAplication.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculateController {


    CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping
    public String welcome() {
        return "Добро пожаловать!";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(name = "num1") Integer a,
                       @RequestParam(name = "num2") Integer b) {

      int plus = calculateService.plus(a, b);
        return a + " + " + b + "=" + plus;
    }
    @GetMapping("/minus")
    public String minus(@RequestParam(name = "num1") Integer a,
                       @RequestParam(name = "num2") Integer b) {

      int result = calculateService.minus(a, b);
        return a + " - " + b + "=" + result;
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam(name = "num1") Integer a,
                       @RequestParam(name = "num2") Integer b) {

      int result = calculateService.multiply(a, b);
        return a + " * " + b + "=" + result;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(name = "num1") Integer a,
                       @RequestParam(name = "num2") Integer b) {

     double result = calculateService.divide(a, b);
        return a + " / " + b + "=" + result;
    }


}
