package DateTask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate date;

        System.out.println("Введите дату в формате dd.MM.yyyy");
        try {
            date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            System.out.println(date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + " - " + date.getDayOfWeek());
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Дата следующего вторника : " + LocalDate.now().plusWeeks(1).format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        }
    }
}
