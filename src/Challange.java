import java.util.HashMap;

public class Challange {

    public boolean isNumberPositive(int number) {
        boolean condition = number > 0;

        System.out.println(condition ? "Number " + number + " is positive" : "Number " + number + " is negative or zero");

        return condition;
    }

    public int calculateArea(int side) {
        int area = 0;

        if (side > 0) {
            area = (int) Math.pow(side, 2);
            System.out.println("Area of square with side " + side + " is " + area);
        } else if (side < 0) {
            System.out.println("Side of the square is negative. Can not calculate area");
        } else {
            System.out.println("Side of the square is zero. Can not calculate area");
        }

        return area;
    }

    public int calculatePerimeter(int side) {
        int perimeter = 0;

        if (side > 0) {
            perimeter = (int) 4 * side;
            System.out.println("Perimeter of square with side " + side + " is " + perimeter);
        } else if (side < 0) {
            System.out.println("Side of the square is negative. Can not calculate perimeter");
        } else {
            System.out.println("Side of the square is zero. Can not calculate perimeter");
        }

        return perimeter;
    }

    public boolean isNaturalNumber(int number) {

        return (number >= 0) && (number < 10);
    }

    public String showNumberInWords(int number) {
        HashMap<Integer, String> numbers = new HashMap<>();

        numbers.put(Number.ZERO.ordinal(), Number.ZERO.name());
        numbers.put(Number.ONE.ordinal(), Number.ONE.name());
        numbers.put(Number.TWO.ordinal(), Number.TWO.name());
        numbers.put(Number.THREE.ordinal(), Number.THREE.name());
        numbers.put(Number.FOUR.ordinal(), Number.FOUR.name());
        numbers.put(Number.FIVE.ordinal(), Number.FIVE.name());
        numbers.put(Number.SIX.ordinal(), Number.SIX.name());
        numbers.put(Number.SEVEN.ordinal(), Number.SEVEN.name());
        numbers.put(Number.EIGHT.ordinal(), Number.EIGHT.name());
        numbers.put(Number.NINE.ordinal(), Number.NINE.name());

        if (isNaturalNumber(number)) {
            System.out.println(number + " is " + numbers.get(number));
        } else {
            System.out.println("Number " + number + " is out of range 0-9");
        }

        return numbers.get(number);
    }

}
