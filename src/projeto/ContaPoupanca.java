package projeto;

import java.util.Scanner;

public class ContaPoupanca extends Conta {
	Scanner input = new Scanner(System.in);

	
	@Override
	public void abrirConta() {
		this.setSaldoCP(0);
		System.out.println("Seja bem vindo ao Hero Bank!");
		System.out.println("Vamos iniciar o processo de criação da sua conta poupança. Por favor, insira o seu nome: ");
		String nomeTitularcp = input.nextLine();
		setTitular(nomeTitularcp);
		System.out.println("Informe o seu CPF(Apenas números):");
		String cpfcp = input.nextLine();
		setCpf(cpfcp); 
		setNumContaCP(); 
		setStatus(true);  
		System.out.printf("Saldo atual: R$%.2f\n", getSaldoCP());
		System.out.println("Nome: " + getTitular());
		System.out.println("CPF: " + getCpf());
		System.out.println("Número da Agência: " + getNumAgencia());
		System.out.println("Número da conta: " + getNumContaCP());
		System.out.println("Conta poupança criada com sucesso!");
		System.out.println("----------------------------------");
		
	}

	public void transferir(double valor) {
		if (this.getStatus() == true) { 
		System.out.println("Digite o valor do pix que deseja transferir: ");
		valor = input.nextDouble();
		if (valor <= 0) {
			System.out.println("Valor do saque não pode ser nagativo");
		}
		else if (this.getSaldoCP() > 0 && this.getSaldoCP() > valor) { 
			this.setSaldo(this.getSaldo() - valor);
			this.setSaldoCP(this.getSaldoCP() - valor);
			System.out.println("Pix realizado com sucesso!");
			System.out.printf("Saldo atual: R$%.2f\n", getSaldoCP());
		} else {
			System.out.println("Pix não realizado, pix insuficiente.");
		}
        } else {
            System.out.println("A transferência não pode ser concluída, pois a conta poupança ainda não foi criada.");
        }
	}
	
	
	public void depositar(double valor) {
		if (this.getStatus() == true) { 
		System.out.println("Digite o valor que deseja depositar: ");
		valor = input.nextDouble();
		 if (valor > 0) {
			 this.setSaldoCP(this.getSaldoCP() + valor);  
	            System.out.println("Depósito realizado com sucesso!");
	            System.out.printf("Saldo atual: R$%.2f\n", getSaldoCP());
	        } else {
	            System.out.println("Depósito não realizado, valor inválido.");
	        }
        } else {
            System.out.println("A realização de depósitos não é possível, pois a conta poupança ainda não foi criada.");
        }
	}
	
	
	public void sacar(double valor) {
		if (this.getStatus() == true) {
		System.out.println("Digite o valor de saque: ");
		valor = input.nextDouble();
		if (valor <= 0) {
			System.out.println("Valor do saque não pode ser nagativo");
		}
		else if (this.getSaldoCP() > 0 && this.getSaldoCP() > valor) { 
			this.setSaldoCP(this.getSaldoCP() - valor);
			System.out.println("Saque realizado com sucesso!");
			System.out.printf("Saldo atual: R$%.2f\n", getSaldoCP());
		} else {
			System.out.println("Saque não realizado, saldo insuficiente.");
		}
        } else {
            System.out.println("A realização de saques não é possível, pois a conta poupança ainda não foi criada.");
        }
		
	}
	
	
	public void rendimentoCP(double valor) {
		if (this.getStatus() == true) { 
			valor = 0.005;
			System.out.println("Sua conta poupança está rendendo 0,5% ao mês");
			System.out.printf("Rendimento bruto: R$%.2f\n", getSaldoCP() * valor);
			System.out.printf("Valor estimado com o rendimento: R$%.2f\n", getSaldoCP() * valor + getSaldoCP());
			System.out.println("Obs: Valor será aplicado apenas no mês seguinte");
		}else {
            System.out.println("A concessão de empréstimo não é possível, pois a conta ainda não foi criada.");
        }
		
	}

	
	public void extrato() {
		if (this.getStatus() == true) { 
		System.out.printf("Saldo atual da conta poupança é R$%.2f\n", getSaldoCP());
        } else {
            System.out.println("A consulta do extrato não é possível, pois a conta poupança ainda não foi criada.");
        }
		
	}
	
	
	public void acessarCP() {
		boolean sair = false;
		if (this.getStatus() == true) { 
		while(!sair) { 
		System.out.println("-------------------------------");
		System.out.println("[1] Depositar em conta poupança");
		System.out.println("[2] Sacar em conta poupança");
		System.out.println("[3] Transferir em conta poupança");
		System.out.println("[4] Rendimento da conta poupança");
		System.out.println("[5] Exibir o extrato conta poupança");
		System.out.println("[6] Menu Principal");
		System.out.println("-------------------------------");
		
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
			rendimentoCP(opcao2);
			break;
			
		case 5:
			extrato();
			break;
			
		case 6:
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
            System.out.println("O acesso não é possível, pois a conta poupança ainda não foi criada.");
        }
		
	}

}


