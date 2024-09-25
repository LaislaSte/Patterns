package mpp.mac;

import mpp.interfaces.Button;
import mpp.interfaces.Checkbox;
import mpp.interfaces.GUIFactory;

/*Cria uma Factory que implementa os metodos da interface Factory
 * Que por sua vez criam um Button e um Checkbox com os métodos que retornam as interfaces*/
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}