package restaurante;

public class Waiter {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void serveOrder() {
        System.out.println("Garçom vai executar o pedido...");
        command.execute();
    }
}