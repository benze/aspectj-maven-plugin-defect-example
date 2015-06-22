This repo is to present 2 examples where the m2e connector prevents the aspectj-maven-plugin from properly generating the expected target classes for aspects in the src/test/java directory.

The only way to get the aspectj-maven-plugin to function correctly is to disable the m2e connector by overriding the lifecycle mapping in the pom.xml.

Uncomment the lifecycle mapping override in the root pom of each project to see the aspectj-maven-plugin work properly from within eclipse.
