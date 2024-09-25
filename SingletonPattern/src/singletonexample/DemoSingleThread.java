package singletonexample;

/*
 * Classe DemoSingleThread: Esta � uma classe de demonstra��o que mostra como usar a classe Singleton.
 * 
 * Esta classe serve para demonstrar o funcionamento do Singleton
 * O m�todo principal primeiro chama getInstance("FOO") e em seguida chama getInstance("BAR").

 * O resultado ser� que singleton e anotherSingleton apontam para a mesma instancia de Singleton,
 * j� que h� um atraso de 1 segundo no construtor de Singleton (Thread.sleep(1000)), 
 * apesar de ambas as inst�ncias apontarem para o mesmo objeto Singleton,
 * o valor impresso ser� "FOO" para ambas, pois a inicializa��o lenta s� ocorre uma vez 
 * na primeira chamada de getInstance().
 * O primeiro m�todo getInstance("FOO") foi chamado primeiro, logo instanciado primeiro,
 * e com o mesmo valor, entao, quando o m�todo � chamado de novo a seguir o que acontecer�
 * � que ele apenas retornar� a instancia j� criada com o dado "FOO".
 * */

public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}