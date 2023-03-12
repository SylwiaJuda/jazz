package pl.pjatk.syljud;

public class Stationery {
    private int id;
    private String type;
    private int amount;
    private double price;

    public Stationery(int id, String type, int amount, double price) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stationery{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
