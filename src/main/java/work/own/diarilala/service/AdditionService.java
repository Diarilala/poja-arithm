package work.own.diarilala.service;

import java.math.BigDecimal;
import org.springframework.stereotype.Service;

@Service
public class AdditionService {
  public BigDecimal add(BigDecimal a, BigDecimal b) {
    if (a.compareTo(BigDecimal.ZERO) < 0 || b.compareTo(BigDecimal.ZERO) < 0) {
      throw new IllegalArgumentException("The data must be equal or greater than zero");
    }
    return a.add(b);
  }
}
