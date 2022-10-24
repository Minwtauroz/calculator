import java.io.IOException;
import java.util.Scanner;

class Init{
    int a;
    int b;
    int c;
    int result;
    String answer;
    boolean check1;
    boolean check2;
    boolean check3;

}
public class Main {

    static Scanner input = new Scanner(System.in);

    public static String calc(String input) {
        Init init = new Init();
        String[] mass = input.split(" ");
        if (mass.length < 2) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("throws Exception //т.к. строка не является математической операцией");
                System.exit(0);
            }
        }
        if (mass.length != 3) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                System.exit(0);
            }
        }

        if (mass[0].matches("(?i)1|2|3|4|5|6|7|8|9|10|I|II|III|IV|V|VI|VII|VIII|IX|X") && mass[2].matches("(?i)(?i)1|2|3|4|5|6|7|8|9|10|I|II|III|IV|V|VI|VII|VIII|IX|X")) {
            boolean check = true;
        } else {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("throws Exception // введите числа от 1 до 10, либо от I до X");
                System.exit(0);
            }
        }


        if (mass[0].matches("(?i)1|2|3|4|5|6|7|8|9|10") && mass[2].matches("(?i)1|2|3|4|5|6|7|8|9|10")) {
            init.a = Integer.parseInt(mass[0]);
            init.b = Integer.parseInt(mass[2]);
            init.check3 = true;

        } else {

            init.check2 = true;
            switch (mass[0]) {
                case "I":
                    init.a = Integer.parseInt("1");
                    break;
                case "II":
                    init.a = Integer.parseInt("2");
                    break;
                case "III":
                    init.a = Integer.parseInt("3");
                    break;
                case "IV":
                    init.a = Integer.parseInt("4");
                    break;
                case "V":
                    init.a = Integer.parseInt("5");
                    break;
                case "VI":
                    init.a = Integer.parseInt("6");
                    break;
                case "VII":
                    init.a = Integer.parseInt("7");
                    break;
                case "VIII":
                    init.a = Integer.parseInt("8");
                    break;
                case "IX":
                    init.a = Integer.parseInt("9");
                    break;
                case "X":
                    init.a = Integer.parseInt("10");
                    break;
                default:
                    init.check1 = true;
            }
            switch (mass[2]) {
                case "I":
                    init.b = Integer.parseInt("1");
                    break;
                case "II":
                    init.b = Integer.parseInt("2");
                    break;
                case "III":
                    init.b = Integer.parseInt("3");
                    break;
                case "IV":
                    init.b = Integer.parseInt("4");
                    break;
                case "V":
                    init.b = Integer.parseInt("5");
                    break;
                case "VI":
                    init.b = Integer.parseInt("6");
                    break;
                case "VII":
                    init.b = Integer.parseInt("7");
                    break;
                case "VIII":
                    init.b = Integer.parseInt("8");
                    break;
                case "IX":
                    init.b = Integer.parseInt("9");
                    break;
                case "X":
                    init.b = Integer.parseInt("10");
                    break;
                default:
                    init.check1 = true;
            }
        }
        if (init.check1 && init.check2) {
            try {
                throw new IOException();
            } catch (IOException k) {
                System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                System.exit(0);
            }
        }

            switch (mass[1]) {
                case "+":
                    init.c = init.a + init.b;
                    break;
                case "-":
                    init.c = init.a - init.b;
                    break;
                case "*":
                    init.c = init.a * init.b;
                    break;
                case "/":
                    init.c = init.a / init.b;
                    break;
                default:
                    try {
                        throw new IOException();
                    } catch (IOException k) {
                        System.out.println("throws Exception //т.к. неверное арифметическое выражение");
                        System.exit(0);
                    }
            }
        if (init.check3) {
            System.out.println("Output: ");
            init.answer = String.valueOf(init.c);
        }

        if (init.check2) {

            String[] rome = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                    "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                    "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                    "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                    "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                    "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                    "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

            init.result = init.c;
            if (init.result < 1) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
                    System.exit(0);
                }
                System.exit(0);
            }
            System.out.println("Output: ");
            init.answer = rome[init.result];
        }

        return init.answer; //возвращаю результат сложения
    }

    public static void main(String[] args) {
        System.out.println("Input: ");
        System.out.println(calc(input.nextLine()));
        input.close();
    }
}

