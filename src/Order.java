public class Order {
    private int count = 0;

    public Order() {

    }

    public Order(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Order has count: " + count;
    }
}
