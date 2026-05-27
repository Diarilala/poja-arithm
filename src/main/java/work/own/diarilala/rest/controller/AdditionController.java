package work.own.diarilala.rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import work.own.diarilala.service.AdditionService;

import java.math.BigDecimal;

@RestController
@AllArgsConstructor
public class AdditionController {

    private final  AdditionService additionService;

    @GetMapping("/add")
    public BigDecimal addition(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return additionService.add(a, b);
    };
}