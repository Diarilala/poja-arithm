package work.own.diarilala.rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import work.own.diarilala.service.DivisionService;

@RestController
@AllArgsConstructor

public class DivisionController {

    private final DivisionService divisionService;

    @GetMapping("/divide")
    public int divide(@RequestParam int a, @RequestParam int b) {
        return divisionService.divide(a, b);
    };
}