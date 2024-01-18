package projeto;


import java.util.Scanner;

public class HeroBank {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean sair = false; 
		
		ContaCorrente cc = new ContaCorrente(); 
		ContaPoupanca cp = new ContaPoupanca(); 
		ContaPj pj = new ContaPj(); 
		
		while(!sair) { 
		System.out.println("------------------------------------");
		System.out.println("              HERO BANK             ");
		System.out.println("------------------------------------");
		System.out.println("Selecione uma opção:");
		System.out.println("[1] Criar conta corrente");
		System.out.println("[2] Criar conta poupança");
		System.out.println("[3] Criar conta PJ");
		System.out.println("[4] Acessar Conta Corrente");
		System.out.println("[5] Acessar Conta Poupança");
		System.out.println("[6] Acessar Conta PJ");
		System.out.println("[7] Sair");
		System.out.println("------------------------------------");
		

		int opcao = input.nextInt(); 

		
		switch (opcao) { 
		
		case 1:
			cc.setNumConta();
			cc.abrirConta();

			break;
			
		case 2:
			cp.setNumConta();
			cp.abrirConta();			
			
			break;
			
		case 3:
			pj.setNumConta();
			pj.abrirConta();

		case 4:
            cc.acessarContaCorrente();
            break;
			
		case 5:
			cp.acessarCP();
			break;
			
		case 6:
			pj.acessarPJ();
			break;
			
		case 7:
			System.out.println("Obrigado pro utilizar os serviços da HeroBank, Volte sempre. ");
			sair = true;
			break;

		default:
			System.out.println("Escolha não válida, escolha outra opção...");
			break;
			
		
			}

		}		
		input.close();
	}

}
