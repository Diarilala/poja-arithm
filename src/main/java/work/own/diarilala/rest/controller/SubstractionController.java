package work.own.diarilala.rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import work.own.diarilala.service.SubstractionService;

@RestController
@AllArgsConstructor

public class SubstractionController {

    private final SubstractionService substractionService;

    @GetMapping("/substract")
    public int substract(@RequestParam int a, @RequestParam int b) {
        return substractionService.substract(a, b);
    }
}