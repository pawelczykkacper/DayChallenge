import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallangeTest extends Challange {

    @Test
    /*
      Napisz program, który sprawdzi czy podana liczba całkowita jest mniejsza od zera. Jeżeli liczba jest mniejsza
      od zera, wyświetl na konsoli komunikat “Podana liczba jest mniejsza od zera”. Jeżeli liczba będzie większa
      lub równa zero, wyświetl komunikat “Podana liczba jest większa lub równa zero”.
     */
    public void day1Challange() {

        int number = 10;

        Assertions.assertTrue(isNumberPositive(number));
    }

    @Test
    /*
      Napisz program, który na podstawie boku kwadratu obliczy jego pole i obwód. Pole i obwód powinny zostać
      wyświetlone na konsoli. Program powinien sprawdzić, czy wprowadzona długość boku jest dodatnia. Jeżeli jest,
      to powinien wykonać obliczenia i pokazać wynik. Jeżeli długość boku jest równa 0, powinien zostać wyświetlony
      komunikat “Długość boku nie może być równa 0”. Jeżeli długość boku jest ujemna, powinien zostać wyświetlony
      komunikat “Długość boku nie może być ujemna”.
     */
    public void day2Challange() {

        int side = 5;

        Assertions.assertEquals(25, calculateArea(side));
        Assertions.assertEquals(20, calculatePerimeter(side));
    }

    @Test
    /*
      Napisz program, który podaną jednocyfrową nieujemną liczbę całkowitą zapisze słownie. Przykład: jeżeli program
      otrzyma liczbę 2, powinien na konsoli wyświetlić “dwa”. Program powinien także: upewnić się, że liczba jest
      jednocyfrowa i nieujemna. Zakładamy, że liczba zawsze będzie całkowita.
     */
    public void day3Challange() {

        int number = 4;

        Assertions.assertEquals("FOUR", showNumberInWords(number));
    }

    @Test
    /*
      Napisz program, który podaną liczbę zamieni na tekst i go wyświetli zgodnie z poniższym wzorem:
      1 - Dzisiaj jest poniedziałek
      2 - Dzisiaj jest wtorek
      3 - Dzisiaj jest środa
      4 - Dzisiaj jest czwartek
      5 - Dzisiaj jest piątek
      6 - Dzisiaj jest weekend
      7 - Dzisiaj jest weekend
      Upewnij się też, że podana liczba jest z przedziału <1; 7>
     */
    public void day4Challange() {
        int day = 3;

        Assertions.assertEquals("Wednesday", showDayOfTheWeek(day));
    }

    @Test
    /*
      Napisz program, który z trzech wprowadzonych liczb wybierze największą i wyświetli ją w konsoli. Zakładamy,
      że wszystkie trzy liczby są różne od siebie.
     */

    public void day5Challange() {
        int[] numbers = new int[] {1, 4, 3};

        Assertions.assertEquals(4, whatIsTheBiggestNumber(numbers));

    }

}
