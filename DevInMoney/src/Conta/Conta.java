package Conta;

import java.text.DecimalFormat;

public class Conta {	
			
		private String nome;
		private String cpf;
		protected double rendaMensal;
		private String agencia;
		private String conta;
		private TipoConta tipoConta;
		private double saldo;
		
		DecimalFormat form = new DecimalFormat("#,##0.00");
		
		public Conta() {			
		}
		
		public Conta(String nome, String cpf, double rendaMensal, String agencia, String conta, TipoConta tipoConta, double saldo) {
			super();
			this.nome = nome;
			this.cpf = cpf;
			this.rendaMensal = rendaMensal;
			this.agencia = agencia;
			this.conta = conta;
			this.tipoConta = tipoConta;			
			this.saldo = saldo;
		}				
						
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getRendaMensal() {
			return rendaMensal;
		}
		public void setRendaMensal(double rendaMensal) {
			this.rendaMensal = rendaMensal;
		}
		public String getConta() {
			return conta;
		}
		public void setConta(String conta) {
			this.conta = conta;
		}
		public String getAgencia() {
			return agencia;
		}
		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}			
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public TipoConta getTipoConta() {
			return tipoConta;
		}
		public void setTipoConta(TipoConta tipoConta) {
			this.tipoConta = tipoConta;
		}		
		
		public String retorna_nome() {return(nome);}
		public String retorna_cpf() {return(cpf);}
		public double retorna_rendaMensal() {return(rendaMensal);}
		public String retorna_conta() {return(conta);}
		public String retorna_agencia() {return(agencia);}
		public double retorna_saldo() {return(saldo);}
		public TipoConta retorna_tipoConta() {return(tipoConta);}		
		
}
