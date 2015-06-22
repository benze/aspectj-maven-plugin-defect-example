This repo is to present 2 examples where the m2e connector prevents the aspectj-maven-plugin from properly generating the expected target classes for aspects in the src/test/java directory.

The only way to get the aspectj-maven-plugin to function correctly is to disable the m2e connector by overriding the lifecycle mapping in the pom.xml.

By default, the m2e lifecycle mapping is defined by the m2e-connector.  To override the m2e connector settings and make both apps functional, enable the maven profile: override-m2e-lifcycle (in project properties->maven).
