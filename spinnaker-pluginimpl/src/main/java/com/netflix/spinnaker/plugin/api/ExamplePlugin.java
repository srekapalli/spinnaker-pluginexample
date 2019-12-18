package com.netflix.spinnaker.plugin.api;

import com.netflix.spinnaker.kork.plugins.SpinnakerExtension;
import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

public class ExamplePlugin extends Plugin {

  /**
   * Constructor to be used by plugin manager for plugin instantiation. Your plugins have to provide
   * constructor with this exact signature to be successfully loaded by manager.
   *
   * @param wrapper
   */
  public ExamplePlugin(PluginWrapper wrapper) {
    super(wrapper);
  }

  @Extension
  @SpinnakerExtension(id = "srekapalli.exampleplugin")
  public static class ExamplePluginExtension implements ExampleExtension<String> {

    @Override
    public PluginOutput execute(PluginInput<String> input) {
      return new PluginOutput(true);
    }

    @Override
    public String getName() {
      return "SamplePluginApp";
    }
  }
}
