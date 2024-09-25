package prototype.personalexample;

import java.util.Objects;

public abstract class Animal {
	
	public int idade;
	public String acao;
    public String nome;

    public Animal() {
    }

    public Animal(Animal target) {
        if (target != null) {
            this.idade = target.idade;
            this.acao = target.acao;
            this.acao = target.acao;
        }
    }

    public abstract Animal clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Animal)) return false;
        Animal shape2 = (Animal) object2;
        return shape2.idade == idade && shape2.acao == acao && Objects.equals(shape2.nome, nome);
    }

}
