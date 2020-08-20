package patombo_penal;

public class Jogador extends Atleta {
	private int cantoPreferido; //1 esquerdo - 2 direito
	private int tipo; //1 - jogador / 2 - goleiro
	
	public Jogador(int tipo) {
		super();
		this.cantoPreferido = cantoPreferido;
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getCantoPreferido() {
		return cantoPreferido;
	}

	public void setCantoPreferido(int cantoPreferido) {
		this.cantoPreferido = cantoPreferido;
	}

	
}
