package praticando;


public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Livia", 17,147258369);
		Pessoa p2 = new Pessoa();
		
		
		System.out.println(p1.nome+"\n " + p1.idade+" \n" + p1.cpf);
		p2.setNome("Gonçalves");
		p2.setIdade(20);
		p2.setCpf(147258369);
		
		System.out.println(p2.getNome());
		System.out.println(p2.getIdade());
		System.out.println(p2.getCpf());

	}

}
