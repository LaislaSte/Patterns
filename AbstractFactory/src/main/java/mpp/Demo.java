package mpp;

import mpp.interfaces.GUIFactory;
import mpp.mac.MacOSFactory;
import mpp.windows.WindowsFactory;

/*
 * A Demo contem a Aplica��o das interfaces que estao agrupadas na classe Application
 * Cria as classes de fabrica que se baseia da Factory, qual sera usada depende do SO da m�quina (uma configura��o ou vari�vel de ambiente)
 * Para aplicar a fabrica criada, a Demo instancia a aplica��o passando a fabrica criada,
 * em seguida executa o m�todo da Demo que faz toda essa opera��o
 * */
public class Demo {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}