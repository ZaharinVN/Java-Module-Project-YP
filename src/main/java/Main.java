public class Main {
    public static void main(String[] args) {
        System.out.println("Консольное приложение №1");
        Guests guests = new Guests();
        double totalCost;
        int guestsNum;
        guestsNum = guests.guestsNum();
        Calculator calculator = new Calculator();
        totalCost = calculator.dishNameAndPrice();
        System.out.println("Общая стоимость блюд: " + totalCost + " руб.");
        System.out.println("Количество гостей: " + guestsNum + " чел.");
        Rub rubles = new Rub();
        rubles.endRub(guestsNum, totalCost);

    }
}

