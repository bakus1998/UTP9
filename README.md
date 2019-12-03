# ZAD1

Zadanie:

Katalog {user.home}/UTP6dir  zawiera pliki tekstowe (z rozszerzeniem .txt) umieszczone w różnych podkatalogach. 
Kodowanie plików to Cp1250.
Przeglądając rekursywnie drzewo katalogowe, zaczynające się od {user.home}/UTP6dir,  wczytać wszystkie te pliki. i połączoną ich zawartość zapisać do pliku o nazwie UTP6res.txt, znadującym się w katalogu projektu. Kodowanie pliku
UTP6res.txt winno być UTF-8.


    Poniższy gotowy fragment winien wykonać całą robotę:
          public class Main {
            public static void main(String[] args) {
              String dirName = System.getProperty("user.home")+"/UTP6dir";
              String resultFileName = "UTP6res.txt";
              Futil.processDir(dirName, resultFileName);
            }
          }
          
          
Uwagi:
pliku Main.java nie wolno w żaden sposób modyfikować,
trzeba dostarczyć definicji klasy Futil,
oczywiście, nazwa katalogu i pliku oraz ich położenie są obowiązkowe,
należy zastosować FileVisitor do przeglądania katalogu,
proszę nie stosować środkow przetwarzania strumieniowego, na to będa oddzielne zadania,,
nalezy zalożyć, że na starcie programu  wynikowego pliku nie ma.


# ZAD2

Zadanie:

Katalog {user.home}/UTP6dir  zawiera pliki tekstowe (z rozszerzeniem .txt) umieszczone w różnych podkatalogach. 
Kodowanie plików to Cp1250.
Przeglądając rekursywnie drzewo katalogowe, zaczynające się od {user.home}/UTP6dir,  wczytaać wszystkie te pliki. i połączoną ich zawartość zapisać do pliku o nazwie UTP6res.txt, znadującym się w katalogu projektu. Kodowanie pliku
UTP6res.txt winno być UTF-8.


    Poniższy gotowy fragment winien wykonać całą robotę:
          public class Main {
            public static void main(String[] args) {
              String dirName = System.getProperty("user.home")+"/UTP6dir";
              String resultFileName = "UTP6res.txt";
              Futil.processDir(dirName, resultFileName);
            }
          }
          
          
Uwagi:
pliku Main.java nie wolno w żaden sposób modyfikować,
trzeba dostarczyć definicji klasy Futil,
oczywiście, nazwa katalogu i pliku oraz ich położenie są obowiązkowe,
należy zastosować metody przetwarzania strumieniowego (chodzi o java.util.stream), bez tego uzyskujemy 0 punktów..


# ZAD3

Zadanie

Na liście słów z http://wiki.puzzlers.org/pub/wordlists/unixdict.txt znaleźć wszystkie anagramy.
Wypisać słowa z maksymalną liczbą anagramów oraz wszystkie ich anagramy w postaci:

    slowo anagram1 anagram2 ....

Program ma być bardzo krótki , dzięki zastosowaniu przetwarzania strumieniowego (java.util.stream).
Bez tego rozwiązanie uzyska 0 punktów.

