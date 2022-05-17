package TiposDeConta;

import java.text.DecimalFormat;
import Conta.Conta;
import Conta.TipoConta;

public class ContaPoupança extends Conta{
		
	private double simularRendimento;
	
	DecimalFormat form = new DecimalFormat("###,###,###,##0.00");
	
	public ContaPoupança(String nome, String cpf, double rendaMensal, String agencia, String conta, TipoConta tipoConta, double saldo, double simularRendimento) {
		super(nome, cpf, rendaMensal, agencia, conta, tipoConta, saldo);
		this.simularRendimento = simularRendimento;
	}
	
	public void cp() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Renda Mensal: R$" + form.format(this.getRendaMensal()));
		System.out.println("Agência: " + this.getAgencia());
		System.out.println("Conta: " + this.getConta());
		System.out.println("Tipo de Conta:" + this.getTipoConta());
		System.out.println("Saldo: R$" + form.format(this.getSaldo()));
	}

	public double getSimularRendimento() {
		return simularRendimento;
	}
	public void setSimularRendimento(double simularRendimento) {
		this.simularRendimento = simularRendimento;
	}		
	
	public double retorna_simularRendimento() {return(simularRendimento);}
	
}
