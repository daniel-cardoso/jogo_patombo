package patombo_penal;


public class Joga_o_jogo {

	public static void main(String[] args) {
		int esc=-1;
		
		Menus_mensagens.logo();
		
		//Menus_mensagens.limpaTela();
		
		Menus_mensagens.menuInicial();
		
		Jogador joga10 = new Jogador(1);
		Jogador golero1 = new Jogador(2);
		Batida batida1 = new Batida(1);
		
		joga10.setNome();
		System.out.println("Ok! O nome escolhido foi:" +joga10.getNome());
		
		Menus_mensagens.sorteioHabilidade();
		joga10.setHabilidade();
		
		System.out.println("\n\n\nHabilidade Sorteada: "+joga10.getHabilidade());
		
		Menus_mensagens.criandoGoleiro();
		golero1.setNome();
		golero1.setHabilidade();
		System.out.println(golero1.getNome());
		System.out.println(golero1.getHabilidade());
		
		//PARTIU BATIDA 
		System.out.println("#PARTIU BATIDA, MEU CONSAGRADO!");
		//while a partir daqui
		System.out.println("Vamos definir agora em qual local deseja mirar seu chute");
		
		Menus_mensagens.mostraGol();
		
		if(joga10.getHabilidade()>golero1.getHabilidade())
		{
			batida1.escolheLocal();
		}
		//fim while
	}

}
