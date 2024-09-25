package example;

// Nesse caso é feito uma classe abstrata VehicleFactory que contém um método abstrado para retornar um veículo
// seja qualquer um criado a partir da intereface IFactory
// nesse retorno pode incluir um erro caso
// e passa por parametro uma string para ajudar na implementação do método
// como é uma classe abstrada ela nao pode ser instanciada

public abstract class VehicleFactory {
	public abstract IFactory GetVehicle(String vehicle) throws Exception;

}
