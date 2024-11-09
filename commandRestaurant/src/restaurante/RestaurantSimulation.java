package restaurante;

public class RestaurantSimulation {
    public static void main(String[] args) {

        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        Command order = new OrderCommand(chef, "Espaguete � Bolonhesa");
        
        waiter.setCommand(order);

        waiter.serveOrder();
    }
}