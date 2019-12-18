### Spinnaker Sample Application (With Plugins)

- Loads plugins located in 'plugins' folder.  Mostly default configs.
- Minimal dependencies.
- Contains extension point(pluginapi) definition and implementation (pluginimpl)
- Tweaked log levels to see debug message from pf4j and kork plugin wrappers.
- Verifies extension point is loaded as a bean and autowired.
- Actuator endpoint (/plugins) should be accessible. 