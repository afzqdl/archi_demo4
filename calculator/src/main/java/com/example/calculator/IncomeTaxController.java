package com.example.calculator;

import com.example.calculator.IncomeTaxCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class IncomeTaxController {


    @PostMapping("/calculateTax")
    public double calculateTax(@RequestParam double income) {
        IncomeTaxCalculator incomeTaxCalculator=new IncomeTaxCalculator();
        return incomeTaxCalculator.calculateTax(income);
    }
}
