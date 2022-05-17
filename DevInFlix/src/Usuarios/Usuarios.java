package Usuarios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Usuarios {
	
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	private Pagamento pagamento;
	
	
	public long idade (int ano, int mes, int dia) {
		LocalDate start = LocalDate.of(ano, mes, dia);
		LocalDate end = LocalDate.now();
		long years = ChronoUnit.YEARS.between(start, end);
		return years;
	}
	
	public Usuarios (String nome, String cpf, String endereco, String email, Pagamento pagamento) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
		this.pagamento = pagamento;
	}
	
	public void apresentaUsuario() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("E-mail: " + this.getEmail());
		System.out.print("Forma de Pagamento: " + this.getPagamento() + "\n\n");
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}		

	
	public String retorna_nome() {return(nome);}
	public String retorna_cpf() {return(cpf);}
	public String retorna_endereco() {return(endereco);}
	public String retorna_email() {return(email);}
	public Pagamento retorna_pagamento() {return(pagamento);}
}