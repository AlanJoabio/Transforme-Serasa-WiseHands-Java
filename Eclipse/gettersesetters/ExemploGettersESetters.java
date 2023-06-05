package gettersesetters;

public class ExemploGettersESetters {
	
	private String nome;
	private String sobreNome;
	
//---------------------------------------------------------------
	
	public void alteraNome(String nome) {
		this.nome = nome;
	}
	
	public String informaNome() {
		return nome;
	}
//------------------------------------------------------------------
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	

}
