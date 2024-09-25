package singletonexample;

/*
 * Esta classe tem um campo estático privado instance que mantém a 
 * única instância da classe. Ela também tem um campo value para armazenar algum dado. 
 * O construtor é privado, o que significa que só pode ser acessado dentro da classe Singleton.
 * 
 * No método getInstance(String value), ele verifica se instance é nula. Se for nula, 
 * isso significa que ainda não foi inicializada, então cria uma nova instancia da 
 * classe Singleton com o valor fornecido e atribui a instance. Se instancia já estiver inicializada, 
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
