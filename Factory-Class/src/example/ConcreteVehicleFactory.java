package example;


// usando a heran�a a ConcreteVehicleFactory herda da classe abstrada VehicleFactory
// como VehicleFactory nao pode ser implementada a ConcreteVehicleFactory � uma concretiza��o da class
// tendo o m�todo GetVehicle implementado
// na implementa��o do m�todo ele recebe uma string e a partir dessa string � decidifo qual objeto 
// de veiculo baseado na interface GetVehicle ser� retornado
// como uma f�brica��o de ve�culos
// se for passado pela string um valor que nao seja as classes existentes � retornado um erro

public class ConcreteVehicleFactory extends VehicleFactory {
	
	@Override
	public IFactory GetVehicle(String vehicle) throws Exception {
		switch (vehicle)
	      {
	          case "Scooter":
	              return new Scooter();
	          case "Bike":
	              return new Bike();
	          default:
	            throw new Exception("Vehicle"+ vehicle+ "cannot be created");
	       }
	}

}
