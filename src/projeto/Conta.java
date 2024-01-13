package projeto;

import java.util.Random;
import java.util.Scanner;


public class Conta {
	Random random = new Random();
	Scanner input = new Scanner(System.in);
	
	private int numeroConta;
	private int numeroContaCP;
	private int numeroContaPJ;
	private final int numeroAgencia = 1987;
	private String titular;
	private String titularPJ;
	private double saldoConta;
	private double saldoContaPoupanca;
	private double saldoContaPj;
	private boolean status = false;
	private String cpf;
	private String cnpj;
	
	public int getNumContaCP() {
		return numeroContaCP;
	}

	public void setNumContaCP() {
	       this.numeroContaCP = random.nextInt(1000);
	}
	
	public int getNumContaPJ() {
		return numeroContaPJ;
	}

	public void setNumContaPJ() {
	       this.numeroContaPJ = random.nextInt(1000); 
	}
	
	public double getSaldoCP() {
		return saldoContaPoupanca;
	}

	public void setSaldoCP(double saldoCP) {
		this.saldoContaPoupanca = saldoCP;
	}
	
	public double getSaldoPJ() {
		return saldoContaPj;
	}

	public void setSaldoPJ(double saldoPJ) {
		this.saldoContaPj = saldoPJ;
	}


	
	
	public void abrirConta() {
		
	}

	public int getNumConta() {
		return numeroConta;
	}

	public void setNumConta() {	
        this.numeroConta = random.nextInt(1000); 
		
	}
	
	public int getNumAgencia() {
		return numeroAgencia;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getTitularPJ() {
		return titularPJ;
	}

	public void setTitularPJ(String titularPJ) {
		this.titularPJ = titularPJ;
	}

	public double getSaldo() {
		return saldoConta;
	}

	public void setSaldo(double saldo) {
		this.saldoConta = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		
		while(cpf.length() != 11) { 
			System.out.println("CPF inválido, digite 11 dígitos");
			cpf = input.nextLine();	
		}
		this.cpf = cpf;	
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		
		while(cnpj.length() != 14) { 
			System.out.println("CNPJ inválido, digite 14 dígitos");
			cnpj = input.nextLine();	
		}
		this.cnpj = cnpj;	
	}
	
	
	
	
	public void transferir(double valor) {
		
	 }
	
	public void extrato() {
		
	}
	
	public void sacar(double valor) {
		
	}
	
	public void depositar(double valor) {

		
	}
	
	public void emprestimo(double valor) {
		
	}
	
	public void rendimento(double juros) {
		
	}
	
	public void rendimentoCP(double valor) {
		
	}
	
	public void acessarContaCorrente() {
		
	}
	
	public void acessarCP() {
		
	}
	
	public void acessarPJ() {
		
	}

}
