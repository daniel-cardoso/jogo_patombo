package patombo_penal;

import java.util.Scanner;

public abstract class Atleta {
	private String nome;
	private int habilidade;
	Scanner ler = new Scanner(System.in);
	
	public String getNome() {
		return nome;
	}
	public void setNome() {
		System.out.println("Entre com o nome:");
		this.nome = ler.nextLine();
	}
	public int getHabilidade() {
		return habilidade;
	}
	public void setHabilidade() {
		int aleatorio = (int)(Math.random()*9)+1;
		this.habilidade = aleatorio;
	}
	
	
}
