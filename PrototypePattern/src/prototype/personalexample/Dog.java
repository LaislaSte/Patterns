package prototype.personalexample;


public class Dog extends Animal {
	public int idade;
    public String acao;

    public Dog() {
    }

    public Dog(Dog target) {
        super(target);
        if (target != null) {
            this.idade = target.idade;
            this.acao = target.acao;
        }
    }

    @Override
    public Animal clone() {
        return new Dog(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Dog) || !super.equals(object2)) return false;
        Dog shape2 = (Dog) object2;
        return shape2.acao == acao && shape2.idade == idade;
    }
}
