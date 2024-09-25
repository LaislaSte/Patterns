package mpp.mac;

import mpp.interfaces.Checkbox;

/*Cria um checkbox que implementa o metodo da interface Checkbox*/
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}