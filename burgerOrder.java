public class burgerOrder extends foodOrder {
    void selectItem() {
        System.out.println("Selecting burger items...");
    }
    void Cook() {
        System.out.println("Cooking burger...");
    }
    void serve() {
        System.out.println("Serving burger...");
    }
    public static void main(String[] args) {
        foodOrder order = new burgerOrder();
        foodOrder order1=new PizzaOrder();
        order.prepareOrder();
        order1.prepareOrder();
    }
    
}
