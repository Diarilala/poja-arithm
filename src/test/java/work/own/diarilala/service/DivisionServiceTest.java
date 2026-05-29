package work.own.diarilala.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DivisionServiceTest {

  @InjectMocks DivisionService divisionService;

  @Test
  void divide() {
    assertEquals(9, divisionService.divide(81, 9));
  }

  @Test
  void impossible_operation() {
    assertThrows(IllegalArgumentException.class, () -> divisionService.divide(9, 0));
  }
}
