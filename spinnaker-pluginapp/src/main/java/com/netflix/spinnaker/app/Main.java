package com.netflix.spinnaker.app;

import com.netflix.spinnaker.config.PluginsAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(PluginsAutoConfiguration.class)
class Main {

  public static void main(String args[]) {
    SpringApplication.run(Main.class, args);
  }
}
