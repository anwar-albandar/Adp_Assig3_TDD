package ac.za.cput;

public class Items {
    private String name;
    private int price;

    public Items(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    public int getPrice()
    {
        return this.price;
    }
}
