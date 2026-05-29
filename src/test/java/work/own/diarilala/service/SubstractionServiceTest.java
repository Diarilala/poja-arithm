package work.own.diarilala.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SubstractionServiceTest {

  @InjectMocks SubstractionService substractionService;

  @Test
  void subtract() {
    assertEquals(4, substractionService.subtract(8, 4));
  }

  @Test
  void negative_data_handling() {
    assertThrows(IllegalArgumentException.class, () -> substractionService.subtract(4, -8));
  }
}
