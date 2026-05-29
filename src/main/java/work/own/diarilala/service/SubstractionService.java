package work.own.diarilala.service;

import org.springframework.stereotype.Service;

@Service
public class SubstractionService {
  public float subtract(float a, float b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("The data must be equal or greater than zero");
    }
    return a - b;
  }
}
