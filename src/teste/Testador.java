package teste;

import modelos.Ala;
import modelos.Bloco;
import modelos.Cela;
import modelos.UnidadePrisional;

public class Testador {

	public static void main(String[] args) {

		UnidadePrisional papuda = new UnidadePrisional();

		papuda.setDescricao("Centro de Internamento e Reeducação.");
		papuda.setQtdeVagas(5);

		Bloco bloco1 = new Bloco(papuda);
		bloco1.setDescricao("Bloco 1");

		Ala alaAlfa = new Ala(bloco1);
		alaAlfa.setAla("Ala Alfa");

		Cela cela1 = new Cela(alaAlfa);
		cela1.setDescricao("Cela 1");

		Cela cela2 = new Cela(alaAlfa);
		cela2.setDescricao("Cela 2");

		alaAlfa.getCelas().add(cela1);
		alaAlfa.getCelas().add(cela2);

	}

}
