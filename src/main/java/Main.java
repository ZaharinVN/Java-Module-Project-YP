// dev branch for Y.Practicum
import java.util.Scanner;
public class Main {
    int guestsNum;
    String dishName;
    double dishPrice;
    Dishes x = new Dishes();

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);// ваш код начнется здесь
        while (true) {
            System.out.println("На какое количество человек хотите разделить счёт? (цифрой)");
            guestsNum = sc.nextInt();
            if (guestsNum > 1) {
                break;
            } else if (guestsNum == 1) {
                System.out.println("Нет смысла делить счёт");
            } else {
                System.out.println("Введите корректное количество гостей");
            }
        }
        while (true) {
            System.out.println("Введите наименование блюда");
            dishName = sc.nextLine();
            while (true) {
                System.out.println("Введите стоимость товара цифрами в формате 'рубли.копейки'");
                dishPrice = sc.nextDouble();
                if (dishPrice > 0) {
                    break;
                } else {
                    System.out.println("Введите цену больше 0 и в нужном формате");
                }
            }
            System.out.println("Блюдо добавлено в счёт.\nЕсли хотите добавить ещё блюдо в счёт - введите его название:\nЧтобы завершить список введите: Завершить");
            if (sc.nextLine().equalsIgnoreCase("завершить")) {
                break;
            }

        }
    }
}
