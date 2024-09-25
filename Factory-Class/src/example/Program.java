package example;

public class Program {
	// Nessa classe será feito concretização da fabrica de veículos
	// a fábrica é instanciada e os objetos veículos são criados a partir dela com o método GetVehicle
	// assim, os veículos criados tem seus métodos baseado na interface chamados, passando um parametro
	
	// em resumo, os objetos que serão fabricados foram feitos baseados em uma interface
	// e a fábrica em si baseado numa classe abstrata
	// os objetos sao feitos a partir da fabrica
	
    public static void main(String[] args) throws Exception
    {
        VehicleFactory factory = new ConcreteVehicleFactory();

        IFactory scooter = factory.GetVehicle("Scooter");
        scooter.Drive(10);

        IFactory bike = factory.GetVehicle("Bike");
        bike.Drive(20);

    }
}