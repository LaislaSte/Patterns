package mpp.interfaces;

/*Cria uma interface de fabrica que tem em comum m�todos que criam um Button e um Checkbox (Interfaces)
 * que na verdade, apenas retorna essas interfaces*/
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}