import java.util.Scanner;

public class Calculator {
    String dishName, allDishName ="Список блюд:", trailingSlashes;
    double dishPrice, allDishPrice;
    int priceOfDish;
    Scanner scanner = new Scanner(System.in);

    public double dishNameAndPrice(){

        System.out.println("Введите название, а затем цену блюда");

        while(true){
            System.out.println("Введите название блюда:");
            dishName = scanner.nextLine();
            if (dishName.equalsIgnoreCase("завершить")){
                break;
            }
            allDishName += ("\n" + dishName);
            System.out.println("Введите цену блюда (в формате: рубли, копейки):");
            while(true) {
                if(scanner.hasNextDouble()) {
                    dishPrice = scanner.nextDouble();
                    scanner.nextLine();
                    if(dishPrice >=0){
                        allDishPrice += dishPrice;
                        priceOfDish = (int) dishPrice;
                        trailingSlashes = "";
                        for(int i = dishName.length(); i<= 15; i++)
                        {
                            trailingSlashes +="." ;
                        }
                        allDishName += (" " + trailingSlashes + " " + priceOfDish + " руб. " + (int) ((dishPrice * 100 - priceOfDish * 100)) + " коп.");
                        System.out.println("Блюдо добавлено в счёт.\nЕсли хотите добавить ещё блюдо в счёт - введите его название:\nЕсли хотите сформировать счёт введите: завершить");
                        break;
                    }else{
                        System.out.println("Введите цену в нужном формате!");
                    }

                }else{
                    if(scanner.nextLine().equalsIgnoreCase("завершить")){
                        System.out.println("\nДля формирования счёта добавьте цену последнего блюда и введите: завершить");
                    }
                    System.out.println("Введите цену в нужном формате (рубли,копейки)!");
                }
            }
        }
        System.out.println(allDishName);
        return allDishPrice;
    }
}

