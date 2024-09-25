package mpp;

import mpp.interfaces.Button;
import mpp.interfaces.Checkbox;
import mpp.interfaces.GUIFactory;

/*A seguinte classe tem como atributos um Button e um Checkbox (Interface),
 *Um m�todo construtor que constroe uma f�brica (Interface) que usa as Interfaces Button e Checkbox tamb�m para retorno
 *Um m�todo pain() que engloga os m�todos paint do Button e do Checkbox
 *Em geral, cria uma f�brica que usa os m�todos dos componentes dela*/

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}