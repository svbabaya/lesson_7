package lesson_7_exercise_2;

public class User {
    private String name;
    private String password;
    private Basket basket;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public User(String name, String password, Basket basket) {
        this.name = name;
        this.password = password;
        this.basket = basket;
    }
}
