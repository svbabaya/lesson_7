package lesson_7_exercise_1.models;

import lesson_7_exercise_1.interfaces.Card;

public class GameBJ {
    DeckOfCardsImpl deck = new DeckOfCardsImpl();
    Card one = deck.randomCard();

    public void printCardTpm() {
        System.out.print("Название карты: ");
        one.printCard();
        System.out.println("Значение: " + one.getValue());
    }
}
