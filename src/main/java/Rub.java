public class Rub {

    public void endRub (int guestsNum, double costAllDishes) {
        double costForGuests;
        String allDishPrice = "Итог: с каждого гостя по %.2f";
        costForGuests = costAllDishes / guestsNum;
        switch ((int) costForGuests % 10){
            default:{
                System.out.println(String.format(allDishPrice, costForGuests) + " рублей");
                break;
            } case (1) : {
                System.out.println(String.format(allDishPrice, costForGuests) + " рубль");
                break;
            }
            case (2) :
            case (3) :
            case (4) : {
                System.out.println(String.format(allDishPrice, costForGuests) + " рубля");
                break;
            }
        }
    }
}
