package lesson_7_exercise_1.interfaces;
public interface GameBJ {

    void addPlayerInGame(Player player); //добавить игрока

    void giveTwoCardsOnHand(); //раздать 2 карты на старте

    void giveOneCardToPlayerIfNeed(); //дать дополнительную карту

    void printWinner(); //объявить победителя

}
