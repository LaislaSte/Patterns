package composite;

import composite.interfaces.Figura;

public class Demo {
	public static void main(String[] args) {
		
		Figura circulo1 = new Circulo();
		Figura circulo2 = new Circulo();
		Figura triangulo = new Triangulo();
		FiguraAgrupada figAgrupada = new FiguraAgrupada();
		
		figAgrupada.adicionar(circulo1);
		figAgrupada.adicionar(circulo2);
		figAgrupada.adicionar(triangulo);
		
		Client cliente = new Client(figAgrupada);
		 
		Cor cor = new Cor("Amarelo");
		cliente.acionarMetodosDeFormas(cor);
		
	}
}
