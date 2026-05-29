package work.own.diarilala.service;

import org.springframework.stereotype.Service;

@Service
public class DivisionService {
  public float divide(float a, float b) {
    if (b == 0) {
      throw new IllegalArgumentException("The denominator cannot be zero");
    }
    return a / b;
  }
}
