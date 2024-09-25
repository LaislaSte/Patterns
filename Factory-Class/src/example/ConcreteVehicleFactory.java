package example;


// usando a herança a ConcreteVehicleFactory herda da classe abstrada VehicleFactory
// como VehicleFactory nao pode ser implementada a ConcreteVehicleFactory é uma concretização da class
// tendo o método GetVehicle implementado
// na implementação do método ele recebe uma string e a partir dessa string é decidifo qual objeto 
// de veiculo baseado na interface GetVehicle será retornado
// como uma fábricação de veículos
// se for passado pela string um valor que nao seja as classes existentes é retornado um erro

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
