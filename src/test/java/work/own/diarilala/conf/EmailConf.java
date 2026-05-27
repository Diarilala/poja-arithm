package work.own.diarilala.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import work.own.diarilala.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
