To run mvn formatter:

mvn com.coveo:fmt-maven-plugin:format

Mutant tests

mvn org.pitest:pitest-maven:mutationCoverage -Dthreads=4 -DtargetClasses=com.abinbev.b2b.catalog.orchestrator.catalogitems.*