package example;

//cria-se uma classe Scooter que implementa o m�todo da interface IFactory, o m�todo � apenas um log do parametro passado
public class Scooter implements IFactory {
        public void Drive(int miles)
        {
        	System.out.println("Drive the Scooter : "+miles+" km");
        }
   

}
