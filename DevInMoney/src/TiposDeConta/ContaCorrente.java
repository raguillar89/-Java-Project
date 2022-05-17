package TiposDeConta;

import java.text.DecimalFormat;
import Conta.Conta;
import Conta.TipoConta;

public class ContaCorrente extends Conta{
	
	protected double chequeEspecial;
	
	DecimalFormat form = new DecimalFormat("###,###,###,##0.00");
	
	public ContaCorrente(String nome, String cpf, double rendaMensal, String agencia, String conta, TipoConta tipoConta, double saldo, double chequeEspecial) {
		super(nome, cpf, rendaMensal, agencia, conta, tipoConta, saldo);
		this.chequeEspecial = chequeEspecial;
	}		
	
	public void cc() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Renda Mensal: R$" + form.format(this.getRendaMensal()));
		System.out.println("Agência: " + this.getAgencia());
		System.out.println("Conta: " + this.getConta());
		System.out.println("Tipo de Conta:" + this.getTipoConta());
		System.out.println("Saldo: R$" + form.format(this.getSaldo()));		
		System.out.println("Cheque Especial: R$" + form.format(this.getChequeEspecial()));	
	}	

	public double getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}	
		
	public double retorna_chequeEspecial() {return(chequeEspecial);}
			
}