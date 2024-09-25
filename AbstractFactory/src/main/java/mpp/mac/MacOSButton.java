package mpp.mac;

import mpp.interfaces.Button;

/*Cria um botao que implementa o metodo da interface Button*/
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}