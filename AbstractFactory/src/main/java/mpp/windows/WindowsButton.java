package mpp.windows;

import mpp.interfaces.Button;

/*Cria um botao que implementa o metodo da interface Button*/
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}