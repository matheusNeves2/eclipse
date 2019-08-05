
public class Pessoa {
	
	private String nome;
	private Integer idade;
	
	
	
	public Pessoa(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
		
		 // tem o mesmo nome do nome da classe (método construtor)
		
	}
	
	public Pessoa() {
		super();
	 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	

}
