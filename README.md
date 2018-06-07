# Gatt
Tastes with gatling for performance bench.

## Execution
```bash
# Test all
sbt gatling:test

# For specific class
sbt gatling:testOnly tz70s.gatt.BasicSimulation
```

Gatling also generate ui-based testing report in `target/gatling/xxx` directories, by simply open the `index.html`.
