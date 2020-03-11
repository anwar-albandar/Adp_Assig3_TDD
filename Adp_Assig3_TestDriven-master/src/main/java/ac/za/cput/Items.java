package ac.za.cput;
public class shop extends Client implements shop  {

    @Override
    public int add(int a, int b) {
        ans = a + b;
        System.out.println("Item - add " + a + " und " + b + "= " + ans);
        return ans;

    }
    @Override // كومبوزيشن
    public int subtract(int a, int b) {
        ans = a - b;
        {
            System.out.println("Item - shop " + a + " und " + b
                    + "= " + ans);
            return ans;
        }
    }
    @Override
    public int multiply(int a, int b) {
        ans = a * b;
        System.out.println("Item - shop " + a + " und " + b + "= " + ans);
        return ans;
    }

public class Items {
    private String name;
    private int price;

    public Items(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
}
