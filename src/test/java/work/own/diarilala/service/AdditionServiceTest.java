package work.own.diarilala.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class AdditionServiceTest {
  private final AdditionService additionService = new AdditionService();

  @Test
  void add() {
    assertEquals(
        new BigDecimal("4.7"), additionService.add(new BigDecimal("0.2"), new BigDecimal("4.5")));
  }

  @Test
  void add1() {
    assertThrows(
        IllegalArgumentException.class,
        () -> additionService.add(new BigDecimal("-2"), new BigDecimal("9")));
  }
}
