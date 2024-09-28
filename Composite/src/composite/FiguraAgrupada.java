package composite;

import java.util.ArrayList;

import composite.interfaces.Figura;

public class FiguraAgrupada implements Figura{
	private Cor cor;

	private ArrayList<Figura> listaFiguras = new ArrayList<Figura>();
	
	public void adicionar(Figura fig) {
		this.listaFiguras.add(fig);
	}
	
	public void remover(Figura fig) {
		this.listaFiguras.remove(fig);
	}
	
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
