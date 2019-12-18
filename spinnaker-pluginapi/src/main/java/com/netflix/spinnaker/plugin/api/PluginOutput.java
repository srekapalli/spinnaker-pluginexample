package com.netflix.spinnaker.plugin.api;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PluginOutput {

  Boolean executionStatus;
}
