package example;

// cria-se uma classe Bike que implementa o m�todo da interface IFactory, o m�todo � apenas um log do parametro passado
public class Bike implements IFactory {
	
	    public void Drive(int miles){
	       System.out.println("Drive the Bike : "+miles+" km");
	    }
	
}
