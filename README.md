# Wrapping Java Library with OpenLiberty with Rest 

Scenario: Taking a Java Library and wrapping to expose it's APIs via rest

- Library based on the `gradle init` default example
- It uses Jackson to describe it's main object
- `./gradlew run` will run the library via a console application
- `./gradlew libertyDev` to start the rest server in dev mode