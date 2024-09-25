package prototype.personalexample;

public class Cat extends Animal{
	public String nome;

    public Cat() {
    }

    public Cat(Cat target) {
        super(target);
        if (target != null) {
            this.nome = target.nome;
        }
    }

    @Override
    public Animal clone() {
        return new Cat(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Cat) || !super.equals(object2)) return false;
        Cat shape2 = (Cat) object2;
        return shape2.nome == nome;
    }
	
}
