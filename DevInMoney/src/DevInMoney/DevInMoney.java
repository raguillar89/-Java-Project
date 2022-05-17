package DevInMoney;

import java.text.DecimalFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;
import Conta.Conta;
import TiposDeConta.ContaCorrente;
import TiposDeConta.ContaPoupan�a;
import TiposDeConta.ContaInvestimento;
import Conta.TipoConta;

public class DevInMoney {
	
	public static void main(String[] args) {
		
		ContaCorrente CC1 = new ContaCorrente("Francisco Santana", "111.111.111-11", 3600.00, "001 - Florian�polis", "11111-1", TipoConta.CONTA_CORRENTE, 5400.00, 0.00);
		ContaPoupan�a CP1 = new ContaPoupan�a("Fernando Emilio", "222.222.222-22", 2100.00, "001 - Florian�polis", "11111-2", TipoConta.CONTA_POUPAN�A, 2200.00, 0.00);
		ContaInvestimento CI1 = new ContaInvestimento("Cesar Abascal", "333.333.333-33", 2543.00, "001 - Florian�polis", "11111-3", TipoConta.CONTA_INVESTIMENTO, 4780.00, 0.00);
		
		double saldoCC1 = CC1.getSaldo();
		double saldoCP1 = CP1.getSaldo();
		double saldoCI1 = CI1.getSaldo();	
		double valor;
		
		int opcao = 0;		
		int agc = 0;
		double inv = 0;
		
		double cE = CC1.getRendaMensal() * 0.3;
		double saldoTotal = cE + saldoCC1;
		CC1.setChequeEspecial(cE);
		CC1.setSaldo(saldoCC1);
		CP1.setSaldo(saldoCP1);
		CI1.setSaldo(saldoCI1);
		
		DecimalFormat form = new DecimalFormat("###,###,###,##0.00");
				
		ArrayList<String> extratoCC1 = new ArrayList<String>();		
		ArrayList<String> extratoCP1 = new ArrayList<String>();	
		ArrayList<String> extratoCI1 = new ArrayList<String>();	
		
		ArrayList<String> extratoGeralCC1 = new ArrayList<String>();	
		ArrayList<String> extratoGeralCP1 = new ArrayList<String>();	
		ArrayList<String> extratoGeralCI1 = new ArrayList<String>();	
		
		ArrayList<String> listaCC = new ArrayList<String>();
		ArrayList<String> listaCP = new ArrayList<String>();
		ArrayList<String> listaCI = new ArrayList<String>();
		
		ArrayList<String> totalInvest = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		LocalDateTime now = LocalDateTime.now();
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = now.format(formatter);
		
		while(agc <= 2) {						
			System.out.println("Digite sua ag�ncia: \n1. Florian�polis \n2. S�o Jos� \n3. Sair");
			agc = sc.nextInt();		
			
			switch(agc) {
			
			case 1:					
				System.out.println("\nDigite sua conta (com 6 d�gitos -> xxxxx-x): ");
				sc.nextLine();
				String cont1 = sc.nextLine();
				
				switch(cont1) {
				
				case "11111-1":				
					System.out.println("\nDigite sua senha de 6 d�gitos: ");
					String senhaCC1 = sc.nextLine();	
						
						if(agc == 1 && cont1.equals("11111-1") && senhaCC1.equals("011288")) {			
							System.out.println("\nOl� Francisco, tudo bem?");
								
							do {
								System.out.println("\n                      Menu  \n\n1. Alterar Dados Cadastrais             Saque .2 \n3. Dep�sito                     Transfer�ncia .4 \n5. Saldo                              Extrato .6 \n7. Sair");
								System.out.println("\nQual op��o gostaria: "); 
								opcao = sc.nextInt();
								
								if(opcao == 1) {										
									System.out.println("\nGostaria de alterar alguma informa��o? \n1. Sim \n2. N�o");
									sc.nextLine();
									int alteracao = sc.nextInt();
									
									if(alteracao == 1) {
										int alt;
									
										do {
											System.out.println("\nQual informa��o gostaria de alterar? \n\n1. Nome \n2. Renda Mensal \n3. Ag�ncia \n4. Dados Cadastrais \n5. Voltar ao Menu Principal");
											alt = sc.nextInt();								
											
											if(alt == 1) {								
												System.out.println("\nQual � o novo nome? \n");
												sc.nextLine();
												String novoNome = sc.nextLine();											
												CC1.setNome(novoNome);									
												
											} else if (alt == 2) {								
												System.out.println("\nQual � o novo valor da renda? \n");
												sc.nextLine();
												Double novaRenda = sc.nextDouble();											
												CC1.setRendaMensal(novaRenda);
																							
											} else if (alt == 3) {											
												System.out.println("\nQual � a nova ag�ncia? \n001 - Florian�polis \n002 - S�o Jos� \n");
												sc.nextLine();
												String novaAgencia = sc.nextLine();
												
												if(novaAgencia.equals("001 - Florian�polis") || novaAgencia.equals("002 - S�o Jos�")) {									
													CC1.setAgencia(novaAgencia);
																									
												} else {
													System.out.println("Esta ag�ncia n�o existe.");
												}
																												
											} else if (alt == 4) {
												CC1.cc();
											}
										} while(alt < 5);
									}		
																	
								} else if (opcao == 2) {					
									System.out.println("\nDigite o valor que gostaria de sacar: R$");
									valor = sc.nextDouble();
																											
									if(valor <= saldoCC1) {
										saldoCC1 -= valor;
										extratoCC1.add("\nValor (Transfer�ncia): -R$" + form.format(valor) + "\n");
										extratoGeralCC1.add("\nValor (Transfer�ncia): -R$" + form.format(valor) + "\nDatat e Hora da Transa��o: " + formatDateTime + "\n");
										saldoTotal = cE + saldoCC1;
									} else if(valor > saldoCC1 && valor < saldoTotal) {
										double v = saldoCC1 -= valor;
										double vv = v * -1;									
										if(vv <= cE) {
											cE -= v;
											extratoCC1.add("\nValor (Transfer�ncia): -R$" + form.format(valor) + "\n");
											extratoGeralCC1.add("\nValor (Transfer�ncia): -R$" + form.format(valor) + "\nDatat e Hora da Transa��o: " + formatDateTime + "\n");
											if(saldoCC1 > 0) {
												saldoTotal = saldoCC1 - cE;
												CC1.setSaldo(saldoCC1);
												CC1.setChequeEspecial(cE);
											} else {
												saldoTotal = saldoCC1 + cE;
												CC1.setSaldo(saldoCC1);
												CC1.setChequeEspecial(cE);
											}
										} else {
											System.out.println("Valor maior que o dispon�vel.");
										}
									} else {				
										System.out.println("\nSaldo Insuficiente.");				
									}
									
								} else if (opcao == 3) {					
									System.out.println("\nDigite o valor que gostaria de depositar: R$");					
									valor = sc.nextDouble();
									saldoCC1 += valor;
									extratoCC1.add("\nValor (Dep�sito): +R$" + form.format(valor) + "\n");
									extratoGeralCC1.add("\nValor (Dep�sito): +R$" + form.format(valor) + "\nDatat e Hora da Transa��o: " + formatDateTime + "\n");
									
								} else if (opcao == 4) {
									if(DayOfWeek.SATURDAY.equals(localDate.getDayOfWeek()) || DayOfWeek.SUNDAY.equals(localDate.getDayOfWeek())) {
										System.out.println("N�o � poss�vel fazer transfer�ncias em Finais de Semana.");
									} else {
										System.out.println("Digite a ag�ncia do favorecido (com 3 d�gitos -> xxx): ");
										sc.nextLine();
										String ag = sc.nextLine();
										
										if(ag.equals("001") || ag.equals("002")) {					
											System.out.println("Digite o tipo de conta do favorecido (Conta Corrente, Conta Poupan�a ou Conta Investimento): ");
											String tc = sc.nextLine();
											
											if(tc.equals("Conta Corrente") || tc.equals("Conta Poupan�a") || tc.equals("Conta Investimento")) {											
												System.out.println("Digite a conta do favorecido (com 6 d�gitos -> xxxxx-x): ");
												String ct = sc.nextLine();
												
												if(ct.equals("11111-2") || ct.equals("11111-3")) {
													
													System.out.println("Digite o valor a ser transferido: R$");
													double vt = sc.nextDouble();
																		
													if(vt <= saldoCC1) {
														saldoCC1 -= vt;
														extratoCC1.add("\nValor (Transfer�ncia): -R$" + form.format(vt) + "\n");
														extratoGeralCC1.add("\nValor (Transfer�ncia): -R$" + form.format(vt) + "\nDatat e Hora da Transa��o: " + formatDateTime + "\n");
														saldoTotal = cE + saldoCC1;
													} else if(vt > saldoCC1 && vt < saldoTotal) {
														double v = saldoCC1 -= vt;
														double vv = v * -1;													
														if(vv <= cE) {
															cE -= vv;
															extratoCC1.add("\nValor (Transfer�ncia): -R$" + form.format(vt) + "\n");
															extratoGeralCC1.add("\nValor (Transfer�ncia): -R$" + form.format(vt) + "\nDatat e Hora da Transa��o: " + formatDateTime + "\n");
															if(saldoCC1 > 0) {
																saldoTotal = saldoCC1 + cE;
																CC1.setSaldo(saldoCC1);
																CC1.setChequeEspecial(cE);
															} else {
																saldoTotal = saldoCC1 - cE;
																CC1.setSaldo(saldoCC1);
																CC1.setChequeEspecial(cE);
															}
														} else {
															System.out.println("Valor maior que o dispon�vel.");
														}
													} else {				
														System.out.println("\nSaldo Insuficiente.");				
													}
																			
												} else {	
													System.out.println("N�o � poss�vel fazer transfer�ncia para a conta de origem.");							
												}
											} else {
												System.out.println("Tipo de Conta Inv�lida.");
											}
										} else {
											System.out.println("Ag�ncia Inexistente.");
										}
									}									
								} else if (opcao == 5) {									
									System.out.println("\nSeu saldo atual � de: R$" + form.format(saldoCC1) + "\nCheque Especial: R$1.080,00" + "\nCheque Especial Atual: R$" + form.format(cE));
									
								} else if (opcao == 6) {								
									System.out.println("\n     Extrato da Conta: \n" + extratoCC1);										
								}							
							} while(opcao < 7);
							
						}					
					break;
					
				case "11111-2":				
					System.out.println("\nDigite sua senha de 6 d�gitos: ");
					String senhaCP1 = sc.nextLine();	
						
						if(agc == 1 && cont1.equals("11111-2") && senhaCP1.equals("170483")) {			
							System.out.println("\nOl� Fernando, tudo bem?");
								
							do {
								System.out.println("\n                      Menu  \n\n1. Alterar Dados Cadastrais             Saldo .2 \n3. Saque                             Dep�sito .4 \n5. Transfer�ncia                      Extrato .6 \n7. Simulador de Rendimento               Sair .8");
								System.out.println("\nQual op��o gostaria: ");
								opcao = sc.nextInt();
								
								if(opcao == 1) {									
									System.out.println("\nGostaria de alterar alguma informa��o? \n1. Sim \n2. N�o");
									sc.nextLine();
									int alteracao = sc.nextInt();
									
									if(alteracao == 1) {
										int alt;
									
										do {
											System.out.println("\nQual informa��o gostaria de alterar? \n\n1. Nome \n2. Renda Mensal \n3. Ag�ncia \n4. Dados Cadastrais \n5. Voltar ao Menu Principal");
											alt = sc.nextInt();								
											
											if(alt == 1) {								
												System.out.println("\nQual � o novo nome? \n");
												sc.nextLine();
												String novoNome = sc.nextLine();											
												CC1.setNome(novoNome);									
												
											} else if (alt == 2) {								
												System.out.println("\nQual � o novo valor da renda? \n");
												sc.nextLine();
												Double novaRenda = sc.nextDouble();											
												CC1.setRendaMensal(novaRenda);
																							
											} else if (alt == 3) {											
												System.out.println("\nQual � a nova ag�ncia? \n001 - Florian�polis \n002 - S�o Jos� \n");
												sc.nextLine();
												String novaAgencia = sc.nextLine();
												
												if(novaAgencia.equals("001 - Florian�polis") || novaAgencia.equals("002 - S�o Jos�")) {									
													CC1.setAgencia(novaAgencia);
																									
												} else {
													System.out.println("Esta ag�ncia n�o existe.");
												}
																												
											} else if (alt == 4) {
												CP1.cp();
											}
										} while(alt < 5);
									}		
																	
								} else if (opcao == 2) {										
									System.out.println("\nSeu saldo atual � de: R$" + form.format(saldoCP1));
																	
								} else if (opcao == 3) {					
									System.out.println("\nDigite o valor que gostaria de sacar: R$");
									valor = sc.nextDouble();
									
									if(valor < saldoCP1) {			
										saldoCP1 -= valor;
										extratoCP1.add("\nValor (Saque): -R$" + form.format(valor) + "\n");
										extratoGeralCP1.add("\nValor (Saque): -R$" + form.format(valor) + "\nData e Hora da Transa��o: " + formatDateTime + "\n");
										
									} else {				
										System.out.println("\nSaldo Insuficiente.");				
									}	
									
								} else if (opcao == 4) {					
									System.out.println("\nDigite o valor que gostaria de depositar: R$");					
									valor = sc.nextDouble();
									saldoCP1 += valor;
									extratoCP1.add("\nValor (Dep�sito): +R$" + form.format(valor) + "\n");
									extratoGeralCP1.add("\nValor (Dep�sito): +R$" + form.format(valor) + "\nData e Hora da Transa��o: " + formatDateTime + "\n");
									
								} else if (opcao == 5) {	
									if(DayOfWeek.SATURDAY.equals(localDate.getDayOfWeek()) || DayOfWeek.SUNDAY.equals(localDate.getDayOfWeek())) {
										System.out.println("N�o � poss�vel fazer transfer�ncias em Finais de Semana.");
									} else {
										System.out.println("Digite a ag�ncia do favorecido (com 3 d�gitos -> xxx): ");
										sc.nextLine();
										String ag = sc.nextLine();
										
										if(ag.equals("001") || ag.equals("002")) {					
											System.out.println("Digite o tipo de conta do favorecido (Conta Corrente, Conta Poupan�a ou Conta Investimento): ");
											String tc = sc.nextLine();
											
											if(tc.equals("Conta Corrente") || tc.equals("Conta Poupan�a") || tc.equals("Conta Investimento")) {											
												System.out.println("Digite a conta do favorecido (com 6 d�gitos -> xxxxx-x): ");
												String ct = sc.nextLine();
												
												if(ct.equals("11111-2")) {
													System.out.println("N�o � poss�vel fazer transfer�ncia para a conta de origem.");								
												} else {					
													System.out.println("Digite o valor a ser transferido: R$");
													double vt = sc.nextDouble();																	
													if(vt < saldoCP1) {
														saldoCP1 -= vt;
														extratoCP1.add("\nAg�ncia de Origem: 001 - Florian�polis \nConta de Origem: 11111-2 \nConta de Destino: " + ct + "\nValor (Transfer�ncia): -R$" + form.format(vt) + "\nData e Hora da Transa��o: " + formatDateTime + "\n");
														extratoGeralCP1.add("\nAg�ncia de Origem: 001 - Florian�polis \nConta de Origem: 11111-2 \nConta de Destino: " + ct + "\nValor (Transfer�ncia): -R$" + form.format(vt) + "\nData e Hora da Transa��o: " + formatDateTime + "\n");
													} else {				
														System.out.println("\nSaldo Insuficiente.");				
													}					
												}
											} else {
												System.out.println("Tipo de Conta Inv�lida.");
											}
										} else {
											System.out.println("Ag�ncia Inexistente.");
										}								
									}
								} else if (opcao == 6) {
									System.out.println("\n     Extrato da Conta: \n" + extratoCP1);	
									
								} else if (opcao == 7) {									
									System.out.println("\nBem vindo ao Simulador de Rendimento da Poupan�a. \n\nO valor m�ximo para simula��o de rendimento ser� o saldo da sua conta.");
									System.out.println("\nQual o valor a ser simulado?");
									double valorPP = sc.nextDouble();
									
									if(valorPP > saldoCP1) {
										System.out.println("\nValor de saldo insuficiente para simula��o.");
									} else {
										double taxaPP = 0.005;											
										System.out.println("\nQual o per�odo, em meses, que gostaria de inserir na simula��o?");										
										int periodoPP = sc.nextInt();										
										double sR = valorPP * Math.pow((1 + taxaPP), periodoPP);
										
										System.out.println("\nO valor de R$" + form.format(valorPP) + " , proporcionar� um valor total de R$" + form.format(sR) + " durante o per�odo de " + periodoPP + " meses.");											
									}										
								}							
							} while(opcao < 8);
							
						}					
					break;
					
				case "11111-3":				
					System.out.println("\nDigite sua senha de 6 d�gitos: ");
					String senhaCI1 = sc.nextLine();	
						
						if(agc == 1 && cont1.equals("11111-3") && senhaCI1.equals("280278")) {			
							System.out.println("\nOl� Cesar, tudo bem?");
								
							do {
								System.out.println("\n                       Menu  \n\n1. Alterar Dados Cadastrais             Saldo .2 \n3. Dep�sito                     Transfer�ncia .4 \n5. Extrato          Simulador de Investimento .6 \n7. Sair");
								System.out.println("\nQual op��o gostaria: ");
								opcao = sc.nextInt();
								
								if(opcao == 1) {									
									System.out.println("\nGostaria de alterar alguma informa��o? \n1. Sim \n2. N�o");
									sc.nextLine();
									int alteracao = sc.nextInt();
									
									if(alteracao == 1) {
										int alt;
									
										do {
											System.out.println("\nQual informa��o gostaria de alterar? \n\n1. Nome \n2. Renda Mensal \n3. Ag�ncia \n4. Dados Cadastrais \n5. Voltar ao Menu Principal");
											alt = sc.nextInt();								
											
											if(alt == 1) {								
												System.out.println("\nQual � o novo nome? \n");
												sc.nextLine();
												String novoNome = sc.nextLine();											
												CC1.setNome(novoNome);									
												
											} else if (alt == 2) {								
												System.out.println("\nQual � o novo valor da renda? \n");
												sc.nextLine();
												Double novaRenda = sc.nextDouble();											
												CC1.setRendaMensal(novaRenda);
																							
											} else if (alt == 3) {											
												System.out.println("\nQual � a nova ag�ncia? \n001 - Florian�polis \n002 - S�o Jos� \n");
												sc.nextLine();
												String novaAgencia = sc.nextLine();
												
												if(novaAgencia.equals("001 - Florian�polis") || novaAgencia.equals("002 - S�o Jos�")) {									
													CC1.setAgencia(novaAgencia);
																									
												} else {
													System.out.println("Esta ag�ncia n�o existe.");
												}
																												
											} else if (alt == 4) {
												CI1.ci();
											}
										} while(alt < 5);
									}		
																	
								} else if (opcao == 2) {										
									System.out.println("\nSeu saldo atual � de: R$" + form.format(saldoCI1));
																	
								} else if (opcao == 3) {					
									System.out.println("\nDigite o valor que gostaria de depositar: R$");					
									valor = sc.nextDouble();
									saldoCI1 += valor;
									extratoCI1.add("\nValor (Dep�sito): +R$" + form.format(valor) + "\n");
									extratoGeralCI1.add("\nValor (Dep�sito): +R$" + form.format(valor) + "\nData e Hora da Transa��o: " + formatDateTime + "\n");
									
								} else if (opcao == 4) {
									if(DayOfWeek.SATURDAY.equals(localDate.getDayOfWeek()) || DayOfWeek.SUNDAY.equals(localDate.getDayOfWeek())) {
										System.out.println("N�o � poss�vel fazer transfer�ncias em Finais de Semana.");
									} else {
										System.out.println("Digite a ag�ncia do favorecido (com 3 d�gitos -> xxx): ");
										sc.nextLine();
										String ag = sc.nextLine();
										
										if(ag.equals("001") || ag.equals("002")) {					
											System.out.println("Digite o tipo de conta do favorecido (Conta Corrente, Conta Poupan�a ou Conta Investimento): ");
											String tc = sc.nextLine();
											
											if(tc.equals("Conta Corrente") || tc.equals("Conta Poupan�a") || tc.equals("Conta Investimento")) {											
												System.out.println("Digite a conta do favorecido (com 6 d�gitos -> xxxxx-x): ");
												String ct = sc.nextLine();
												
												if(ct.equals("11111-3")) {
													System.out.println("N�o � poss�vel fazer transfer�ncia para a conta de origem.");								
												} else {					
													System.out.println("Digite o valor a ser transferido: R$");
													double vt = sc.nextDouble();																	
													if(vt < saldoCI1) {
														saldoCI1 -= vt;
														extratoCI1.add("\nAg�ncia de Origem: 001 - Florian�polis \nConta de Origem: 11111-3 \nConta de Destino: " + ct + "\nValor (Transfer�ncia): -R$" + form.format(vt) + "\nData e Hora da Transa��o: " + formatDateTime + "\n");
														extratoGeralCI1.add("\nAg�ncia de Origem: 001 - Florian�polis \nConta de Origem: 11111-3 \nConta de Destino: " + ct + "\nValor (Transfer�ncia): -R$" + form.format(vt) + "\nData e Hora da Transa��o: " + formatDateTime + "\n");
													} else {				
														System.out.println("\nSaldo Insuficiente.");				
													}					
												}
											} else {
												System.out.println("Tipo de Conta Inv�lida.");
											}
										} else {
											System.out.println("Ag�ncia Inexistente.");
										}								
									}
								} else if (opcao == 5) {								
									System.out.println("\n     Extrato da Conta: \n" + extratoCI1);	
									
								} else if (opcao == 6) {									
									System.out.println("\nBem vindo ao Simulador de Investimentos. \n\nO valor m�ximo para simula��o de rendimento ser� o saldo da sua conta.");
									System.out.println("\nQual tipo de investimento deseja simular? \n1. Tesouro Selic - Taxa: 4,23% a.a. \n2. CDI - Taxa: 9,25% a.a. \n3. Tesouro Prefixado - Taxa: 7,47% a.a.");
									int invest = sc.nextInt();
									
									if(invest == 1) {									
										System.out.println("\nQual o valor a ser simulado?");
										double valorII = sc.nextDouble();
										
										if(valorII > saldoCI1) {
											System.out.println("\nValor de saldo insuficiente para simula��o.");
										} else {
											double taxaII = 0.0423;											
											System.out.println("\nQual o per�odo, em meses, que gostaria de inserir na simula��o?");										
											int periodoII = 1;										
											double sI = valorII * Math.pow((1 + taxaII), periodoII);
											
											System.out.println("\nO valor de R$" + form.format(valorII) + " , proporcionar� um valor total de R$" + form.format(sI) + " durante o per�odo de 1 ano pelo Tesouro Selic.");
											System.out.println("\n\nVoc� gostaria de realizar este investimento? \n1. Sim \n2. N�o");
											int ivt = sc.nextInt();
											
											if(ivt == 1) {
												saldoCI1 -= valorII;
												inv += valorII;
											}
										}
									} else if(invest == 2) {
										System.out.println("\nQual o valor a ser simulado?");
										double valorII = sc.nextDouble();
										
										if(valorII > saldoCI1) {
											System.out.println("\nValor de saldo insuficiente para simula��o.");
										} else {
											double taxaII = 0.0925;											
											System.out.println("\nQual o per�odo, em meses, que gostaria de inserir na simula��o?");										
											int periodoII = 1;										
											double sI = valorII * Math.pow((1 + taxaII), periodoII);
											
											System.out.println("\nO valor de R$" + form.format(valorII) + " , proporcionar� um valor total de R$" + form.format(sI) + " durante o per�odo de 1 ano pelo CDI.");		
											System.out.println("\n\nVoc� gostaria de realizar este investimento? \n1. Sim \n2. N�o");
											int ivt = sc.nextInt();
											
											if(ivt == 1) {
												saldoCI1 -= valorII;
												inv += valorII;
											}
										}
									} else if(invest == 3) {
										System.out.println("\nQual o valor a ser simulado?");
										double valorII = sc.nextDouble();
										
										if(valorII > saldoCI1) {
											System.out.println("\nValor de saldo insuficiente para simula��o.");
										} else {
											double taxaII = 0.0747;											
											System.out.println("\nQual o per�odo, em meses, que gostaria de inserir na simula��o?");										
											int periodoII = 1;										
											double sI = valorII * Math.pow((1 + taxaII), periodoII);
											
											System.out.println("\nO valor de R$" + form.format(valorII) + " , proporcionar� um valor total de R$" + form.format(sI) + " durante o per�odo de 1 ano pelo Tesouro Prefixado.");	
											System.out.println("\n\nVoc� gostaria de realizar este investimento? \n1. Sim \n2. N�o");
											int ivt = sc.nextInt();
											
											if(ivt == 1) {
												saldoCI1 -= valorII;
												inv += valorII;
											}
										}
									}
									
									//
										
								}
							
							} while(opcao < 7);
							
						}	
				
				default:				
					
					break;
				
				}	
				
			}		
								
		}
		
		if((CC1.getTipoConta()).equals(TipoConta.CONTA_CORRENTE)) {
			listaCC.add("\n\nTitular da Conta: " + CC1.getNome() + "\nAg�ncia: " + CC1.getAgencia() + "\nConta: " + CC1.getConta() + "\n\n");			
		} else if ((CC1.getTipoConta()).equals(TipoConta.CONTA_POUPAN�A)) {
			listaCP.add("\n\nTitular da Conta: " + CC1.getNome() + "\nAg�ncia: " + CC1.getAgencia() + "\nConta: " + CC1.getConta() + "\n\n");	
		} else if ((CC1.getTipoConta()).equals(TipoConta.CONTA_INVESTIMENTO)) {
			listaCI.add("\n\nTitular da Conta: " + CC1.getNome() + "\nAg�ncia: " + CC1.getAgencia() + "\nConta: " + CC1.getConta() + "\n\n");	
		}
		
		if((CP1.getTipoConta()).equals(TipoConta.CONTA_CORRENTE)) {
			listaCC.add("\n\nTitular da Conta: " + CP1.getNome() + "\nAg�ncia: " + CP1.getAgencia() + "\nConta: " + CP1.getConta() + "\n\n");	
		} else if ((CP1.getTipoConta()).equals(TipoConta.CONTA_POUPAN�A)) {
			listaCP.add("\n\nTitular da Conta: " + CP1.getNome() + "\nAg�ncia: " + CP1.getAgencia() + "\nConta: " + CP1.getConta() + "\n\n");	
		} else if ((CP1.getTipoConta()).equals(TipoConta.CONTA_INVESTIMENTO)) {
			listaCI.add("\n\nTitular da Conta: " + CP1.getNome() + "\nAg�ncia: " + CP1.getAgencia() + "\nConta: " + CP1.getConta() + "\n\n");	
		}

		if((CI1.getTipoConta()).equals(TipoConta.CONTA_CORRENTE)) {
			listaCC.add("\n\nTitular da Conta: " + CI1.getNome() + "\nAg�ncia: " + CI1.getAgencia() + "\nConta: " + CI1.getConta() + "\n\n");	
		} else if ((CI1.getTipoConta()).equals(TipoConta.CONTA_POUPAN�A)) {
			listaCP.add("\n\nTitular da Conta: " + CI1.getNome() + "\nAg�ncia: " + CI1.getAgencia() + "\nConta: " + CI1.getConta() + "\n\n");	
		} else if ((CI1.getTipoConta()).equals(TipoConta.CONTA_INVESTIMENTO)) {
			listaCI.add("\n\nTitular da Conta: " + CI1.getNome() + "\nAg�ncia: " + CI1.getAgencia() + "\nConta: " + CI1.getConta() + "\n\n");	
		}
		
		System.out.println("\nLista de ContasCorrente" + listaCC);
		System.out.println("\nLista de ContasPoupan�a" + listaCP);
		System.out.println("\nLista de ContasInvestimento" + listaCI);
		
		if(saldoCC1 < 0) {
			System.out.println("\nA Conta 11111-1 / Ag�ncia 001 est� com saldo negativo. Saldo Atual: R$" + saldoCC1);
		}
		if(saldoCP1 < 0) {
			System.out.println("\nA Conta 11111-2 / Ag�ncia 001 est� com saldo negativo. Saldo Atual: R$" + saldoCP1);
		}
		if(saldoCI1 < 0) {
			System.out.println("\nA Conta 11111-3 / Ag�ncia 001 est� com saldo negativo. Saldo Atual: R$" + saldoCI1);
		}
		
		System.out.println("O total de investimentos realizados pelos clientes foi de R$" + inv);
		
		System.out.println("\n     Extrato \n   Agencia: 001 \n  Conta: 11111-1 \n" + extratoGeralCC1);	
		System.out.println("\n     Extrato \n   Agencia: 001 \n  Conta: 11111-2 \n" + extratoGeralCP1);	
		System.out.println("\n     Extrato \n   Agencia: 001 \n  Conta: 11111-3 \n" + extratoGeralCI1);
		
	}	

}