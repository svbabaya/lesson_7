package lesson_7_exercise_2;

public class Category {
    private String name;
    private Product[] products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public Category(String name) {
        this.name = name;
    }
}