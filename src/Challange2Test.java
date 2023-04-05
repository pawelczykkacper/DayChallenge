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

}
