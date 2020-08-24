package patombo_penal;

import java.io.Console;
import java.util.Scanner;

public class Batida extends Jogador {
	Scanner ler = new Scanner(System.in);
	// Console ler1 = System.console();
	private Jogador jogador;
	private int alto[] = new int[3];
	private int baixo[] = new int[3];
	private int local;
	private int resp;
	private String gol;

	public Batida(int tipo) {
		// int tipo, Scanner ler, int[] alto, int[] baixo, String local, int resp,
		// String gol
		super(tipo);
		// this.ler = ler;
		// this.alto = alto;
		// this.baixo = baixo;
		// this.local = local;
		// this.resp = resp;
		// this.gol = gol;
	}

	public void escolheLocal(int habilidade) {
		System.out.println("No alto ou em baixo?\n(utilize os números 8 ou 2)");
		local = ler.nextInt();

		switch (local) {
		case 8:
			System.out.println("Esquerda, meio ou direita?" + "\n(utilize os números 1, 2 ou 3)");
			resp = ler.nextInt();

			if (resp == 1) {
				if (habilidade > 4) {
					System.out.println("GOOOOOOOOOL");
				}
			} else if (resp == 2) {
				if (habilidade > 4) {
					System.out.println("GOOOOOOOOOL");
				}
			} else if (resp == 3) {
				if (habilidade > 4) {
					System.out.println("GOOOOOOOOOL");
				}
			}

			break;

		case 2:
			System.out.println("Esquerda, meio ou direita?" + "\n(utilize os números 1, 2 ou 3)");
			resp = ler.nextInt();

			if (resp == 1) 
			{
				if (habilidade > 4) 
				{
					System.out.println("GOOOOOOOOOL");
				}
			} 
			else if (resp == 2) 
			{
				if (habilidade > 4) 
				{
					System.out.println("GOOOOOOOOOL");
				}
			} 
			else if (resp == 3) 
			{
				if (habilidade > 4) 
				{
					System.out.println("GOOOOOOOOOL");
				}
			}
			
			break;
		 
		default:
			System.out.println("Ainda não temos outros parâmetros,"
					+ " seja paciente pequeno gafanhoto...  ");
			 
			 break;
		}

	}
}
