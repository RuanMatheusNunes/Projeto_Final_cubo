package projeto;

import java.util.Scanner;

public class ContaCorrente extends Conta {
	Scanner input = new Scanner(System.in);



	@Override
	public void abrirConta() {
		this.setSaldo(0);
		System.out.println("Seja bem vindo ao Hero Bank!");
		System.out.println("Vamos iniciar o processo de criação da sua conta poupança. Por favor, insira o seu nome: ");
		String nomeTitular = input.nextLine();
		setTitular(nomeTitular);
		System.out.println("Informe o seu CPF(Apenas números):");
		String cpfcc = input.nextLine();
		setCpf(cpfcc);
		setStatus(true); 
		System.out.printf("Saldo atual: R$%.2f\n", getSaldo());
		System.out.println("Nome: " + getTitular());
		System.out.println("CPF: " + getCpf());
		System.out.println("Número da Agência: " + getNumAgencia());
		System.out.println("Número da conta: " + getNumConta());
		System.out.println("Conta corrente criada com sucesso!");
		System.out.println("----------------------------------");
		
	}
	
	@Override 
	public void transferir(double valor) {
		if (this.getStatus() == true) { 
		System.out.println("Digite o valor do pix que deseja transferir: ");
		valor = input.nextDouble();
		if (valor <= 0) {
			System.out.println("Valor do saque não pode ser nagativo");
		}
		else if (this.getSaldo() > 0 && this.getSaldo() > valor) { 
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Pix realizado com sucesso!");
			System.out.printf("Saldo atual: R$%.2f\n", getSaldo());
		} else {
			System.out.println("Pix não realizado, pix insuficiente.");

		}
        } else {
            System.out.println("A transferência não pode ser concluída, pois a conta ainda não foi criada.");
        }

	}
	
	@Override
	public void depositar(double valor) {
		if (this.getStatus() == true) { 
		System.out.println("Digite o valor que deseja depositar: ");
		valor = input.nextDouble();
		 if (valor > 0) {
			 this.setSaldo(this.getSaldo() + valor); 
	            System.out.println("Depósito realizado com sucesso!");
	            System.out.printf("Saldo atual: R$%.2f\n", getSaldo());
	        } else {
	            System.out.println("Depósito não realizado, valor inválido.");
	        }
        } else {
            System.out.println("A realização de depósitos não está disponível, pois a conta ainda não foi criada.");
        }

	}
	
	@Override
	public void sacar(double valor) {
		if (this.getStatus() == true) { 
		System.out.println("Digite o valor de saque: ");
		valor = input.nextDouble();
		if (valor <= 0) {
			System.out.println("Valor do saque não pode ser nagativo");
		}
		else if (this.getSaldo() > 0 && this.getSaldo() > valor) { 
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque realizado com sucesso!");
			System.out.printf("Saldo atual: R$%.2f\n", getSaldo());
			
		
			
		} else {
			System.out.println("Saque não realizado, saldo insuficiente.");

		}
        } else {
            System.out.println("A realização de saques não é possível, pois a conta ainda não foi criada.");
        }

	}
	
	@Override
	public void emprestimo(double valor) {
		if (this.getStatus() == true) { 
		System.out.println("Informe o valor do empréstimo que deseja obter: ");
		valor = input.nextDouble();
		double valorjuros = valor * 0.15 + valor;  
		System.out.println("Em quantas parcelas deseja dividir?");
		int parcelas = input.nextInt();
		double valorparcelas = valorjuros / parcelas;
		System.out.printf("Seu empréstimo de R$%.2f dividido em %d parcelas com 15%% de juros ficou da sequinte forma: \n", valor, parcelas);
		System.out.printf("Valor total com juros: R$%.2f\n" ,valorjuros);
		System.out.printf("Valor das parcelas: R$%.2f\n" ,valorparcelas);
		
		}else {
            System.out.println("A concessão de empréstimo não é possível, pois a conta ainda não foi criada.");
        }

	}
	
