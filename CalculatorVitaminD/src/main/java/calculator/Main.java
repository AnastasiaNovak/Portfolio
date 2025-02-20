package calculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите результат анализа витамина D (в пг/мл): ");

        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }

            try {
                int data = Integer.parseInt(input);
                System.out.println(CalculatorD.compareResult(data));
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите корректное значение или 'end' для завершения.");
            }
        }
    }
}
