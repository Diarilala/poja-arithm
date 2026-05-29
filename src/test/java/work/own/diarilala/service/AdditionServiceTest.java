package work.own.diarilala.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import work.own.diarilala.rest.controller.AdditionController;

@ExtendWith(MockitoExtension.class)
class AdditionServiceTest {

  @Mock AdditionController additionController;

  @InjectMocks AdditionService additionService;

  @Test
  void add() {
    assertEquals(6, additionService.add(2, 4));
  }

  @Test
  void negative_data_handling() {
    assertThrows(IllegalArgumentException.class, () -> additionService.add(-2, 9));
  }
}
