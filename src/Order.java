public class Order {
    private int orderCount = 0;

    public Order() {

    }

    public Order(int count) {
        this.orderCount = count;
    }

    @Override
    public String toString() {
        return "Order has count: " + orderCount;
    }
}
