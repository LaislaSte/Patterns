package prototype.siteexample;

import java.util.ArrayList;
import java.util.List;

/*
 * Colocando em pr�tica o padr�o
 * a Demo tem duas listas de Shape, uma delas � para as c�pias
 * um objeto Circle � instanciado, setado e adicionado � lista shape
 * outro objeto Circle � feito mas de maneira diferente, atraves do m�todo clone do objeto anterior
 * que retorna o objeto em si anterior
 * Retangle tem apenas um objeto instanciado e adicionado tamb�m � lista
 * e o m�todo cloneAndCompare pega os objetos de shapes e vai adicionando em shapesCopy,
 * atravez do m�todo clone, clonando tudo da lista shapes e adicionandO na outra
 * tamb�m faz a verifica��o se eles sao os mesmos objetos e se eles tem seus atributos identicos,
 * usando o m�todo equals
 * 
 * 
 * */

public class Demo {
    
	public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
