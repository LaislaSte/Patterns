package singletonexample;

/*
 * Esta classe tem um campo est�tico privado instance que mant�m a 
 * �nica inst�ncia da classe. Ela tamb�m tem um campo value para armazenar algum dado. 
 * O construtor � privado, o que significa que s� pode ser acessado dentro da classe Singleton.
 * 
 * No m�todo getInstance(String value), ele verifica se instance � nula. Se for nula, 
 * isso significa que ainda n�o foi inicializada, ent�o cria uma nova instancia da 
 * classe Singleton com o valor fornecido e atribui a instance. Se instancia j� estiver inicializada, 
 * ela simplesmente retorna a existente.

 * */

public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
