package LambdaTask;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<String> checkWord = x -> {
            if ((x.charAt(0) == 'J') || (x.charAt(0) == 'N')) {
                if ((x.charAt(x.length() - 1) == 'A')) {
                    return true;
                }
            }
            return false;
        };

        Consumer<Box> checkWeight = x -> System.out.println("Отгрузили ящик с весом " + x.getWeight());

        Function<Integer, String> isPositive = x -> {
            if (x == 0) {
                return "Ноль";
            } else if (x > 0) {
                return "Положительное число";
            } else {
                return "Отрицательное число";
            }
        };

        Random random = new Random();
        Supplier<Integer> randNum = () -> random.nextInt(11);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово для проверки");
        System.out.println(checkWord.test(scanner.nextLine()));
        Box box = new Box(27);
        checkWeight.accept(box);
        System.out.println(isPositive.apply(-20));
        System.out.println(randNum.get());

    }
}
