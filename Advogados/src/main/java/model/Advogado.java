package model;

public class Advogado {
	private int oab;
	private String Nome;
	private String Telefone;
	private String tipocausas;
	
	public Advogado() {
		// TODO Auto-generated constructor stub
	}
	
	public Advogado(int oab, String nome, String telefone, String tipocausas) {
		super();
		this.oab = oab;
		Nome = nome;
		Telefone = telefone;
		this.tipocausas = tipocausas;
	}

	

	public int getOab() {
		return oab;
	}

	public void setOab(int oab) {
		this.oab = oab;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getTipocausas() {
		return tipocausas;
	}

	public void setTipocausas(String tipocausas) {
		this.tipocausas = tipocausas;
	}
	
	

}
