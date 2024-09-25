package example;

// Nesse caso � feito uma classe abstrata VehicleFactory que cont�m um m�todo abstrado para retornar um ve�culo
// seja qualquer um criado a partir da intereface IFactory
// nesse retorno pode incluir um erro caso
// e passa por parametro uma string para ajudar na implementa��o do m�todo
// como � uma classe abstrada ela nao pode ser instanciada

public abstract class VehicleFactory {
	public abstract IFactory GetVehicle(String vehicle) throws Exception;

}
