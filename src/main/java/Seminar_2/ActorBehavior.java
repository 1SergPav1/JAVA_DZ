package Seminar_2;

public interface ActorBehavior {

    void setMakeOrder(boolean status);

    void setTakeOrder(boolean status);

    boolean isMakeOrder(); // сделап заказ

    boolean isTakeOrder(); // получил заказ

}
