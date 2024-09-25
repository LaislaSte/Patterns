package prototype.siteexample;

import java.util.Objects;
/*
 * A classe abstrata abaixo possui seu atributos publico x, y e color
 * tem o método abstrato Shape que retorna un Shape, a implementação do metodo clone dependera da sua clase filha
 * há também o método equals que faz uma comparação pra ver se o objeto passado é do tipo Shape e se os atributos 
 * entre a classe são iguais
 * 
 * */


public abstract class Shape {
	public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }
    

    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
