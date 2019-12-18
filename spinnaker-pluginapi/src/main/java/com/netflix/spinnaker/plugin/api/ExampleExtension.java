package com.netflix.spinnaker.plugin.api;

import com.netflix.spinnaker.kork.annotations.Beta;
import org.pf4j.ExtensionPoint;

/**
 * This is the extension point that the application will expose for plugin developers to implement.
 *
 * @param <T> is a class plugin developers will create to have a concrete class that has all of the
 *     fields that are required.
 */
@Beta
public interface ExampleExtension<T> extends ExtensionPoint {

  /**
   * When this plugin runs, the execute method gets called.
   *
   * @param input input provided by the caller.
   * @return outputs as returned by the stage.
   */
  PluginOutput execute(PluginInput<T> input);

  /** @return name of the implementation app */
  String getName();
}
