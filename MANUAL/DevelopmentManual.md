### Þróunarleiðbeiningar (e.Development Manual)
#### Eftirfarandi þarf að gera til að fá aðgang að þróunarumhverfinu:

1. Ef notandi er ekki þegar búinn að setja upp git á skelina, þá er nauðsynlegt að byrja á því.
2. Því næst þarf að fara inná www.github.com, og leita að "Sykurpudarnir".
3. Þar á eftir þarf að hafa samband við kerfisstjóra verkefnisins, Hörð, til þess að fá aðgang að sýndarvélinni. Netfangið hans er hordur12@ru.is
4. Þegar búið er að samþykkja notenda inná sýndarvélina, þarf að afrita repositoryið TicTacToe, inn á skelina. Það er gert með því að skrifa inn skipunina "git clone" og afrita SSH lykilinn að repositoryi-inu.
5. Því næst þarf að fara inná TicTacToe með því að að skrifa "cd TicTacToe", sem er repository-ið.
6. Ganga þarf úr skugga um að Java sé uppsett á vélinni, ef ekki skal setja það upp.
7. Ganga þarf úr skugga um að gradle sé uppsett á vélinni, leiðbeiningar má finna hér: http://www.gradle.org/installation
8. Ganga þarf út skugga um að junit sé uppsett á vélinni, leiðbeiningar má finna hér: http://junit.sourceforge.net/doc/faq/faq.htm#started_2
9. Hægt er að gera breytingar á forritinu með hvaða texta editor sem er.
10. Til þess að keyra breytingar inn á Travis CI sýndarvél þarf að commita og pusha breytingunum á Github
11. Hægt er að skoða skýrslu fyrir buildið með því að smella á build hnappinn í README skránni.
12. Til þess að klára útgáfu skal keyra scriptuna 'Mega Build', það er gert með því að keyra "./bin/mega_build". Við það keyrist upp build proccess með Gradle sem útbýr .jar skrá sem er hægt að finna í build/libs. Einnig keyrir scriptan .jar skránna yfir á annan vefþjón "hordur.me" ásamt því að keyra inn einingarprófsskýrslu á slóðina http://hordur.me/sykur
13. Til þess að keyra leikinn þarf svo að fara inní möppuna build/libs, það er gert með því að skrifa "cd build/libs"
14. Þá er hægt að keyra leikinn, það er gert með því að skrifa "java -jar TicTacToe.jar"
15. Testskrárnar eru geymdar inni test möppu, skráin heitir TicTacToeTest.java, slóðin er eftirfarandi: TicTacToe/src/test/java/is/ru/tictactoe/
16. Til þess að komast að TicTacToe.java og Board.java er slóðin eftirfarandi: TicTacToe/src/main/java/is/ru/tictactoe/
