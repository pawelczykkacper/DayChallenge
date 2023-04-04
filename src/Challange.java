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
            perimeter = 4 * side;
            System.out.println("Perimeter of square with side " + side + " is " + perimeter);
        } else if (side < 0) {
            System.out.println("Side of the square is negative. Can not calculate perimeter");
        } else {
            System.out.println("Side of the square is zero. Can not calculate perimeter");
        }

        return perimeter;
    }

    private boolean isNaturalNumber(int number) {

        return (number >= 0) && (number < 10);
    }

    public String showNumberInWords(int number) {
        HashMap<Integer, String> numbers = new HashMap<>();

        numbers.put(Numbers.ZERO.ordinal(), Numbers.ZERO.name());
        numbers.put(Numbers.ONE.ordinal(), Numbers.ONE.name());
        numbers.put(Numbers.TWO.ordinal(), Numbers.TWO.name());
        numbers.put(Numbers.THREE.ordinal(), Numbers.THREE.name());
        numbers.put(Numbers.FOUR.ordinal(), Numbers.FOUR.name());
        numbers.put(Numbers.FIVE.ordinal(), Numbers.FIVE.name());
        numbers.put(Numbers.SIX.ordinal(), Numbers.SIX.name());
        numbers.put(Numbers.SEVEN.ordinal(), Numbers.SEVEN.name());
        numbers.put(Numbers.EIGHT.ordinal(), Numbers.EIGHT.name());
        numbers.put(Numbers.NINE.ordinal(), Numbers.NINE.name());

        if (isNaturalNumber(number)) {
            System.out.println("Number " + number + " in words is " + numbers.get(number));
        } else {
            System.out.println("Number " + number + " is out of range 0-9");
        }

        return numbers.get(number);
    }

    private String whatIsDayOfWeek(int day) {

        String[] dayOfTheWeek = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        if (day >=1 && day <=7){
            return dayOfTheWeek[day - 1];
        } else {
            return "It is not a day of the week";
        }
    }

    private String whatIsPostfix(int day) {

        return switch (day) {
            case 1 -> "st";
            case 2 -> "nd";
            case 3 -> "rd";
            default -> "th";
        };
    }

    public String showDayOfTheWeek(int day) {

        System.out.println("The " + day + whatIsPostfix(day) + " day of week is " + whatIsDayOfWeek(day));

        return whatIsDayOfWeek(day);
    }

    public int whatIsTheBiggestNumber(int[] numbers) {

        int i = 0;
        int theBiggest = numbers[i];

        System.out.println("The biggest number from:");

        for (; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (theBiggest < numbers[i]) {
                theBiggest = numbers[i];
            }
        }

        System.out.println("is " + theBiggest);

        return theBiggest;
    }

}
