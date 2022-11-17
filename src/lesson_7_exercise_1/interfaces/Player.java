package lesson_7_exercise_1.interfaces;
public interface Player {

    void takeCard (Card card); //взять карту из колоды

    int countValuesOfAllCardOnHands(); //количество карт на руках

    boolean needCard(); //нужна еще одна карта или нет

    void showCardsOnHands(); //показать карты
}
