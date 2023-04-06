import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Challange2Test extends Challange{

    @Test
    /*
      Napisz program wyświetlający na ekranie liczby od 1 do 20, które nie są podzielne przez 3.
      Oczywiście nie chodzi o to, żeby je wpisać z palca, tylko użyć jakiejś pętli :)
     */
    public void day1Challange2() {

        int[] numbers3 = new int[] {1, 2, 4, 5, 7, 8, 10, 11, 13, 14, 16, 17, 19, 20};

        for (int i = 0; i < numbers3.length; i++) {
            Assertions.assertEquals(numbers3[i], isNumberNotDividedByThree(createSetOfNumbers(20))[i]);
        }

        showNumbers(isNumberNotDividedByThree(createSetOfNumbers(20)));
    }

    @Test
    /*
      Najpierw coś nieskomplikowanego. Napisz program, który pobierze od użytkownika dwie informacje. Pierwszą z nich będzie jakieś słowo, a drugą ilość powtórzeń. Następnie program ma wypisać na konsoli pobrane słowo tyle razy, ile wynosi podana przez użytkownika liczba powtórzeń. Niech kolejne powtórzenia słowa zostaną wyświetlone w osobnej linii. Zakładamy, że wprowadzona liczba nie będzie ujemna i będzie całkowita.
      Przykład: jeżeli użytkownik wprowadzi słowo “kotlet” oraz liczbę 5, program powinien wypisać:
      kotlet
      kotlet
      kotlet
      kotlet
      kotlet
      Podpowiedź: nie musisz pobierać obu informacji od użytkownika na raz.
     */

    public void day2Challange2() {

        Assertions.assertEquals(2, 2);
    }


}
