package patombo_penal;

public class Menus_mensagens {
	
	public static void logo() {
		System.out.println(" _______________________________\r\n" + 
				"|            PATOMBO		|\r\n" + 
				"|	COBRAN�A		|\r\n" + 
				"|		 DE		|\r\n" + 
				"|		    PENAL	|\r\n" + 
				"|				| ");
	}

	public static void menuInicial()
	{
		//INTRO
		System.out.println("BEM-VINDOS AO MELHOR JOGO DE TODOS OS TEMPOS");
		
		//APRESENTA MENU INICIAL
		System.out.println("Para come�ar, vamos criar seu perfil de jogador...");
		
	}
	
	public static void sorteioHabilidade()
	{
		System.out.println("Agora sua pontua��o de habilidade ser� sorteada,"
				+ " ela definir� o qu�o f�cil ser� de fazer o gol");
	}
	
	public static void limpaTela()
	{
		for(int x=0;x<60;x++)
		{
			System.out.println();
		}
	}
	
	public static void criandoGoleiro()
	{
		System.out.println("Agora ser� criado o goleiro advers�rio"
				+ " e sorteada sua habilidade");
	}
	
	public static void mostraGol()
	{
		System.out.println("_____________\r\n" + 
				"| 1 | 2 | 3 | ALTO\r\n" + 
				"|   |   |   |\r\n" + 
				"-------------\r\n" + 
				"| 1 | 2 | 3 | BAIXO\r\n" + 
				"|   |   |   |\r\n" + 
				"");
	}
}
