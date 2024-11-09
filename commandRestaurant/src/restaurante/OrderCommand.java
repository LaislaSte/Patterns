package restaurante;

public class OrderCommand implements Command {
    private Chef chef;
    private String dish;

    public OrderCommand(Chef chef, String dish) {
        this.chef = chef;
        this.dish = dish;
    }
    @Override
    public void execute() {
        chef.cookDish(dish);
    }
}