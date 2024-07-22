package modelos;

public class Funcionario extends Pessoa {

	private String matricula;

	public Funcionario(Pessoa pessoa) {
		
		setNome(pessoa.getNome());
		setDataNascimento(pessoa.getDataNascimento());
		setCpf(pessoa.getCpf());
	}


	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
