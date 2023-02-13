import java.util.Scanner;

public class Guests {
    public int guestsNum(){
        int guestsNum = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("На какое количество человек хотите разделить счёт? (цифрой)");
            if(scanner.hasNextInt()) {
                guestsNum = scanner.nextInt();
                if (guestsNum == 1) {
                    System.out.println("Нет смысла делить счёт!");
                    scanner.nextLine();
                }
            } else {
                scanner.nextLine();
                System.out.println("Пожалуйста, введите корректное количество гостей!");
            }
        } while(guestsNum<=1);
        return guestsNum;
    }
}
