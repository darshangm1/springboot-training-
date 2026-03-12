package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class Addition {

    @GetMapping("/add")
    public int addNumbersquery(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/add/{a}/{b}")
    public int addNumberspath(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    @PostMapping("/addBody")
    public int addNumbersBody(@RequestBody Numbers numbers) {
        return numbers.getA() + numbers.getB();
    }

    @PostMapping("/addForm")
    public int addNumbersForm(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @PostMapping("/studentResult")
public String calculateResult(@RequestBody Student student) {

    int total = student.getSubject1()
            + student.getSubject2()
            + student.getSubject3()
            + student.getSubject4()
            + student.getSubject5();

        
    double average = total / 5.0;

    if (average >= 70) {
        return "PASS - Average: " + average + " - Total: " + total;
    } else {
        return "FAIL - Average: " + average + " - Total: " + total;
    }
}

}