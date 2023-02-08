// dev branch for Y.Practicum
import java.util.Scanner;
public class Main {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// ваш код начнется здесь
        int guestsNum;
        String productsName;
        double productsPrice;

        while (true) {
            System.out.println("На какое количество человек хотите разделить счёт? (цифрой)");
            guestsNum = scanner.nextInt();
            if (guestsNum > 1) {
                break;
            } else {
                System.out.println("Введите, пожалуйста, количество гостей больше одного (цифрой)");
            }
        }
        while (true) {
            System.out.println("Введите наименование блюда");
            productsName = scanner.next();
            while (true) {
                System.out.println("Введите стоимость товара цифрами в формате 'рубли.копейки'");
                productsPrice = scanner.nextDouble();
                if (productsPrice > 0) {
                    break;
                } else {
                    System.out.println("Введите, пожалуйста, цену больше 0 и в нужном формате");
                }
            }
            System.out.println("Блюдо добавлено в счёт.\nЕсли хотите добавить ещё блюдо в счёт - введите его название \nЧтобы завершить список введите \"Завершить\"");
            if (scanner.next().equalsIgnoreCase("завершить")) {
                break;
            }
        }
        System.out.println("Добавленные блюда:\n %s.\nНа общую сумму:%.2f\nИтого по %.2f с каждого гостя");
    }
}
