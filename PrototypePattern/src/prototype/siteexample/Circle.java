package prototype.siteexample;


/*
 * O Circle herda métodos e atributos de Shape e implementa o método clone que apenas retorna o objeto atual
 * A classe abaixo tem um método construtor que assim que for instanciada o parametro passado, 
 * que é um objeto do tipo Circle, tem seu atributo atribuido a classe,
 * o equals aqui apenas recebe um Object e verifica se esse objeto não é um Circle ou um Shape
 * se tudo der certo, ele transforma o objt em Circle e verifica se o atributo dele é igual ao atributo 
 * da classe atual
 * 
 * */

public class Circle extends Shape {
	public int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}
