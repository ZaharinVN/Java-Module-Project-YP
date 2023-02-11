import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int guestsNum;
        String dishName;
        String allDishName = "";
        double dishPrice;
        double allDishPrice = 0;
        Scanner sc = new Scanner(System.in);
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
            dishName = sc.next();
            if (dishName.equalsIgnoreCase("завершить")) {
                break;
            } else {
                allDishName += dishName + "\n";
            }
            System.out.println("Введите стоимость блюда цифрами");
            dishPrice = sc.nextDouble();
            if (dishPrice > 0) {
                allDishPrice+=dishPrice;
            } else {
                System.out.println("Введите цену больше 0 и в нужном формате");
            }
            System.out.println("Блюдо добавлено в счёт.\nЕсли хотите добавить ещё блюдо в счёт - введите его название:\nЧтобы завершить список введите: Завершить");
        }
        String str1 = "Список блюд: " + "\n" + allDishName;
        System.out.println(str1);
        String str2 = "Количество гостей - " + guestsNum;
        System.out.println(str2 + " чел.");
        String str3 ="Сумма для каждого гостя: " + allDishPrice/guestsNum;
        System.out.println(str3 + " рублей");
    }
}