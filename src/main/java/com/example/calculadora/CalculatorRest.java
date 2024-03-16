package com.example.calculadora;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class CalculatorRest {

    @PostMapping("/sum")
    ResponseEntity<Double> sum(@RequestBody Numbers numbers) {
        double ans = numbers.getA() + numbers.getB();
        return ResponseEntity.ok(ans);
    }

    @PostMapping("/res")
    ResponseEntity<Double> res(@RequestBody Numbers numbers) {
        double ans = numbers.getA() - numbers.getB();
        return ResponseEntity.ok(ans);
    }

    @GetMapping
    ResponseEntity<String> saludo() {
        return ResponseEntity.ok("Hola, bienvenido a la calculadora.");
    }
}
