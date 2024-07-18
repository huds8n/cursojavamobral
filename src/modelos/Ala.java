package modelos;

import java.util.ArrayList;
import java.util.List;

public class Ala {

	private String ala;

	private Bloco bloco;
	
	private List<Cela> celas = new ArrayList<>();

	public Ala(Bloco blocoPertencente) {
		this.bloco = blocoPertencente;
	}

	public String getAla() {
		return ala;
	}

	public void setAla(String ala) {
		this.ala = ala;
	}

	public Bloco getBloco() {
		return bloco;
	}

	public void setBloco(Bloco bloco) {
		this.bloco = bloco;
	}

	public List<Cela> getCelas() {
		return celas;
	}

	public void setCelas(List<Cela> celas) {
		this.celas = celas;
	}

}
