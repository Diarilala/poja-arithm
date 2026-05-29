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
  public float subtract(@RequestParam float a, @RequestParam float b) {
    return substractionService.subtract(a, b);
  }
}
