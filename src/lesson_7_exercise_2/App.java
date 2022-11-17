package lesson_7_exercise_2;

public class App {
    public static void main(String[] args) {
        //Создание товаров
        Product apple = new Product("green apple", 100, 5);
        Product orange = new Product("red orange", 200, 4);
        Product apricot = new Product("yellow apricot", 140, 7);
        Product salmon = new Product("black salmon", 300, 10);

        //Создание и заполнение массива товаров разных категорий
        Product[] arrFruits = new Product[3];
        arrFruits[0] = apple;
        arrFruits[1] = orange;
        arrFruits[2] = apricot;

        Product[] arrFish = new Product[3];
        arrFish[0] = salmon;

        //Создание объектов категорий
        Category fruits = new Category("fruits", arrFruits);
        Category fish = new Category("fish", arrFish);

        //Печать содержимого категорий
        System.out.println("Категория " + fruits.getName() + ":");
        for (int i = 0; i < fruits.getProducts().length; i++) System.out.println((i + 1) + ". "
                + fruits.getProducts()[i].getName());
        System.out.println();
        System.out.println("Категория " + fish.getName() + ":");
        for (int i = 0; i < fish.getProducts().length; i++) {
            if (fish.getProducts()[i] == null) {
                System.out.println((i + 1) + ". пустая позиция");
            } else System.out.println((i + 1) + ". " + fish.getProducts()[i].getName());
        }
        System.out.println();

        //Создание массива покупок
        Basket basket = new Basket();
        Product[] arrBasket = new Product[3];
        arrBasket[0] = apricot;
        arrBasket[1] = salmon;
        arrBasket[2] = orange;

        basket.setBought(arrBasket);

        //Печать содержимого корзины
        System.out.println("Покупки:");
        for (int i = 0; i < basket.getBought().length; i++) System.out.println((i + 1) + ". "
                + basket.getBought()[i].getName());
        System.out.println();

        //Создание пользователя с корзиной покупок
        User peter = new User("Peter", "00000", basket);
        System.out.println("Пользователь " + peter.getName() + " купил:");
        for (int i = 0; i < peter.getBasket().getBought().length; i++) System.out.println((i + 1)
                + ". " + peter.getBasket().getBought()[i].getName());
    }
}