	@Override
	public void rendimento(double juros) {
		if (this.getStatus() == true) { 
			juros = 0.0132;
			System.out.println("Sua conta corrente está rendendo 100% da taxa SELIC que é equivalente a 1,32% ao mês");
			double bruto = getSaldo() * juros;
			
			System.out.println("Até quantos dias você planeja manter o valor aplicado na conta corrente? Um desconto de Imposto de Renda (IR) será aplicado, e a taxa dependerá do período pelo qual o valor permanecer investido.");
			int dias = input.nextInt();	
			if (dias > 0 && dias <= 180) {
				double liquido = bruto - (bruto * 0.220);
				System.out.println("Para " + dias + " dias, a taxa de imposto de renda é de 22% sobre o ganho");
				System.out.printf("Ganho bruto: R$%.2f\n", bruto);
				System.out.printf("Ganho líquido: R$%.2f\n", liquido);
				System.out.printf("Valor estimado após o ganho: R$%.2f\n", liquido + getSaldo());
				System.out.println("Nota: O valor será aplicado apenas no próximo mês");

				
			}else if (dias >= 181 && dias <= 360){
				double liquido = bruto - (bruto * 0.20);
				System.out.println("Para " + dias + " dias, a taxa de imposto de renda é de 20% sobre o ganho");
				System.out.printf("Ganho bruto: R$%.2f\n", bruto);
				System.out.printf("Ganho líquido: R$%.2f\n", liquido);
				System.out.printf("Valor estimado após o ganho: R$%.2f\n", liquido + getSaldo());
				System.out.println("Nota: O valor será aplicado apenas no próximo mês");
	
				
			}else if (dias >= 361 && dias <= 720){
				double liquido = bruto - (bruto * 0.175);
				System.out.println("Para " + dias + " dias, a taxa de imposto de renda é de 17,5% sobre o ganho");
				System.out.printf("Ganho bruto: R$%.2f\n", bruto);
				System.out.printf("Ganho líquido: R$%.2f\n", liquido);
				System.out.printf("Valor estimado após o ganho: R$%.2f\n", liquido + getSaldo());
				System.out.println("Nota: O valor será aplicado apenas no próximo mês");

				
			}else if (dias > 720){
				double liquido = bruto - (bruto * 0.15);
				System.out.println("Para " + dias + " dias, a taxa de imposto de renda é de 15% sobre o ganho");
				System.out.printf("Ganho bruto: R$%.2f\n", bruto);
				System.out.printf("Ganho líquido: R$%.2f\n", liquido);
				System.out.printf("Valor estimado após o ganho: R$%.2f\n", liquido + getSaldo());
				System.out.println("Nota: O valor será aplicado apenas no próximo mês");

				
			}else {
				System.out.println("Opção inválida");
			}
			
		}else {
            System.out.println("A consulta de rendimentos não é possível, pois a conta corrente ainda não foi criada.");
        }

	}
	
	@Override
	public void extrato() {
		if (this.getStatus() == true) { 
		System.out.printf("Saldo atual da conta corrente é R$%.2f\n", getSaldo());
        } else {
            System.out.println("A consulta do extrato não é possível, pois a conta ainda não foi criada.");
        }
	}
	
	@Override
	public void acessarContaCorrente() {
		boolean sair = false; 
		if (this.getStatus() == true) { 
		while(!sair) {  
		System.out.println("----------------------------------");
		System.out.println("[1] Depositar em conta corrente");
		System.out.println("[2] Sacar em conta corrente");
		System.out.println("[3] Transferir em conta corrente");
		System.out.println("[4] Solicitar empréstimo");
		System.out.println("[5] Rendimento da conta corrente");
		System.out.println("[6] Exibir o extrato conta corrente");
		System.out.println("[7] Menu Principal");
		System.out.println("-----------------------------------");
		
		int opcao2 = input.nextInt(); 
		switch (opcao2) { 
		case 1:
			depositar(opcao2);;
			break;
			
		case 2:
			sacar(opcao2);;
			break;
			
		case 3:
			transferir(opcao2);
			break;
			
		case 4:
			emprestimo(opcao2);;
			break;
			
		case 5:
			rendimento(opcao2);
			break;
			
		case 6:
			extrato();
			break;
			
		case 7:
			if (sair) {
			HeroBank.main(null); 
			}
			sair = true;
			break;
			

		default:
			System.out.println("Opção inválida");
			break;
			}
		}
		}else {
            System.out.println("O acesso não é possível, pois a conta corrente ainda não foi criada.");
        }
	}

}

