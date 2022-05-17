package TiposDeConta;

import java.text.DecimalFormat;
import Conta.Conta;
import Conta.TipoConta;

public class ContaInvestimento extends Conta{
	
	private double simularInvestimento;
	
	DecimalFormat form = new DecimalFormat("###,###,###,##0.00");
	
	public ContaInvestimento(String nome, String cpf, double rendaMensal, String agencia, String conta, TipoConta tipoConta, double saldo, double simularInvestimento) {
		super(nome, cpf, rendaMensal, agencia, conta, tipoConta, saldo);
		this.simularInvestimento = simularInvestimento;
	}
	
	public void ci() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Renda Mensal: R$" + form.format(this.getRendaMensal()));
		System.out.println("Agência: " + this.getAgencia());
		System.out.println("Conta: " + this.getConta());
		System.out.println("Tipo de Conta:" + this.getTipoConta());
		System.out.println("Saldo: R$" + form.format(this.getSaldo()));
	}

	public double getSimularInvestimento() {
		return simularInvestimento;
	}
	public void setSimularInvestimento(double simularInvestimento) {
		this.simularInvestimento = simularInvestimento;
	}	
	
	public double retorna_simularInvestimento() {return(simularInvestimento);}
	
}
