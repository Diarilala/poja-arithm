package work.own.diarilala.rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import work.own.diarilala.service.MultiplicationService;

@RestController
@AllArgsConstructor
public class MultiplicationController {

  private final MultiplicationService multiplicationService;

  @GetMapping("/multiply")
  public float multiply(@RequestParam float a, @RequestParam float b) {
    return multiplicationService.multiply(a, b);
  }
  ;
}
