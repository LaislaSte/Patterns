package composite;
import composite.interfaces.Figura;

public class Triangulo implements Figura {

private Cor cor;

	
	public void desenha() {
		System.out.println("triangulo desenhado");
		
	}

	public void MudarCorDeFundo(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
}
