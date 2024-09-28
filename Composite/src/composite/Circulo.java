package composite;

import composite.interfaces.Figura;

public class Circulo implements Figura {
	
	private Cor cor;

	
	public void desenha() {
		System.out.println("circulo desenhado");
		
	}

	public void MudarCorDeFundo(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
}
