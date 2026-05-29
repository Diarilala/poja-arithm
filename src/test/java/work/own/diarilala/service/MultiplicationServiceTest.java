package work.own.diarilala.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MultiplicationServiceTest {

  @InjectMocks MultiplicationService multiplicationService;

  @Test
  void multiply() {
    assertEquals(10, multiplicationService.multiply(2, 5));
  }

  void verify() {
    assertEquals(-10, multiplicationService.multiply(2, -5));
  }
}
