## Sidannarverkefni
## TicTacToe

### Build
Compile:

    #!/bin/bash
    javac src/main/java/is/ru/tictactoe/*.java -d classes

Clean:

     #!/bin/bash
     rm -r classes/*

Compile tests:

    #!/bin/bash
    javac -classpath "classes/:lib/junit-4.11.jar" src/test/java/is/ru/tictactoe/*.java -d classes

Unit Test:

    #!/bin/bash
    java -cp "classes/:lib/junit-4.11.jar:lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore is.ru.tictactoetest


 Build and Test:

      #!/bin/bash
    ./bin/clean
    ./bin/compile
    ./bin/compile_tests
    ./bin/unit_test









              
