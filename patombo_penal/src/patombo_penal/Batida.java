package patombo_penal;

import java.util.Scanner;

public class Batida extends Jogador  {
	Scanner ler = new Scanner(System.in);
	private int alto[] = new int[3];
	private int baixo[] = new int[3];
	private String local;
	private int resp;
	private String gol;
	
	public Batida(int tipo) {
		//int tipo, Scanner ler, int[] alto, int[] baixo, String local, int resp, String gol
		super(tipo);
		//this.ler = ler;
		//this.alto = alto;
		//this.baixo = baixo;
		//this.local = local;
		//this.resp = resp;
		//this.gol = gol;
	}

	
	
	public void escolheLocal()
	{
		System.out.println("No alto ou em baixo?");
		local = ler.nextLine();

		if(local.contains("alto")) 
		{
			System.out.println("Esquerda, meio ou direita?"
					+ "\n(utilize os n�meros 1, 2 ou 3)");
			resp = ler.nextInt();
			resp = ler.nextInt();
			if(resp == 1)
			{
				if(super.getTipo()== 1 && super.getHabilidade()>4)  
				{
					System.out.println("GOOOOOOOOOL");
				}
			}
			else if(resp == 2)
			{
				if(super.getTipo()== 1 && super.getHabilidade()>3) 
				{
					System.out.println("GOOOOOOOOOL");
				}
			}
			else if(resp == 3)
			{
				if(super.getTipo()== 1 && super.getHabilidade()>4) 
				{
					System.out.println("GOOOOOOOOOL");
				}
			}
		}else if(local.contains("baixo"))
		{
			System.out.println("Esquerda, meio ou direita?"
					+ "\n(utilize os n�meros 1, 2 ou 3)");
			resp = ler.nextInt();
			if(resp == 1)
			{
				if(super.getTipo()== 1 && super.getHabilidade()>4)  
				{
					System.out.println("GOOOOOOOOOL");
				}
			}
			else if(resp == 2)
			{
				if(super.getTipo()== 1 && super.getHabilidade()>3) 
				{
					System.out.println("GOOOOOOOOOL");
				}
			}
			else if(resp == 3)
			{
				if(super.getTipo()== 1 && super.getHabilidade()>4) 
				{
					System.out.println("GOOOOOOOOOL");
				}
			}
		}
	}
	
}