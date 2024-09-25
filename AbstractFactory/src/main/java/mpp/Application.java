package mpp;

import mpp.interfaces.Button;
import mpp.interfaces.Checkbox;
import mpp.interfaces.GUIFactory;

/*A seguinte classe tem como atributos um Button e um Checkbox (Interface),
 *Um método construtor que constroe uma fábrica (Interface) que usa as Interfaces Button e Checkbox também para retorno
 *Um método pain() que engloga os métodos paint do Button e do Checkbox
 *Em geral, cria uma fábrica que usa os métodos dos componentes dela*/

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