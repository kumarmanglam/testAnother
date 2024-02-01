package com.testAnother;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/bike")
@AllArgsConstructor
public class Controller {
    private Repository repository;
    @GetMapping
    public ResponseEntity<?> helloUser(){
        List<Bike> all = repository.findAll();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> saveCar(@RequestBody Bike car){
        Bike save = repository.save(car);
        return new ResponseEntity<>(save, HttpStatus.OK);
    }
}
