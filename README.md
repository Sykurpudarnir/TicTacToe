TicTacToe
=========

[![Build Status](https://travis-ci.org/Sykurpudarnir/TicTacToe.svg?branch=master)](https://travis-ci.org/Sykurpudarnir/TicTacToe)

<a href="https://scan.coverity.com/projects/3404">
  <img alt="Coverity Scan Build Status"
       src="https://scan.coverity.com/projects/3404/badge.svg"/>
</a>

### Development manual

In order to be able to get the project to build on a fresh machine one needs to do..
1. Fyrsta þarf að fara inná www.github.com finna Sykurpudarnir. Þar inni þarf að clone-a tictactoe repository-ið
2. því næst þarf að búa til aðgang inná greencloud sýndarvélinni.
3. Clone-a reposirtoryið þar, 
4. til þess að þýða forritið þarf að fara inní TicTacToe repository-ið, skrifa ./gradlew build
5. þá þýðist forritið, því næst þarf að fara inni build möppuna, svo inni libs möppuna. Þar skal skrifa "java -jar TicTacToe.java"
þá ætti leikurinn að spilast. 
6. Testskrárnar eru geymdar inni test möppu, skráin heitir TicTacToeTest.java, slóðin til þess að komast að skránni er eftirfarandi: TicTacToe/src/test/java/is/ru/tictactoe/
7. til þess að komast að TicTacToe.java og Board.java er slóðin eftirfarandi: TicTacToe/src/main/java/is/ru/tictactoe/

### Administration manual
1. Fyrst þarf að fara inná www.github.com, leitað eftir Sykurpudarnir.
2. Því næst þarf að hafa samband við kerfisstjóra verkefnisins, Hörð til þess að fá aðgang að sýndarvélinni. Netfangið hans er hordur12@ru.is
3. Þegar búið er að samþykkja þig inná sýndarvélina, þarf að clone-a repositoryið okkar, sem heitir TicTacToe.
4. Því næst þarf að fara inná TicTacToe með því að að skrifa "cd TicTacToe", sem er repository-ið
5. þegar komið er þangað inn þarf að skrifa ./gradlew build
6. þá ætti að koma skilaboð um að tekist hafi að build-a skránna
7. Til þess að keyra leikinn þarf svo að fara inní möppuna build, það er gert með því að skrifa "cd build"
8. því næst þarf að fara inni möppuna libs, þar er gert með því að skrifa "cd libs"
9. Þá á að vera hægt að keyra leikinn. Það er gert með því að skrifa "java -jar TicTacToe.jar"
10. Góða skemmtun! 
Ef þér fannst leikurinn það skemmtielgur (sem við efumst ekki um) og þú vilt spila hann aftur þarf að endurtaka skref 9.

How to setup and get it to run on a fresh machine..

### Hönnunarskýrsla

Áður en forritunin hófst setti teymið upp eftirfarandi klasarit til að vinna út frá.

Board                    | TicTacToe               | Player             
-------------------------|-------------------------|------------
*New board()*            |*checkIfWon()*           | *Player 1*         
*Print board()*          |*playGame()*             | *Player 2*         

Teymið gerir ráð fyrir því að klasaritið taki breytinum eftir því sem líður á verkefnið. Eigindin og föllin eru undir klasaheitunum í ritinu.

Almennar forritunarreglur
Til að halda samræmi fer öll forritunin fram á ensku; breytu­, klasa­ og fallanöfn. Eina allar athugasemdir, sem skrifaðar eru við kóðann, á ensku. Klasaheiti og fallanöfn verða  með "Pascal casing”
, þ.e. fyrsti stafurinn í hverju nýju orði er hástafur. Allt annað   rita�með "Camel casing", þ.e. fyrsta orðið er með lágstaf í upphafi, en orð þar á eftir byrja á hástaf.
Einnig skiptir miklu máli að hafa kóðann auðlesinn. Passa verður að hafa hverja línu ekki o ekki fleiri en 120 stafi í hverja línu. Auk þess þarf að passa vel uppá inndrátt; línur skulu vera
dregnar inn með því að notast við “tab” takkann í stað þess að nota bilum föllu skal passa uppá að hafa slaufusviga, óháð því hvort þeir séu nauðsynlegir eða ekki, í þeim tilgangi að forðast
misskilning.

Gert er ráð fyrir einingaprófum og að þau verði skrifuð jafn óðum og kóðinn sjálfur. Með því styðst teymið við TDD (e. test driven development).

Teymið notar GitHub til að halda utan um kóðann og auðvelda aðgengi allra aðila teymisins að nýjustu útgáfu kóðans. Teymið setur sér þá reglu að setja inn kóðann (e. push) í hvert skipti sem viðkomandi aðili hefur keyranlega kóða sem nýtist í verkefninu.

Einnig er regla að meðlimir teymisins skrifi einingapróf jafn óðum og nýr kóði verður til.



## Meðlimir teymisins

- Hörður Ragnarsson
- Ísak Hilmarsson
- Jóhanna Dóra Ingólfsdóttir
- Karítas Ólafsdóttir
- Sólveig Sif Guðmundsdóttir

