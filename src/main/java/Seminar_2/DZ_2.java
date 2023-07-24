package Seminar_2;

public class DZ_2 {

    public static void main(String[] args) {

        Market market = new Market();
        Human human1 = new Human("Дима");
        Human human2 = new Human("Света");

        market.acceptToMarket(human2);
        market.acceptToMarket(human1);
        market.update();

    }


}
