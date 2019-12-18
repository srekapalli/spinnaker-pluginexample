package com.netflix.spinnaker.app.controllers;

import com.netflix.spinnaker.plugin.api.ExampleExtension;
import com.netflix.spinnaker.plugin.api.PluginInput;
import com.netflix.spinnaker.plugin.api.PluginOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PluginController {

  @Autowired(required = false)
  ExampleExtension<String> exampleExtension;

  @RequestMapping("/")
  public PluginOutput isPluginLoaded() {
    return exampleExtension.execute(new PluginInput<String>("Test"));
  }
}
