package example;

//cria-se uma classe Scooter que implementa o método da interface IFactory, o método é apenas um log do parametro passado
public class Scooter implements IFactory {
        public void Drive(int miles)
        {
        	System.out.println("Drive the Scooter : "+miles+" km");
        }
   

}
