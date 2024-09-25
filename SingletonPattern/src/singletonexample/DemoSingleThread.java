package singletonexample;

/*
 * Classe DemoSingleThread: Esta é uma classe de demonstração que mostra como usar a classe Singleton.
 * 
 * Esta classe serve para demonstrar o funcionamento do Singleton
 * O método principal primeiro chama getInstance("FOO") e em seguida chama getInstance("BAR").

 * O resultado será que singleton e anotherSingleton apontam para a mesma instancia de Singleton,
 * já que há um atraso de 1 segundo no construtor de Singleton (Thread.sleep(1000)), 
 * apesar de ambas as instâncias apontarem para o mesmo objeto Singleton,
 * o valor impresso será "FOO" para ambas, pois a inicialização lenta só ocorre uma vez 
 * na primeira chamada de getInstance().
 * O primeiro método getInstance("FOO") foi chamado primeiro, logo instanciado primeiro,
 * e com o mesmo valor, entao, quando o método é chamado de novo a seguir o que acontecerá
 * é que ele apenas retornará a instancia já criada com o dado "FOO".
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