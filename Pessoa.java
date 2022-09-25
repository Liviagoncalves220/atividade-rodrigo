package praticando;

public class Pessoa {
	String nome;
	int idade;
	int cpf;

	Pessoa(String nome, int idade, int cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	Pessoa() {

		this.nome =null;
		this.idade =0;
		this.cpf =0;
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

}
