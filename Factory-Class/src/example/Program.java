package example;

public class Program {
	// Nessa classe ser� feito concretiza��o da fabrica de ve�culos
	// a f�brica � instanciada e os objetos ve�culos s�o criados a partir dela com o m�todo GetVehicle
	// assim, os ve�culos criados tem seus m�todos baseado na interface chamados, passando um parametro
	
	// em resumo, os objetos que ser�o fabricados foram feitos baseados em uma interface
	// e a f�brica em si baseado numa classe abstrata
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