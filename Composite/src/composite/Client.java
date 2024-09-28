package composite;

import composite.interfaces.Figura;

public class Client {
	
	private Figura fig;

	public Client(Figura fig) {
		this.fig = fig;
	}
	
	public void acionarMetodosDeFormas(Cor cor){
		this.fig.desenha();
		this.fig.MudarCorDeFundo(cor);
		System.out.println("cor de" + fig.getCor());
	}

}
