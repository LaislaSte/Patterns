package mpp.windows;

import mpp.interfaces.Checkbox;

/*Cria um checkbox que implementa o metodo da interface Checkbox*/
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}