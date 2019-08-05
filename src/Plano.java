
public class Plano {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa ("João",20);

		pessoa1.setIdade(20);
		
		System.out.println("A pessoa "+ pessoa1.getNome() + " foi cadastrada com sucesso");
	}

}