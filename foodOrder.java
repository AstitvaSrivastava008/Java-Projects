public abstract class foodOrder {
    void prepareOrder(){
        System.out.println("Preparing order...");
        selectItem();
        Cook();
        serve();
        System.out.println("Order is ready!");
    }
    abstract void selectItem();
    abstract void Cook();
    abstract void serve();
}
