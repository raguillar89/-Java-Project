package DevInFlix;

import Filmes.Filmes;
import Filmes.GeneroFilme;
import Usuarios.Pagamento;
import Usuarios.Usuarios;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class DevInFlix {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		int usuario = 0;
		int escolha, recomendacao, catalogo;
		int contCurtir = 0;
		int contDescurtir = 0;
		int ficcaoCientifica = 0;
		int comediaRomantica = 0;
		int aventura = 0;
		int acao = 0;
		int guerra = 0;
		int drama = 0;
		int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		
				
		while(usuario <= 15) {
			System.out.println("Escolha o usuário: \n\n1. Renan Pinho. \n2. Eric Pinho. \n3. Priscila Seguro. \n4. Stephanie Facre \n5. Sonia Mary \n6. Jose Ricardo \n7. Wilma Therezinha \n8. Vitor Rocha \n9. Rodrigo Soutinho \n10. Luis Fernando \n11. Lucas Pinho \n12. Louise Pinho \n13. Tainah Lima \n14. Daniel Ruiz \n15. Patricia Seguro \n16. Sair");
			usuario = sc.nextInt();
			
			switch(usuario) {			
			
			case 1:
				System.out.println("Bem-Vindo Renan Pinho, Tudo Bem?");
				
				Random rdrp = new Random();
				int inadimplenciaRenanPinho = rdrp.nextInt(2);
				
				if(inadimplenciaRenanPinho == 0) {
					System.out.println("\nVerificamos que seu pagamento ainda não consta em nosso sistema. Por gentileza, regularize seu pagamento para que possa ter novamente acesso a sua conta. Obrigado.\n");
				
				} else {						
				
					System.out.println("\nDigite: \n\n1. Informações do Usuário. \n2. Escolha um Filme.");
					escolha = sc.nextInt();
					
					if (escolha == 1) {
						Usuarios usuario1 = new Usuarios("Renan Pinho", "111.111.111-11", "Avenida ABC, 123", "renan.pinho@usuario.com.br", Pagamento.DEBITO);
						usuario1.apresentaUsuario();
						long idade1 = usuario1.idade(1989, 3, 1);
						System.out.println("Idade: " + idade1 + "\n\n");
						
					} else if (escolha == 2) {
						System.out.println("Digite: \n\n1. Star Wars: Episódio I - A Ameaça Fantasma. \n2. Como Se Fosse a Primeira Vez. \n3. Jumanji: Bem-vindo à Selva. \n4. Duro de Matar. \n5. O Destino de Uma Nação. \n6. Jobs.");
						int filme = sc.nextInt();
						
						if (filme == 1) {
							Filmes filme1 = new Filmes("Star Wars: Episódio I - A Ameaça Fantasma", 
													   "Obi-Wan e seu mentor embarcam em uma perigosa aventura na tentativa de salvar o planeta das garras de Darth Sidious. Durante a viagem, eles conhecem um habilidoso menino e decidem treiná-lo para se tornar um Jedi. Mas o tempo irá revelar que as coisas nem sempre são o que aparentam ser.",
													   GeneroFilme.FICCAO_CIENTIFICA,
													   "2h16min",
													   "Liam Neeson, Ewan McGregor, Natalie Portman, Jake Lloyd, Ian McDiarmid, Ray Park, Anthony Daniels, Kenny Baker, Pernilla August, Frank Oz",
													   "George Lucas",
													   "LucasFilm Ltd.",
													   "24 de Junho de 1999");
							filme1.apresentaFilme();
							ficcaoCientifica++;
																	
						} else if (filme == 2) {
							Filmes filme2 = new Filmes("Como Se Fosse a Primeira Vez", 
													   "Henry Roth é um veterinário paquerador, que vive no Havaí, e famoso pelo grande número de turistas que conquista. Seu novo alvo é Lucy Whitmore, que mora no local e por quem Henry se apaixona perdidamente. Mas Lucy sofre de falta de memória de curto prazo e, por isso, ela rapidamente se esquece de fatos que acabaram de acontecer. Assim, Henry é obrigado a conquistá-la, dia após dia, para ficar ao seu lado.",
													   GeneroFilme.COMEDIA_ROMANTICA,
													   "1h39min",
													   "Adam Sandler, Drew Barrymore, Rob Schneider, Sean Astin, Lusia Strus, Blake Clark, Dan Aykroyd",
													   "Peter Segal",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");
							filme2.apresentaFilme();
							comediaRomantica++;
																			
						} else if (filme == 3) {
							Filmes filme3 = new Filmes("Jumanji: Bem-vindo à Selva", 
													   "Quatro adolescentes encontram um videogame cuja ação se passa em uma floresta tropical. Empolgados com o jogo, eles escolhem seus avatares para o desafio, mas um evento inesperado faz com que eles sejam transportados para dentro do universo fictício, transformando-os nos personagens da aventura.",
													   GeneroFilme.AVENTURA,
													   "1h59min",
													   "Dwayne Johnson, Kevin Hart, Jack Black, Karen Gillan, Nick Jonas",
													   "Jake Kasdan",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");		
							filme3.apresentaFilme();
							aventura++;
													
						} else if (filme == 4) {
							Filmes filme4 = new Filmes("Duro de Matar", 
													   "O policial de Nova York John McClane está visitando sua família no Natal. Ele participa de uma confraternização de fim de ano na sede da empresa japonesa em que a esposa trabalha. A festa é interrompida por terroristas que invadem o edifício de luxo. McClane não demora a perceber que não há ninguém para salvá-los, a não ser ele próprio.",
													   GeneroFilme.ACAO,
													   "2h12min",
													   "Bruce Willis, Alan Rickman, Bonnie Bedelia, Reginald VelJohnson",
													   "John McTiernan",
													   "20th Century Studios",
													   "22 de Dezembro de 1988");		
							filme4.apresentaFilme();						
							acao++;
													
						} else if (filme == 5) {
							Filmes filme5 = new Filmes("O Destino de Uma Nação", 
													   "Winston Churchill está prestes a encarar um de seus maiores desafios: tomar posse do cargo de primeiro-ministro da Grã-Bretanha. Enquanto isso, ele costura um tratado de paz com a Alemanha nazista que pode significar o fim de anos de conflito.",
													   GeneroFilme.ACAO,
													   "2h05min",
													   "Gary Oldman, Ben Mendelsohn, Kristin Scott Thomas, Lily James, Stephen Dillane, Ronald Pickup",
													   "Joe Wright",
													   "Working Title Films",
													   "11 de Janeiro de 2018");		
							filme5.apresentaFilme();								
							guerra++;
													
						} else if (filme == 6) {
							Filmes filme6 = new Filmes("Jobs", 
													   "Em 1976, Steve Jobs abandonou a faculdade e junto com seu amigo, o gênio da tecnologia Steve Wozniak, iniciaram uma revolução nos computadores com a invenção do Apple 1, o primeiro computador pessoal. Construído na garagem dos pais de Jobs, o Apple 1 e a formação da empresa Apple mudaram o mundo para sempre. Steve Jobs não se incomodava em passar por cima dos outros para atingir suas metas, o que fez com que tivesse dificuldades em manter relações amorosas e de amizade.",
													   GeneroFilme.DRAMA,
													   "2h09min",
													   "Ashton Kutcher, Dermot Mulroney, Josh Gad, Lukas Haas, J.K. Simmons, Lesley Ann Warren, Ron Eldard, Ahna O'Reilly, John Getz, James Woods, Matthew Modine",
													   "Joshua Michael Stern",
													   "The Five Star Institute",
													   "1 de Novembro de 2013");		
							filme6.apresentaFilme();						
							drama++;
													
						}
						
						System.out.println("\nGostou do Filme? \n\nDigite: \n\n1. Curti o Filme. \n2. Não Curti o Filme.");
						int avaliacao = sc.nextInt();
						
						if (avaliacao == 1) {
							contCurtir++;
							System.out.println("Que Bom Que Curtiu! =) \n\nVocê Recomenda Este Filme Para Algum Usuário? \n\n1. Eric Pinho. \n2. Priscila Seguro. \n3. Stephanie Facre. \n4. Sonia Mary. \n5. Jose Ricardo. \n6. Wilma Therezinha. \n7. Vitor Rocha. \n8. Rodrigo Soutinho. \n9. Luis Fernando. \n10. Lucas Pinho. \n11. Louise Pinho. \n12. Tainah Lima. \n13. Daniel Ruiz. \n14. Patricia Seguro.");
							recomendacao = sc.nextInt();
							
							if (recomendacao == 1) {
								System.out.println("Você Recomendou Este Filme para Eric Pinho.");
							} else if (recomendacao == 2) {
								System.out.println("Você Recomendou Este Filme para Priscila Seguro.");
							} else if (recomendacao == 3) {
								System.out.println("Você Recomendou Este Filme para Stephanie Facre.");
							} else if (recomendacao == 4) {
								System.out.println("Você Recomendou Este Filme para Sonia Mary.");
							} else if (recomendacao == 5) {
								System.out.println("Você Recomendou Este Filme para José Ricardo.");
							} else if (recomendacao == 6) {
								System.out.println("Você Recomendou Este Filme para Wilma Therezinha.");
							} else if (recomendacao == 7) {
								System.out.println("Você Recomendou Este Filme para Vitor Rocha.");
							} else if (recomendacao == 8) {
								System.out.println("Você Recomendou Este Filme para Rodrigo Soutinho.");
							} else if (recomendacao == 9) {
								System.out.println("Você Recomendou Este Filme para Luis Fernando.");
							} else if (recomendacao == 10) {
								System.out.println("Você Recomendou Este Filme para Lucas Pinho.");
							} else if (recomendacao == 11) {
								System.out.println("Você Recomendou Este Filme para Louise Pinho.");
							} else if (recomendacao == 12) {
								System.out.println("Você Recomendou Este Filme para Tainah Lima.");
							} else if (recomendacao == 13) {
								System.out.println("Você Recomendou Este Filme para Daniel Ruiz.");
							} else if (recomendacao == 14) {
								System.out.println("Você Recomendou Este Filme para Patricia Seguro.");
							}
							
						} else if (avaliacao == 2) {
							contDescurtir++;
							System.out.println("Que Pena Que Não Gostou. =(");
						}
						
						if(day == 1) {						
							System.out.println("\nGostaria de sugerir algum filme para que coloquemos em nosso catálogo? \n\n1. Sim \n2. Nâo");
							catalogo = sc.nextInt();
							
							if (catalogo == 1) {
								System.out.println("\nQual o filme que gostaria de sugerir?");
								sc.nextLine();
								String sugestao = sc.nextLine();
								System.out.println("\nAgradecemos a sugestão! \n");
							} else if (catalogo == 2) {
								System.out.println("\nAté a próxima! \n");
							}
						} else {
							System.out.println("Sugestões de filmes somente no primeiro dia do mês.");
						}
					}
										
				}
			
				break;
				
			case 2:
				System.out.println("Bem-Vindo Eric Pinho, Tudo Bem?");

				Random rdep = new Random();
				int inadimplenciaEricPinho = rdep.nextInt(2);
				
				if(inadimplenciaEricPinho == 0) {
					System.out.println("\nVerificamos que seu pagamento ainda não consta em nosso sistema. Por gentileza, regularize seu pagamento para que possa ter novamente acesso a sua conta. Obrigado.\n");
				
				} else {						
				
					System.out.println("\nDigite: \n\n1. Informações do Usuário. \n2. Escolha um Filme.");
					escolha = sc.nextInt();
									
					if (escolha == 1) {
						Usuarios usuario2 = new Usuarios("Eric Pinho", "121.111.111-11", "Avenida ABC, 122", "eric.pinho@usuario.com.br", Pagamento.CREDITO);
						usuario2.apresentaUsuario();
						long idade2 = usuario2.idade(1982, 9, 18);
						System.out.println("Idade: " + idade2 + "\n\n");
						
					} else if (escolha == 2) {
						System.out.println("Digite: \n\n1. Star Wars: Episódio I - A Ameaça Fantasma. \n2. Como Se Fosse a Primeira Vez. \n3. Jumanji: Bem-vindo à Selva. \n4. Duro de Matar. \n5. O Destino de Uma Nação. \n6. Jobs.");
						int filme = sc.nextInt();
						
						if (filme == 1) {
							Filmes filme1 = new Filmes("Star Wars: Episódio I - A Ameaça Fantasma", 
													   "Obi-Wan e seu mentor embarcam em uma perigosa aventura na tentativa de salvar o planeta das garras de Darth Sidious. Durante a viagem, eles conhecem um habilidoso menino e decidem treiná-lo para se tornar um Jedi. Mas o tempo irá revelar que as coisas nem sempre são o que aparentam ser.",
													   GeneroFilme.FICCAO_CIENTIFICA,
													   "2h16min",
													   "Liam Neeson, Ewan McGregor, Natalie Portman, Jake Lloyd, Ian McDiarmid, Ray Park, Anthony Daniels, Kenny Baker, Pernilla August, Frank Oz",
													   "George Lucas",
													   "LucasFilm Ltd.",
													   "24 de Junho de 1999");
							filme1.apresentaFilme();
							ficcaoCientifica++;
																	
						} else if (filme == 2) {
							Filmes filme2 = new Filmes("Como Se Fosse a Primeira Vez", 
													   "Henry Roth é um veterinário paquerador, que vive no Havaí, e famoso pelo grande número de turistas que conquista. Seu novo alvo é Lucy Whitmore, que mora no local e por quem Henry se apaixona perdidamente. Mas Lucy sofre de falta de memória de curto prazo e, por isso, ela rapidamente se esquece de fatos que acabaram de acontecer. Assim, Henry é obrigado a conquistá-la, dia após dia, para ficar ao seu lado.",
													   GeneroFilme.COMEDIA_ROMANTICA,
													   "1h39min",
													   "Adam Sandler, Drew Barrymore, Rob Schneider, Sean Astin, Lusia Strus, Blake Clark, Dan Aykroyd",
													   "Peter Segal",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");
							filme2.apresentaFilme();
							comediaRomantica++;
																			
						} else if (filme == 3) {
							Filmes filme3 = new Filmes("Jumanji: Bem-vindo à Selva", 
													   "Quatro adolescentes encontram um videogame cuja ação se passa em uma floresta tropical. Empolgados com o jogo, eles escolhem seus avatares para o desafio, mas um evento inesperado faz com que eles sejam transportados para dentro do universo fictício, transformando-os nos personagens da aventura.",
													   GeneroFilme.AVENTURA,
													   "1h59min",
													   "Dwayne Johnson, Kevin Hart, Jack Black, Karen Gillan, Nick Jonas",
													   "Jake Kasdan",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");		
							filme3.apresentaFilme();
							aventura++;
													
						} else if (filme == 4) {
							Filmes filme4 = new Filmes("Duro de Matar", 
													   "O policial de Nova York John McClane está visitando sua família no Natal. Ele participa de uma confraternização de fim de ano na sede da empresa japonesa em que a esposa trabalha. A festa é interrompida por terroristas que invadem o edifício de luxo. McClane não demora a perceber que não há ninguém para salvá-los, a não ser ele próprio.",
													   GeneroFilme.ACAO,
													   "2h12min",
													   "Bruce Willis, Alan Rickman, Bonnie Bedelia, Reginald VelJohnson",
													   "John McTiernan",
													   "20th Century Studios",
													   "22 de Dezembro de 1988");		
							filme4.apresentaFilme();						
							acao++;
													
						} else if (filme == 5) {
							Filmes filme5 = new Filmes("O Destino de Uma Nação", 
													   "Winston Churchill está prestes a encarar um de seus maiores desafios: tomar posse do cargo de primeiro-ministro da Grã-Bretanha. Enquanto isso, ele costura um tratado de paz com a Alemanha nazista que pode significar o fim de anos de conflito.",
													   GeneroFilme.ACAO,
													   "2h05min",
													   "Gary Oldman, Ben Mendelsohn, Kristin Scott Thomas, Lily James, Stephen Dillane, Ronald Pickup",
													   "Joe Wright",
													   "Working Title Films",
													   "11 de Janeiro de 2018");		
							filme5.apresentaFilme();								
							guerra++;
													
						} else if (filme == 6) {
							Filmes filme6 = new Filmes("Jobs", 
													   "Em 1976, Steve Jobs abandonou a faculdade e junto com seu amigo, o gênio da tecnologia Steve Wozniak, iniciaram uma revolução nos computadores com a invenção do Apple 1, o primeiro computador pessoal. Construído na garagem dos pais de Jobs, o Apple 1 e a formação da empresa Apple mudaram o mundo para sempre. Steve Jobs não se incomodava em passar por cima dos outros para atingir suas metas, o que fez com que tivesse dificuldades em manter relações amorosas e de amizade.",
													   GeneroFilme.DRAMA,
													   "2h09min",
													   "Ashton Kutcher, Dermot Mulroney, Josh Gad, Lukas Haas, J.K. Simmons, Lesley Ann Warren, Ron Eldard, Ahna O'Reilly, John Getz, James Woods, Matthew Modine",
													   "Joshua Michael Stern",
													   "The Five Star Institute",
													   "1 de Novembro de 2013");		
							filme6.apresentaFilme();						
							drama++;
													
						}
						
						System.out.println("\nGostou do Filme? \n\nDigite: \n\n1. Curti o Filme. \n2. Não Curti o Filme.");
						int avaliacao = sc.nextInt();
						
						if (avaliacao == 1) {
							contCurtir++;
							System.out.println("Que Bom Que Curtiu! =) \n\nVocê Recomenda Este Filme Para Algum Usuário? \n\n1. Renan Pinho. \n2. Priscila Seguro. \n3. Stephanie Facre. \n4. Sonia Mary. \n5. Jose Ricardo. \n6. Wilma Therezinha. \n7. Vitor Rocha. \n8. Rodrigo Soutinho. \n9. Luis Fernando. \n10. Lucas Pinho. \n11. Louise Pinho. \n12. Tainah Lima. \n13. Daniel Ruiz. \n14. Patricia Seguro.");
							recomendacao = sc.nextInt();
							
							if (recomendacao == 1) {
								System.out.println("Você Recomendou Este Filme para Renan Pinho.");
							} else if (recomendacao == 2) {
								System.out.println("Você Recomendou Este Filme para Priscila Seguro.");
							} else if (recomendacao == 3) {
								System.out.println("Você Recomendou Este Filme para Stephanie Facre.");
							} else if (recomendacao == 4) {
								System.out.println("Você Recomendou Este Filme para Sonia Mary.");
							} else if (recomendacao == 5) {
								System.out.println("Você Recomendou Este Filme para José Ricardo.");
							} else if (recomendacao == 6) {
								System.out.println("Você Recomendou Este Filme para Wilma Therezinha.");
							} else if (recomendacao == 7) {
								System.out.println("Você Recomendou Este Filme para Vitor Rocha.");
							} else if (recomendacao == 8) {
								System.out.println("Você Recomendou Este Filme para Rodrigo Soutinho.");
							} else if (recomendacao == 9) {
								System.out.println("Você Recomendou Este Filme para Luis Fernando.");
							} else if (recomendacao == 10) {
								System.out.println("Você Recomendou Este Filme para Lucas Pinho.");
							} else if (recomendacao == 11) {
								System.out.println("Você Recomendou Este Filme para Louise Pinho.");
							} else if (recomendacao == 12) {
								System.out.println("Você Recomendou Este Filme para Tainah Lima.");
							} else if (recomendacao == 13) {
								System.out.println("Você Recomendou Este Filme para Daniel Ruiz.");
							} else if (recomendacao == 14) {
								System.out.println("Você Recomendou Este Filme para Patricia Seguro.");
							}
							
						} else if (avaliacao == 2) {
							contDescurtir++;
							System.out.println("Que Pena Que Não Gostou. =(");
						}					
	
						if(day == 1) {						
							System.out.println("\nGostaria de sugerir algum filme para que coloquemos em nosso catálogo? \n\n1. Sim \n2. Nâo");
							catalogo = sc.nextInt();
							
							if (catalogo == 1) {
								System.out.println("\nQual o filme que gostaria de sugerir?");
								sc.nextLine();
								String sugestao = sc.nextLine();
								System.out.println("\nAgradecemos a sugestão! \n");
							} else if (catalogo == 2) {
								System.out.println("\nAté a próxima! \n");
							}
						} else {
							System.out.println("Sugestões de filmes somente no primeiro dia do mês.");
						}
					}
				
				}
				
				break;
				
			case 3:
				System.out.println("Bem-Vindo Priscila Seguro, Tudo Bem?");

				Random rdpp = new Random();
				int inadimplenciaPriscilaPinho = rdpp.nextInt(2);
				
				if(inadimplenciaPriscilaPinho == 0) {
					System.out.println("\nVerificamos que seu pagamento ainda não consta em nosso sistema. Por gentileza, regularize seu pagamento para que possa ter novamente acesso a sua conta. Obrigado.\n");
				
				} else {						
				
					System.out.println("\nDigite: \n\n1. Informações do Usuário. \n2. Escolha um Filme.");
					escolha = sc.nextInt();
								
					if (escolha == 1) {
						Usuarios usuario3 = new Usuarios("Priscila Seguro", "131.111.111-11", "Avenida ABC, 123", "priscila.seguro@usuario.com.br", Pagamento.PIX);
						usuario3.apresentaUsuario();
						long idade3 = usuario3.idade(1991, 9, 17);
						System.out.println("Idade: " + idade3 + "\n\n");
						
					} else if (escolha == 2) {
						System.out.println("Digite: \n\n1. Star Wars: Episódio I - A Ameaça Fantasma. \n2. Como Se Fosse a Primeira Vez. \n3. Jumanji: Bem-vindo à Selva. \n4. Duro de Matar. \n5. O Destino de Uma Nação. \n6. Jobs.");
						int filme = sc.nextInt();
						
						if (filme == 1) {
							Filmes filme1 = new Filmes("Star Wars: Episódio I - A Ameaça Fantasma", 
													   "Obi-Wan e seu mentor embarcam em uma perigosa aventura na tentativa de salvar o planeta das garras de Darth Sidious. Durante a viagem, eles conhecem um habilidoso menino e decidem treiná-lo para se tornar um Jedi. Mas o tempo irá revelar que as coisas nem sempre são o que aparentam ser.",
													   GeneroFilme.FICCAO_CIENTIFICA,
													   "2h16min",
													   "Liam Neeson, Ewan McGregor, Natalie Portman, Jake Lloyd, Ian McDiarmid, Ray Park, Anthony Daniels, Kenny Baker, Pernilla August, Frank Oz",
													   "George Lucas",
													   "LucasFilm Ltd.",
													   "24 de Junho de 1999");
							filme1.apresentaFilme();
							ficcaoCientifica++;
																	
						} else if (filme == 2) {
							Filmes filme2 = new Filmes("Como Se Fosse a Primeira Vez", 
													   "Henry Roth é um veterinário paquerador, que vive no Havaí, e famoso pelo grande número de turistas que conquista. Seu novo alvo é Lucy Whitmore, que mora no local e por quem Henry se apaixona perdidamente. Mas Lucy sofre de falta de memória de curto prazo e, por isso, ela rapidamente se esquece de fatos que acabaram de acontecer. Assim, Henry é obrigado a conquistá-la, dia após dia, para ficar ao seu lado.",
													   GeneroFilme.COMEDIA_ROMANTICA,
													   "1h39min",
													   "Adam Sandler, Drew Barrymore, Rob Schneider, Sean Astin, Lusia Strus, Blake Clark, Dan Aykroyd",
													   "Peter Segal",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");
							filme2.apresentaFilme();
							comediaRomantica++;
																			
						} else if (filme == 3) {
							Filmes filme3 = new Filmes("Jumanji: Bem-vindo à Selva", 
													   "Quatro adolescentes encontram um videogame cuja ação se passa em uma floresta tropical. Empolgados com o jogo, eles escolhem seus avatares para o desafio, mas um evento inesperado faz com que eles sejam transportados para dentro do universo fictício, transformando-os nos personagens da aventura.",
													   GeneroFilme.AVENTURA,
													   "1h59min",
													   "Dwayne Johnson, Kevin Hart, Jack Black, Karen Gillan, Nick Jonas",
													   "Jake Kasdan",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");		
							filme3.apresentaFilme();
							aventura++;
													
						} else if (filme == 4) {
							Filmes filme4 = new Filmes("Duro de Matar", 
													   "O policial de Nova York John McClane está visitando sua família no Natal. Ele participa de uma confraternização de fim de ano na sede da empresa japonesa em que a esposa trabalha. A festa é interrompida por terroristas que invadem o edifício de luxo. McClane não demora a perceber que não há ninguém para salvá-los, a não ser ele próprio.",
													   GeneroFilme.ACAO,
													   "2h12min",
													   "Bruce Willis, Alan Rickman, Bonnie Bedelia, Reginald VelJohnson",
													   "John McTiernan",
													   "20th Century Studios",
													   "22 de Dezembro de 1988");		
							filme4.apresentaFilme();						
							acao++;
													
						} else if (filme == 5) {
							Filmes filme5 = new Filmes("O Destino de Uma Nação", 
													   "Winston Churchill está prestes a encarar um de seus maiores desafios: tomar posse do cargo de primeiro-ministro da Grã-Bretanha. Enquanto isso, ele costura um tratado de paz com a Alemanha nazista que pode significar o fim de anos de conflito.",
													   GeneroFilme.ACAO,
													   "2h05min",
													   "Gary Oldman, Ben Mendelsohn, Kristin Scott Thomas, Lily James, Stephen Dillane, Ronald Pickup",
													   "Joe Wright",
													   "Working Title Films",
													   "11 de Janeiro de 2018");		
							filme5.apresentaFilme();								
							guerra++;
													
						} else if (filme == 6) {
							Filmes filme6 = new Filmes("Jobs", 
													   "Em 1976, Steve Jobs abandonou a faculdade e junto com seu amigo, o gênio da tecnologia Steve Wozniak, iniciaram uma revolução nos computadores com a invenção do Apple 1, o primeiro computador pessoal. Construído na garagem dos pais de Jobs, o Apple 1 e a formação da empresa Apple mudaram o mundo para sempre. Steve Jobs não se incomodava em passar por cima dos outros para atingir suas metas, o que fez com que tivesse dificuldades em manter relações amorosas e de amizade.",
													   GeneroFilme.DRAMA,
													   "2h09min",
													   "Ashton Kutcher, Dermot Mulroney, Josh Gad, Lukas Haas, J.K. Simmons, Lesley Ann Warren, Ron Eldard, Ahna O'Reilly, John Getz, James Woods, Matthew Modine",
													   "Joshua Michael Stern",
													   "The Five Star Institute",
													   "1 de Novembro de 2013");		
							filme6.apresentaFilme();						
							drama++;
													
						}
						
						System.out.println("\nGostou do Filme? \n\nDigite: \n\n1. Curti o Filme. \n2. Não Curti o Filme.");
						int avaliacao = sc.nextInt();
						
						if (avaliacao == 1) {
							contCurtir++;
							System.out.println("Que Bom Que Curtiu! =) \n\nVocê Recomenda Este Filme Para Algum Usuário? \n\n1. Renan Pinho. \n2. Eric Pinho. \n3. Stephanie Facre. \n4. Sonia Mary. \n5. Jose Ricardo. \n6. Wilma Therezinha. \n7. Vitor Rocha. \n8. Rodrigo Soutinho. \n9. Luis Fernando. \n10. Lucas Pinho. \n11. Louise Pinho. \n12. Tainah Lima. \n13. Daniel Ruiz. \n14. Patricia Seguro.");
							recomendacao = sc.nextInt();
							
							if (recomendacao == 1) {
								System.out.println("Você Recomendou Este Filme para Renan Pinho.");
							} else if (recomendacao == 2) {
								System.out.println("Você Recomendou Este Filme para Eric Pinho.");
							} else if (recomendacao == 3) {
								System.out.println("Você Recomendou Este Filme para Stephanie Facre.");
							} else if (recomendacao == 4) {
								System.out.println("Você Recomendou Este Filme para Sonia Mary.");
							} else if (recomendacao == 5) {
								System.out.println("Você Recomendou Este Filme para José Ricardo.");
							} else if (recomendacao == 6) {
								System.out.println("Você Recomendou Este Filme para Wilma Therezinha.");
							} else if (recomendacao == 7) {
								System.out.println("Você Recomendou Este Filme para Vitor Rocha.");
							} else if (recomendacao == 8) {
								System.out.println("Você Recomendou Este Filme para Rodrigo Soutinho.");
							} else if (recomendacao == 9) {
								System.out.println("Você Recomendou Este Filme para Luis Fernando.");
							} else if (recomendacao == 10) {
								System.out.println("Você Recomendou Este Filme para Lucas Pinho.");
							} else if (recomendacao == 11) {
								System.out.println("Você Recomendou Este Filme para Louise Pinho.");
							} else if (recomendacao == 12) {
								System.out.println("Você Recomendou Este Filme para Tainah Lima.");
							} else if (recomendacao == 13) {
								System.out.println("Você Recomendou Este Filme para Daniel Ruiz.");
							} else if (recomendacao == 14) {
								System.out.println("Você Recomendou Este Filme para Patricia Seguro.");
							}
							
						} else if (avaliacao == 2) {
							contDescurtir++;
							System.out.println("Que Pena Que Não Gostou. =(");
						}					
	
						if(day == 1) {						
							System.out.println("\nGostaria de sugerir algum filme para que coloquemos em nosso catálogo? \n\n1. Sim \n2. Nâo");
							catalogo = sc.nextInt();
							
							if (catalogo == 1) {
								System.out.println("\nQual o filme que gostaria de sugerir?");
								sc.nextLine();
								String sugestao = sc.nextLine();
								System.out.println("\nAgradecemos a sugestão! \n");
							} else if (catalogo == 2) {
								System.out.println("\nAté a próxima! \n");
							}
						} else {
							System.out.println("Sugestões de filmes somente no primeiro dia do mês.");
						}
					}
				
				}	
					
				break;
				
			case 4:
				System.out.println("Bem-Vindo Stephanie Facre, Tudo Bem?");

				Random rdsf = new Random();
				int inadimplenciaStephanieFacre = rdsf.nextInt(2);
				
				if(inadimplenciaStephanieFacre == 0) {
					System.out.println("\nVerificamos que seu pagamento ainda não consta em nosso sistema. Por gentileza, regularize seu pagamento para que possa ter novamente acesso a sua conta. Obrigado.\n");
				
				} else {						
				
					System.out.println("\nDigite: \n\n1. Informações do Usuário. \n2. Escolha um Filme.");
					escolha = sc.nextInt();
								
					if (escolha == 1) {
						Usuarios usuario4 = new Usuarios("Stephanie Facre", "141.111.111-11", "Avenida ABC, 120", "stephania.facre@usuario.com.br", Pagamento.CREDITO);
						usuario4.apresentaUsuario();
						long idade4 = usuario4.idade(1993, 5, 15);
						System.out.println("Idade: " + idade4 + "\n\n");
						
					} else if (escolha == 2) {
						System.out.println("Digite: \n\n1. Star Wars: Episódio I - A Ameaça Fantasma. \n2. Como Se Fosse a Primeira Vez. \n3. Jumanji: Bem-vindo à Selva. \n4. Duro de Matar. \n5. O Destino de Uma Nação. \n6. Jobs.");
						int filme = sc.nextInt();
						
						if (filme == 1) {
							Filmes filme1 = new Filmes("Star Wars: Episódio I - A Ameaça Fantasma", 
													   "Obi-Wan e seu mentor embarcam em uma perigosa aventura na tentativa de salvar o planeta das garras de Darth Sidious. Durante a viagem, eles conhecem um habilidoso menino e decidem treiná-lo para se tornar um Jedi. Mas o tempo irá revelar que as coisas nem sempre são o que aparentam ser.",
													   GeneroFilme.FICCAO_CIENTIFICA,
													   "2h16min",
													   "Liam Neeson, Ewan McGregor, Natalie Portman, Jake Lloyd, Ian McDiarmid, Ray Park, Anthony Daniels, Kenny Baker, Pernilla August, Frank Oz",
													   "George Lucas",
													   "LucasFilm Ltd.",
													   "24 de Junho de 1999");
							filme1.apresentaFilme();
							ficcaoCientifica++;
																	
						} else if (filme == 2) {
							Filmes filme2 = new Filmes("Como Se Fosse a Primeira Vez", 
													   "Henry Roth é um veterinário paquerador, que vive no Havaí, e famoso pelo grande número de turistas que conquista. Seu novo alvo é Lucy Whitmore, que mora no local e por quem Henry se apaixona perdidamente. Mas Lucy sofre de falta de memória de curto prazo e, por isso, ela rapidamente se esquece de fatos que acabaram de acontecer. Assim, Henry é obrigado a conquistá-la, dia após dia, para ficar ao seu lado.",
													   GeneroFilme.COMEDIA_ROMANTICA,
													   "1h39min",
													   "Adam Sandler, Drew Barrymore, Rob Schneider, Sean Astin, Lusia Strus, Blake Clark, Dan Aykroyd",
													   "Peter Segal",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");
							filme2.apresentaFilme();
							comediaRomantica++;
																			
						} else if (filme == 3) {
							Filmes filme3 = new Filmes("Jumanji: Bem-vindo à Selva", 
													   "Quatro adolescentes encontram um videogame cuja ação se passa em uma floresta tropical. Empolgados com o jogo, eles escolhem seus avatares para o desafio, mas um evento inesperado faz com que eles sejam transportados para dentro do universo fictício, transformando-os nos personagens da aventura.",
													   GeneroFilme.AVENTURA,
													   "1h59min",
													   "Dwayne Johnson, Kevin Hart, Jack Black, Karen Gillan, Nick Jonas",
													   "Jake Kasdan",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");		
							filme3.apresentaFilme();
							aventura++;
													
						} else if (filme == 4) {
							Filmes filme4 = new Filmes("Duro de Matar", 
													   "O policial de Nova York John McClane está visitando sua família no Natal. Ele participa de uma confraternização de fim de ano na sede da empresa japonesa em que a esposa trabalha. A festa é interrompida por terroristas que invadem o edifício de luxo. McClane não demora a perceber que não há ninguém para salvá-los, a não ser ele próprio.",
													   GeneroFilme.ACAO,
													   "2h12min",
													   "Bruce Willis, Alan Rickman, Bonnie Bedelia, Reginald VelJohnson",
													   "John McTiernan",
													   "20th Century Studios",
													   "22 de Dezembro de 1988");		
							filme4.apresentaFilme();						
							acao++;
													
						} else if (filme == 5) {
							Filmes filme5 = new Filmes("O Destino de Uma Nação", 
													   "Winston Churchill está prestes a encarar um de seus maiores desafios: tomar posse do cargo de primeiro-ministro da Grã-Bretanha. Enquanto isso, ele costura um tratado de paz com a Alemanha nazista que pode significar o fim de anos de conflito.",
													   GeneroFilme.ACAO,
													   "2h05min",
													   "Gary Oldman, Ben Mendelsohn, Kristin Scott Thomas, Lily James, Stephen Dillane, Ronald Pickup",
													   "Joe Wright",
													   "Working Title Films",
													   "11 de Janeiro de 2018");		
							filme5.apresentaFilme();								
							guerra++;
													
						} else if (filme == 6) {
							Filmes filme6 = new Filmes("Jobs", 
													   "Em 1976, Steve Jobs abandonou a faculdade e junto com seu amigo, o gênio da tecnologia Steve Wozniak, iniciaram uma revolução nos computadores com a invenção do Apple 1, o primeiro computador pessoal. Construído na garagem dos pais de Jobs, o Apple 1 e a formação da empresa Apple mudaram o mundo para sempre. Steve Jobs não se incomodava em passar por cima dos outros para atingir suas metas, o que fez com que tivesse dificuldades em manter relações amorosas e de amizade.",
													   GeneroFilme.DRAMA,
													   "2h09min",
													   "Ashton Kutcher, Dermot Mulroney, Josh Gad, Lukas Haas, J.K. Simmons, Lesley Ann Warren, Ron Eldard, Ahna O'Reilly, John Getz, James Woods, Matthew Modine",
													   "Joshua Michael Stern",
													   "The Five Star Institute",
													   "1 de Novembro de 2013");		
							filme6.apresentaFilme();						
							drama++;
													
						}
						
						System.out.println("\nGostou do Filme? \n\nDigite: \n\n1. Curti o Filme. \n2. Não Curti o Filme.");
						int avaliacao = sc.nextInt();
						
						if (avaliacao == 1) {
							contCurtir++;
							System.out.println("Que Bom Que Curtiu! =) \n\nVocê Recomenda Este Filme Para Algum Usuário? \n\n1. Renan Pinho. \n2. Priscila Seguro. \n3. Stephanie Facre \n4. Sonia Mary \n5. Jose Ricardo \n6. Wilma Therezinha \n7. Vitor Rocha \n8. Rodrigo Soutinho \n9. Luis Fernando \n10. Lucas Pinho \n11. Louise Pinho \n12. Tainah Lima \n13. Daniel Ruiz \n14. Patricia Seguro");
							recomendacao = sc.nextInt();
							
							if (recomendacao == 1) {
								System.out.println("Você Recomendou Este Filme para Renan Pinho.");
							} else if (recomendacao == 2) {
								System.out.println("Você Recomendou Este Filme para Eric Pinho.");
							} else if (recomendacao == 3) {
								System.out.println("Você Recomendou Este Filme para Priscila Seguro.");
							} else if (recomendacao == 4) {
								System.out.println("Você Recomendou Este Filme para Sonia Mary.");
							} else if (recomendacao == 5) {
								System.out.println("Você Recomendou Este Filme para José Ricardo.");
							} else if (recomendacao == 6) {
								System.out.println("Você Recomendou Este Filme para Wilma Therezinha.");
							} else if (recomendacao == 7) {
								System.out.println("Você Recomendou Este Filme para Vitor Rocha.");
							} else if (recomendacao == 8) {
								System.out.println("Você Recomendou Este Filme para Rodrigo Soutinho.");
							} else if (recomendacao == 9) {
								System.out.println("Você Recomendou Este Filme para Luis Fernando.");
							} else if (recomendacao == 10) {
								System.out.println("Você Recomendou Este Filme para Lucas Pinho.");
							} else if (recomendacao == 11) {
								System.out.println("Você Recomendou Este Filme para Louise Pinho.");
							} else if (recomendacao == 12) {
								System.out.println("Você Recomendou Este Filme para Tainah Lima.");
							} else if (recomendacao == 13) {
								System.out.println("Você Recomendou Este Filme para Daniel Ruiz.");
							} else if (recomendacao == 14) {
								System.out.println("Você Recomendou Este Filme para Patricia Seguro.");
							}
							
						} else if (avaliacao == 2) {
							contDescurtir++;
							System.out.println("Que Pena Que Não Gostou. =(");
						}					
	
						if(day == 1) {						
							System.out.println("\nGostaria de sugerir algum filme para que coloquemos em nosso catálogo? \n\n1. Sim \n2. Nâo");
							catalogo = sc.nextInt();
							
							if (catalogo == 1) {
								System.out.println("\nQual o filme que gostaria de sugerir?");
								sc.nextLine();
								String sugestao = sc.nextLine();
								System.out.println("\nAgradecemos a sugestão! \n");
							} else if (catalogo == 2) {
								System.out.println("\nAté a próxima! \n");
							}
						} else {
							System.out.println("Sugestões de filmes somente no primeiro dia do mês.");
						}
					}
					
				}
				
				break;
				
			case 5:
				System.out.println("Bem-Vindo Sonia Mary, Tudo Bem?");

				Random rdsm = new Random();
				int inadimplenciaSoniaMary = rdsm.nextInt(2);
				
				if(inadimplenciaSoniaMary == 0) {
					System.out.println("\nVerificamos que seu pagamento ainda não consta em nosso sistema. Por gentileza, regularize seu pagamento para que possa ter novamente acesso a sua conta. Obrigado.\n");
				
				} else {						
				
					System.out.println("\nDigite: \n\n1. Informações do Usuário. \n2. Escolha um Filme.");
					escolha = sc.nextInt();
									
					if (escolha == 1) {
						Usuarios usuario5 = new Usuarios("Sonia Mary", "151.111.111-11", "Avenida ABC, 119", "stephania.facre@usuario.com.br", Pagamento.CREDITO);
						usuario5.apresentaUsuario();
						long idade5 = usuario5.idade(1969, 10, 10);
						System.out.println("Idade: " + idade5 + "\n\n");
						
					} else if (escolha == 2) {
						System.out.println("Digite: \n\n1. Star Wars: Episódio I - A Ameaça Fantasma. \n2. Como Se Fosse a Primeira Vez. \n3. Jumanji: Bem-vindo à Selva. \n4. Duro de Matar. \n5. O Destino de Uma Nação. \n6. Jobs.");
						int filme = sc.nextInt();
						
						if (filme == 1) {
							Filmes filme1 = new Filmes("Star Wars: Episódio I - A Ameaça Fantasma", 
													   "Obi-Wan e seu mentor embarcam em uma perigosa aventura na tentativa de salvar o planeta das garras de Darth Sidious. Durante a viagem, eles conhecem um habilidoso menino e decidem treiná-lo para se tornar um Jedi. Mas o tempo irá revelar que as coisas nem sempre são o que aparentam ser.",
													   GeneroFilme.FICCAO_CIENTIFICA,
													   "2h16min",
													   "Liam Neeson, Ewan McGregor, Natalie Portman, Jake Lloyd, Ian McDiarmid, Ray Park, Anthony Daniels, Kenny Baker, Pernilla August, Frank Oz",
													   "George Lucas",
													   "LucasFilm Ltd.",
													   "24 de Junho de 1999");
							filme1.apresentaFilme();
							ficcaoCientifica++;
																	
						} else if (filme == 2) {
							Filmes filme2 = new Filmes("Como Se Fosse a Primeira Vez", 
													   "Henry Roth é um veterinário paquerador, que vive no Havaí, e famoso pelo grande número de turistas que conquista. Seu novo alvo é Lucy Whitmore, que mora no local e por quem Henry se apaixona perdidamente. Mas Lucy sofre de falta de memória de curto prazo e, por isso, ela rapidamente se esquece de fatos que acabaram de acontecer. Assim, Henry é obrigado a conquistá-la, dia após dia, para ficar ao seu lado.",
													   GeneroFilme.COMEDIA_ROMANTICA,
													   "1h39min",
													   "Adam Sandler, Drew Barrymore, Rob Schneider, Sean Astin, Lusia Strus, Blake Clark, Dan Aykroyd",
													   "Peter Segal",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");
							filme2.apresentaFilme();
							comediaRomantica++;
																			
						} else if (filme == 3) {
							Filmes filme3 = new Filmes("Jumanji: Bem-vindo à Selva", 
													   "Quatro adolescentes encontram um videogame cuja ação se passa em uma floresta tropical. Empolgados com o jogo, eles escolhem seus avatares para o desafio, mas um evento inesperado faz com que eles sejam transportados para dentro do universo fictício, transformando-os nos personagens da aventura.",
													   GeneroFilme.AVENTURA,
													   "1h59min",
													   "Dwayne Johnson, Kevin Hart, Jack Black, Karen Gillan, Nick Jonas",
													   "Jake Kasdan",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");		
							filme3.apresentaFilme();
							aventura++;
													
						} else if (filme == 4) {
							Filmes filme4 = new Filmes("Duro de Matar", 
													   "O policial de Nova York John McClane está visitando sua família no Natal. Ele participa de uma confraternização de fim de ano na sede da empresa japonesa em que a esposa trabalha. A festa é interrompida por terroristas que invadem o edifício de luxo. McClane não demora a perceber que não há ninguém para salvá-los, a não ser ele próprio.",
													   GeneroFilme.ACAO,
													   "2h12min",
													   "Bruce Willis, Alan Rickman, Bonnie Bedelia, Reginald VelJohnson",
													   "John McTiernan",
													   "20th Century Studios",
													   "22 de Dezembro de 1988");		
							filme4.apresentaFilme();						
							acao++;
													
						} else if (filme == 5) {
							Filmes filme5 = new Filmes("O Destino de Uma Nação", 
													   "Winston Churchill está prestes a encarar um de seus maiores desafios: tomar posse do cargo de primeiro-ministro da Grã-Bretanha. Enquanto isso, ele costura um tratado de paz com a Alemanha nazista que pode significar o fim de anos de conflito.",
													   GeneroFilme.ACAO,
													   "2h05min",
													   "Gary Oldman, Ben Mendelsohn, Kristin Scott Thomas, Lily James, Stephen Dillane, Ronald Pickup",
													   "Joe Wright",
													   "Working Title Films",
													   "11 de Janeiro de 2018");		
							filme5.apresentaFilme();								
							guerra++;
													
						} else if (filme == 6) {
							Filmes filme6 = new Filmes("Jobs", 
													   "Em 1976, Steve Jobs abandonou a faculdade e junto com seu amigo, o gênio da tecnologia Steve Wozniak, iniciaram uma revolução nos computadores com a invenção do Apple 1, o primeiro computador pessoal. Construído na garagem dos pais de Jobs, o Apple 1 e a formação da empresa Apple mudaram o mundo para sempre. Steve Jobs não se incomodava em passar por cima dos outros para atingir suas metas, o que fez com que tivesse dificuldades em manter relações amorosas e de amizade.",
													   GeneroFilme.DRAMA,
													   "2h09min",
													   "Ashton Kutcher, Dermot Mulroney, Josh Gad, Lukas Haas, J.K. Simmons, Lesley Ann Warren, Ron Eldard, Ahna O'Reilly, John Getz, James Woods, Matthew Modine",
													   "Joshua Michael Stern",
													   "The Five Star Institute",
													   "1 de Novembro de 2013");		
							filme6.apresentaFilme();						
							drama++;
													
						}
						
						System.out.println("\nGostou do Filme? \n\nDigite: \n\n1. Curti o Filme. \n2. Não Curti o Filme.");
						int avaliacao = sc.nextInt();
						
						if (avaliacao == 1) {
							contCurtir++;
							System.out.println("Que Bom Que Curtiu! =) \n\nVocê Recomenda Este Filme Para Algum Usuário? \n\n1. Renan Pinho. \n2. Eric Pinho. \n3. Priscila Seguro. \n4. Stephanie Facre. \n5. Jose Ricardo. \n6. Wilma Therezinha. \n7. Vitor Rocha. \n8. Rodrigo Soutinho. \n9. Luis Fernando. \n10. Lucas Pinho. \n11. Louise Pinho. \n12. Tainah Lima. \n13. Daniel Ruiz. \n14. Patricia Seguro.");
							recomendacao = sc.nextInt();
							
							if (recomendacao == 1) {
								System.out.println("Você Recomendou Este Filme para Renan Pinho.");
							} else if (recomendacao == 2) {
								System.out.println("Você Recomendou Este Filme para Eric Pinho.");
							} else if (recomendacao == 3) {
								System.out.println("Você Recomendou Este Filme para Priscila Seguro.");
							} else if (recomendacao == 4) {
								System.out.println("Você Recomendou Este Filme para Stephanie Facre.");
							} else if (recomendacao == 5) {
								System.out.println("Você Recomendou Este Filme para José Ricardo.");
							} else if (recomendacao == 6) {
								System.out.println("Você Recomendou Este Filme para Wilma Therezinha.");
							} else if (recomendacao == 7) {
								System.out.println("Você Recomendou Este Filme para Vitor Rocha.");
							} else if (recomendacao == 8) {
								System.out.println("Você Recomendou Este Filme para Rodrigo Soutinho.");
							} else if (recomendacao == 9) {
								System.out.println("Você Recomendou Este Filme para Luis Fernando.");
							} else if (recomendacao == 10) {
								System.out.println("Você Recomendou Este Filme para Lucas Pinho.");
							} else if (recomendacao == 11) {
								System.out.println("Você Recomendou Este Filme para Louise Pinho.");
							} else if (recomendacao == 12) {
								System.out.println("Você Recomendou Este Filme para Tainah Lima.");
							} else if (recomendacao == 13) {
								System.out.println("Você Recomendou Este Filme para Daniel Ruiz.");
							} else if (recomendacao == 14) {
								System.out.println("Você Recomendou Este Filme para Patricia Seguro.");
							}
							
						} else if (avaliacao == 2) {
							contDescurtir++;
							System.out.println("Que Pena Que Não Gostou. =(");
						}					
	
						if(day == 1) {						
							System.out.println("\nGostaria de sugerir algum filme para que coloquemos em nosso catálogo? \n\n1. Sim \n2. Nâo");
							catalogo = sc.nextInt();
							
							if (catalogo == 1) {
								System.out.println("\nQual o filme que gostaria de sugerir?");
								sc.nextLine();
								String sugestao = sc.nextLine();
								System.out.println("\nAgradecemos a sugestão! \n");
							} else if (catalogo == 2) {
								System.out.println("\nAté a próxima! \n");
							}
						} else {
							System.out.println("Sugestões de filmes somente no primeiro dia do mês.");
						}
					}
					
				}
				
				break;
				
			case 6:
				System.out.println("Bem-Vindo José Ricardo, Tudo Bem?");

				Random rdjr = new Random();
				int inadimplenciaJoseRicardo = rdjr.nextInt(2);
				
				if(inadimplenciaJoseRicardo == 0) {
					System.out.println("\nVerificamos que seu pagamento ainda não consta em nosso sistema. Por gentileza, regularize seu pagamento para que possa ter novamente acesso a sua conta. Obrigado.\n");
				
				} else {						
				
					System.out.println("\nDigite: \n\n1. Informações do Usuário. \n2. Escolha um Filme.");
					escolha = sc.nextInt();
									
					if (escolha == 1) {
						Usuarios usuario6 = new Usuarios("José Ricardo", "161.111.111-11", "Avenida ABC, 118", "jose.ricardo@usuario.com.br", Pagamento.PIX);
						usuario6.apresentaUsuario();
						long idade6 = usuario6.idade(1996, 4, 20);
						System.out.println("Idade: " + idade6 + "\n\n");
						
					} else if (escolha == 2) {
						System.out.println("Digite: \n\n1. Star Wars: Episódio I - A Ameaça Fantasma. \n2. Como Se Fosse a Primeira Vez. \n3. Jumanji: Bem-vindo à Selva. \n4. Duro de Matar. \n5. O Destino de Uma Nação. \n6. Jobs.");
						int filme = sc.nextInt();
						
						if (filme == 1) {
							Filmes filme1 = new Filmes("Star Wars: Episódio I - A Ameaça Fantasma", 
													   "Obi-Wan e seu mentor embarcam em uma perigosa aventura na tentativa de salvar o planeta das garras de Darth Sidious. Durante a viagem, eles conhecem um habilidoso menino e decidem treiná-lo para se tornar um Jedi. Mas o tempo irá revelar que as coisas nem sempre são o que aparentam ser.",
													   GeneroFilme.FICCAO_CIENTIFICA,
													   "2h16min",
													   "Liam Neeson, Ewan McGregor, Natalie Portman, Jake Lloyd, Ian McDiarmid, Ray Park, Anthony Daniels, Kenny Baker, Pernilla August, Frank Oz",
													   "George Lucas",
													   "LucasFilm Ltd.",
													   "24 de Junho de 1999");
							filme1.apresentaFilme();
							ficcaoCientifica++;
																	
						} else if (filme == 2) {
							Filmes filme2 = new Filmes("Como Se Fosse a Primeira Vez", 
													   "Henry Roth é um veterinário paquerador, que vive no Havaí, e famoso pelo grande número de turistas que conquista. Seu novo alvo é Lucy Whitmore, que mora no local e por quem Henry se apaixona perdidamente. Mas Lucy sofre de falta de memória de curto prazo e, por isso, ela rapidamente se esquece de fatos que acabaram de acontecer. Assim, Henry é obrigado a conquistá-la, dia após dia, para ficar ao seu lado.",
													   GeneroFilme.COMEDIA_ROMANTICA,
													   "1h39min",
													   "Adam Sandler, Drew Barrymore, Rob Schneider, Sean Astin, Lusia Strus, Blake Clark, Dan Aykroyd",
													   "Peter Segal",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");
							filme2.apresentaFilme();
							comediaRomantica++;
																			
						} else if (filme == 3) {
							Filmes filme3 = new Filmes("Jumanji: Bem-vindo à Selva", 
													   "Quatro adolescentes encontram um videogame cuja ação se passa em uma floresta tropical. Empolgados com o jogo, eles escolhem seus avatares para o desafio, mas um evento inesperado faz com que eles sejam transportados para dentro do universo fictício, transformando-os nos personagens da aventura.",
													   GeneroFilme.AVENTURA,
													   "1h59min",
													   "Dwayne Johnson, Kevin Hart, Jack Black, Karen Gillan, Nick Jonas",
													   "Jake Kasdan",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");		
							filme3.apresentaFilme();
							aventura++;
													
						} else if (filme == 4) {
							Filmes filme4 = new Filmes("Duro de Matar", 
													   "O policial de Nova York John McClane está visitando sua família no Natal. Ele participa de uma confraternização de fim de ano na sede da empresa japonesa em que a esposa trabalha. A festa é interrompida por terroristas que invadem o edifício de luxo. McClane não demora a perceber que não há ninguém para salvá-los, a não ser ele próprio.",
													   GeneroFilme.ACAO,
													   "2h12min",
													   "Bruce Willis, Alan Rickman, Bonnie Bedelia, Reginald VelJohnson",
													   "John McTiernan",
													   "20th Century Studios",
													   "22 de Dezembro de 1988");		
							filme4.apresentaFilme();						
							acao++;
													
						} else if (filme == 5) {
							Filmes filme5 = new Filmes("O Destino de Uma Nação", 
													   "Winston Churchill está prestes a encarar um de seus maiores desafios: tomar posse do cargo de primeiro-ministro da Grã-Bretanha. Enquanto isso, ele costura um tratado de paz com a Alemanha nazista que pode significar o fim de anos de conflito.",
													   GeneroFilme.ACAO,
													   "2h05min",
													   "Gary Oldman, Ben Mendelsohn, Kristin Scott Thomas, Lily James, Stephen Dillane, Ronald Pickup",
													   "Joe Wright",
													   "Working Title Films",
													   "11 de Janeiro de 2018");		
							filme5.apresentaFilme();								
							guerra++;
													
						} else if (filme == 6) {
							Filmes filme6 = new Filmes("Jobs", 
													   "Em 1976, Steve Jobs abandonou a faculdade e junto com seu amigo, o gênio da tecnologia Steve Wozniak, iniciaram uma revolução nos computadores com a invenção do Apple 1, o primeiro computador pessoal. Construído na garagem dos pais de Jobs, o Apple 1 e a formação da empresa Apple mudaram o mundo para sempre. Steve Jobs não se incomodava em passar por cima dos outros para atingir suas metas, o que fez com que tivesse dificuldades em manter relações amorosas e de amizade.",
													   GeneroFilme.DRAMA,
													   "2h09min",
													   "Ashton Kutcher, Dermot Mulroney, Josh Gad, Lukas Haas, J.K. Simmons, Lesley Ann Warren, Ron Eldard, Ahna O'Reilly, John Getz, James Woods, Matthew Modine",
													   "Joshua Michael Stern",
													   "The Five Star Institute",
													   "1 de Novembro de 2013");		
							filme6.apresentaFilme();						
							drama++;
													
						}
						
						System.out.println("\nGostou do Filme? \n\nDigite: \n\n1. Curti o Filme. \n2. Não Curti o Filme.");
						int avaliacao = sc.nextInt();
						
						if (avaliacao == 1) {
							contCurtir++;
							System.out.println("Que Bom Que Curtiu! =) \n\nVocê Recomenda Este Filme Para Algum Usuário? \n\n1. Renan Pinho. \n2. Eric Pinho. \n3. Priscila Seguro. \n4. Stephanie Facre. \n5. Sonia Mary. \n6. Wilma Therezinha. \n7. Vitor Rocha. \n8. Rodrigo Soutinho. \n9. Luis Fernando. \n10. Lucas Pinho. \n11. Louise Pinho. \n12. Tainah Lima. \n13. Daniel Ruiz. \n14. Patricia Seguro.");
							recomendacao = sc.nextInt();
							
							if (recomendacao == 1) {
								System.out.println("Você Recomendou Este Filme para Renan Pinho.");
							} else if (recomendacao == 2) {
								System.out.println("Você Recomendou Este Filme para Eric Pinho.");
							} else if (recomendacao == 3) {
								System.out.println("Você Recomendou Este Filme para Priscila Seguro.");
							} else if (recomendacao == 4) {
								System.out.println("Você Recomendou Este Filme para Stephanie Facre.");
							} else if (recomendacao == 5) {
								System.out.println("Você Recomendou Este Filme para Sonia Mary.");
							} else if (recomendacao == 6) {
								System.out.println("Você Recomendou Este Filme para Wilma Therezinha.");
							} else if (recomendacao == 7) {
								System.out.println("Você Recomendou Este Filme para Vitor Rocha.");
							} else if (recomendacao == 8) {
								System.out.println("Você Recomendou Este Filme para Rodrigo Soutinho.");
							} else if (recomendacao == 9) {
								System.out.println("Você Recomendou Este Filme para Luis Fernando.");
							} else if (recomendacao == 10) {
								System.out.println("Você Recomendou Este Filme para Lucas Pinho.");
							} else if (recomendacao == 11) {
								System.out.println("Você Recomendou Este Filme para Louise Pinho.");
							} else if (recomendacao == 12) {
								System.out.println("Você Recomendou Este Filme para Tainah Lima.");
							} else if (recomendacao == 13) {
								System.out.println("Você Recomendou Este Filme para Daniel Ruiz.");
							} else if (recomendacao == 14) {
								System.out.println("Você Recomendou Este Filme para Patricia Seguro.");
							}
							
						} else if (avaliacao == 2) {
							contDescurtir++;
							System.out.println("Que Pena Que Não Gostou. =(");
						}					
						
						System.out.println("Gostaria de sugerir algum filme para que coloquemos em nosso catálogo?");
						catalogo = sc.nextInt();
	
						if(day == 1) {						
							System.out.println("\nGostaria de sugerir algum filme para que coloquemos em nosso catálogo? \n\n1. Sim \n2. Nâo");
							catalogo = sc.nextInt();
							
							if (catalogo == 1) {
								System.out.println("\nQual o filme que gostaria de sugerir?");
								sc.nextLine();
								String sugestao = sc.nextLine();
								System.out.println("\nAgradecemos a sugestão! \n");
							} else if (catalogo == 2) {
								System.out.println("\nAté a próxima! \n");
							}
						} else {
							System.out.println("Sugestões de filmes somente no primeiro dia do mês.");
						}
					}
					
				}
				
				break;
				
			case 7:
				System.out.println("Bem-Vindo Wilma Therezinha, Tudo Bem?");

				Random rdwt = new Random();
				int inadimplenciaWilmaTherezinha = rdwt.nextInt(2);
				
				if(inadimplenciaWilmaTherezinha == 0) {
					System.out.println("\nVerificamos que seu pagamento ainda não consta em nosso sistema. Por gentileza, regularize seu pagamento para que possa ter novamente acesso a sua conta. Obrigado.\n");
				
				} else {						
				
					System.out.println("\nDigite: \n\n1. Informações do Usuário. \n2. Escolha um Filme.");
					escolha = sc.nextInt();
									
					if (escolha == 1) {
						Usuarios usuario7 = new Usuarios("Wilma Therezinha", "171.111.111-11", "Avenida ABC, 118", "wilma.therezinha@usuario.com.br", Pagamento.DEBITO);
						usuario7.apresentaUsuario();
						long idade7 = usuario7.idade(1990, 1, 29);
						System.out.println("Idade: " + idade7 + "\n\n");
						
					} else if (escolha == 2) {
						System.out.println("Digite: \n\n1. Star Wars: Episódio I - A Ameaça Fantasma. \n2. Como Se Fosse a Primeira Vez. \n3. Jumanji: Bem-vindo à Selva. \n4. Duro de Matar. \n5. O Destino de Uma Nação. \n6. Jobs.");
						int filme = sc.nextInt();
						
						if (filme == 1) {
							Filmes filme1 = new Filmes("Star Wars: Episódio I - A Ameaça Fantasma", 
													   "Obi-Wan e seu mentor embarcam em uma perigosa aventura na tentativa de salvar o planeta das garras de Darth Sidious. Durante a viagem, eles conhecem um habilidoso menino e decidem treiná-lo para se tornar um Jedi. Mas o tempo irá revelar que as coisas nem sempre são o que aparentam ser.",
													   GeneroFilme.FICCAO_CIENTIFICA,
													   "2h16min",
													   "Liam Neeson, Ewan McGregor, Natalie Portman, Jake Lloyd, Ian McDiarmid, Ray Park, Anthony Daniels, Kenny Baker, Pernilla August, Frank Oz",
													   "George Lucas",
													   "LucasFilm Ltd.",
													   "24 de Junho de 1999");
							filme1.apresentaFilme();
							ficcaoCientifica++;
																	
						} else if (filme == 2) {
							Filmes filme2 = new Filmes("Como Se Fosse a Primeira Vez", 
													   "Henry Roth é um veterinário paquerador, que vive no Havaí, e famoso pelo grande número de turistas que conquista. Seu novo alvo é Lucy Whitmore, que mora no local e por quem Henry se apaixona perdidamente. Mas Lucy sofre de falta de memória de curto prazo e, por isso, ela rapidamente se esquece de fatos que acabaram de acontecer. Assim, Henry é obrigado a conquistá-la, dia após dia, para ficar ao seu lado.",
													   GeneroFilme.COMEDIA_ROMANTICA,
													   "1h39min",
													   "Adam Sandler, Drew Barrymore, Rob Schneider, Sean Astin, Lusia Strus, Blake Clark, Dan Aykroyd",
													   "Peter Segal",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");
							filme2.apresentaFilme();
							comediaRomantica++;
																			
						} else if (filme == 3) {
							Filmes filme3 = new Filmes("Jumanji: Bem-vindo à Selva", 
													   "Quatro adolescentes encontram um videogame cuja ação se passa em uma floresta tropical. Empolgados com o jogo, eles escolhem seus avatares para o desafio, mas um evento inesperado faz com que eles sejam transportados para dentro do universo fictício, transformando-os nos personagens da aventura.",
													   GeneroFilme.AVENTURA,
													   "1h59min",
													   "Dwayne Johnson, Kevin Hart, Jack Black, Karen Gillan, Nick Jonas",
													   "Jake Kasdan",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");		
							filme3.apresentaFilme();
							aventura++;
													
						} else if (filme == 4) {
							Filmes filme4 = new Filmes("Duro de Matar", 
													   "O policial de Nova York John McClane está visitando sua família no Natal. Ele participa de uma confraternização de fim de ano na sede da empresa japonesa em que a esposa trabalha. A festa é interrompida por terroristas que invadem o edifício de luxo. McClane não demora a perceber que não há ninguém para salvá-los, a não ser ele próprio.",
													   GeneroFilme.ACAO,
													   "2h12min",
													   "Bruce Willis, Alan Rickman, Bonnie Bedelia, Reginald VelJohnson",
													   "John McTiernan",
													   "20th Century Studios",
													   "22 de Dezembro de 1988");		
							filme4.apresentaFilme();						
							acao++;
													
						} else if (filme == 5) {
							Filmes filme5 = new Filmes("O Destino de Uma Nação", 
													   "Winston Churchill está prestes a encarar um de seus maiores desafios: tomar posse do cargo de primeiro-ministro da Grã-Bretanha. Enquanto isso, ele costura um tratado de paz com a Alemanha nazista que pode significar o fim de anos de conflito.",
													   GeneroFilme.ACAO,
													   "2h05min",
													   "Gary Oldman, Ben Mendelsohn, Kristin Scott Thomas, Lily James, Stephen Dillane, Ronald Pickup",
													   "Joe Wright",
													   "Working Title Films",
													   "11 de Janeiro de 2018");		
							filme5.apresentaFilme();								
							guerra++;
													
						} else if (filme == 6) {
							Filmes filme6 = new Filmes("Jobs", 
													   "Em 1976, Steve Jobs abandonou a faculdade e junto com seu amigo, o gênio da tecnologia Steve Wozniak, iniciaram uma revolução nos computadores com a invenção do Apple 1, o primeiro computador pessoal. Construído na garagem dos pais de Jobs, o Apple 1 e a formação da empresa Apple mudaram o mundo para sempre. Steve Jobs não se incomodava em passar por cima dos outros para atingir suas metas, o que fez com que tivesse dificuldades em manter relações amorosas e de amizade.",
													   GeneroFilme.DRAMA,
													   "2h09min",
													   "Ashton Kutcher, Dermot Mulroney, Josh Gad, Lukas Haas, J.K. Simmons, Lesley Ann Warren, Ron Eldard, Ahna O'Reilly, John Getz, James Woods, Matthew Modine",
													   "Joshua Michael Stern",
													   "The Five Star Institute",
													   "1 de Novembro de 2013");		
							filme6.apresentaFilme();						
							drama++;
													
						}
						
						System.out.println("\nGostou do Filme? \n\nDigite: \n\n1. Curti o Filme. \n2. Não Curti o Filme.");
						int avaliacao = sc.nextInt();
						
						if (avaliacao == 1) {
							contCurtir++;
							System.out.println("Que Bom Que Curtiu! =) \n\nVocê Recomenda Este Filme Para Algum Usuário? \n\n1. Renan Pinho. \n2. Eric Pinho. \n3. Priscila Seguro. \n4. Stephanie Facre. \n5. Sonia Mary. \n6. José Ricardo. \n7. Vitor Rocha. \n8. Rodrigo Soutinho. \n9. Luis Fernando. \n10. Lucas Pinho. \n11. Louise Pinho. \n12. Tainah Lima. \n13. Daniel Ruiz. \n14. Patricia Seguro.");
							recomendacao = sc.nextInt();
							
							if (recomendacao == 1) {
								System.out.println("Você Recomendou Este Filme para Renan Pinho.");
							} else if (recomendacao == 2) {
								System.out.println("Você Recomendou Este Filme para Eric Pinho.");
							} else if (recomendacao == 3) {
								System.out.println("Você Recomendou Este Filme para Priscila Seguro.");
							} else if (recomendacao == 4) {
								System.out.println("Você Recomendou Este Filme para Stephanie Facre.");
							} else if (recomendacao == 5) {
								System.out.println("Você Recomendou Este Filme para Sonia Mary.");
							} else if (recomendacao == 6) {
								System.out.println("Você Recomendou Este Filme para José Ricardo.");
							} else if (recomendacao == 7) {
								System.out.println("Você Recomendou Este Filme para Vitor Rocha.");
							} else if (recomendacao == 8) {
								System.out.println("Você Recomendou Este Filme para Rodrigo Soutinho.");
							} else if (recomendacao == 9) {
								System.out.println("Você Recomendou Este Filme para Luis Fernando.");
							} else if (recomendacao == 10) {
								System.out.println("Você Recomendou Este Filme para Lucas Pinho.");
							} else if (recomendacao == 11) {
								System.out.println("Você Recomendou Este Filme para Louise Pinho.");
							} else if (recomendacao == 12) {
								System.out.println("Você Recomendou Este Filme para Tainah Lima.");
							} else if (recomendacao == 13) {
								System.out.println("Você Recomendou Este Filme para Daniel Ruiz.");
							} else if (recomendacao == 14) {
								System.out.println("Você Recomendou Este Filme para Patricia Seguro.");
							}
							
						} else if (avaliacao == 2) {
							contDescurtir++;
							System.out.println("Que Pena Que Não Gostou. =(");
						}					
	
						if(day == 1) {						
							System.out.println("\nGostaria de sugerir algum filme para que coloquemos em nosso catálogo? \n\n1. Sim \n2. Nâo");
							catalogo = sc.nextInt();
							
							if (catalogo == 1) {
								System.out.println("\nQual o filme que gostaria de sugerir?");
								sc.nextLine();
								String sugestao = sc.nextLine();
								System.out.println("\nAgradecemos a sugestão! \n");
							} else if (catalogo == 2) {
								System.out.println("\nAté a próxima! \n");
							}
						} else {
							System.out.println("Sugestões de filmes somente no primeiro dia do mês.");
						}
					}
				
				}
					
				break;
				
			case 8:
				System.out.println("Bem-Vindo Vitor Rocha, Tudo Bem?");

				Random rdvr = new Random();
				int inadimplenciaVitorRocha = rdvr.nextInt(2);
				
				if(inadimplenciaVitorRocha == 0) {
					System.out.println("\nVerificamos que seu pagamento ainda não consta em nosso sistema. Por gentileza, regularize seu pagamento para que possa ter novamente acesso a sua conta. Obrigado.\n");
				
				} else {						
				
					System.out.println("\nDigite: \n\n1. Informações do Usuário. \n2. Escolha um Filme.");
					escolha = sc.nextInt();
								
					if (escolha == 1) {
						Usuarios usuario8 = new Usuarios("Vitor Rocha", "181.111.111-11", "Avenida ABC, 117", "vitor.rocha@usuario.com.br", Pagamento.DEBITO);
						usuario8.apresentaUsuario();
						long idade8 = usuario8.idade(2003, 9, 30);
						System.out.println("Idade: " + idade8 + "\n\n");
						
					} else if (escolha == 2) {
						System.out.println("Digite: \n\n1. Star Wars: Episódio I - A Ameaça Fantasma. \n2. Como Se Fosse a Primeira Vez. \n3. Jumanji: Bem-vindo à Selva. \n4. Duro de Matar. \n5. O Destino de Uma Nação. \n6. Jobs.");
						int filme = sc.nextInt();
						
						if (filme == 1) {
							Filmes filme1 = new Filmes("Star Wars: Episódio I - A Ameaça Fantasma", 
													   "Obi-Wan e seu mentor embarcam em uma perigosa aventura na tentativa de salvar o planeta das garras de Darth Sidious. Durante a viagem, eles conhecem um habilidoso menino e decidem treiná-lo para se tornar um Jedi. Mas o tempo irá revelar que as coisas nem sempre são o que aparentam ser.",
													   GeneroFilme.FICCAO_CIENTIFICA,
													   "2h16min",
													   "Liam Neeson, Ewan McGregor, Natalie Portman, Jake Lloyd, Ian McDiarmid, Ray Park, Anthony Daniels, Kenny Baker, Pernilla August, Frank Oz",
													   "George Lucas",
													   "LucasFilm Ltd.",
													   "24 de Junho de 1999");
							filme1.apresentaFilme();
							ficcaoCientifica++;
																	
						} else if (filme == 2) {
							Filmes filme2 = new Filmes("Como Se Fosse a Primeira Vez", 
													   "Henry Roth é um veterinário paquerador, que vive no Havaí, e famoso pelo grande número de turistas que conquista. Seu novo alvo é Lucy Whitmore, que mora no local e por quem Henry se apaixona perdidamente. Mas Lucy sofre de falta de memória de curto prazo e, por isso, ela rapidamente se esquece de fatos que acabaram de acontecer. Assim, Henry é obrigado a conquistá-la, dia após dia, para ficar ao seu lado.",
													   GeneroFilme.COMEDIA_ROMANTICA,
													   "1h39min",
													   "Adam Sandler, Drew Barrymore, Rob Schneider, Sean Astin, Lusia Strus, Blake Clark, Dan Aykroyd",
													   "Peter Segal",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");
							filme2.apresentaFilme();
							comediaRomantica++;
																			
						} else if (filme == 3) {
							Filmes filme3 = new Filmes("Jumanji: Bem-vindo à Selva", 
													   "Quatro adolescentes encontram um videogame cuja ação se passa em uma floresta tropical. Empolgados com o jogo, eles escolhem seus avatares para o desafio, mas um evento inesperado faz com que eles sejam transportados para dentro do universo fictício, transformando-os nos personagens da aventura.",
													   GeneroFilme.AVENTURA,
													   "1h59min",
													   "Dwayne Johnson, Kevin Hart, Jack Black, Karen Gillan, Nick Jonas",
													   "Jake Kasdan",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");		
							filme3.apresentaFilme();
							aventura++;
													
						} else if (filme == 4) {
							Filmes filme4 = new Filmes("Duro de Matar", 
													   "O policial de Nova York John McClane está visitando sua família no Natal. Ele participa de uma confraternização de fim de ano na sede da empresa japonesa em que a esposa trabalha. A festa é interrompida por terroristas que invadem o edifício de luxo. McClane não demora a perceber que não há ninguém para salvá-los, a não ser ele próprio.",
													   GeneroFilme.ACAO,
													   "2h12min",
													   "Bruce Willis, Alan Rickman, Bonnie Bedelia, Reginald VelJohnson",
													   "John McTiernan",
													   "20th Century Studios",
													   "22 de Dezembro de 1988");		
							filme4.apresentaFilme();						
							acao++;
													
						} else if (filme == 5) {
							Filmes filme5 = new Filmes("O Destino de Uma Nação", 
													   "Winston Churchill está prestes a encarar um de seus maiores desafios: tomar posse do cargo de primeiro-ministro da Grã-Bretanha. Enquanto isso, ele costura um tratado de paz com a Alemanha nazista que pode significar o fim de anos de conflito.",
													   GeneroFilme.ACAO,
													   "2h05min",
													   "Gary Oldman, Ben Mendelsohn, Kristin Scott Thomas, Lily James, Stephen Dillane, Ronald Pickup",
													   "Joe Wright",
													   "Working Title Films",
													   "11 de Janeiro de 2018");		
							filme5.apresentaFilme();								
							guerra++;
													
						} else if (filme == 6) {
							Filmes filme6 = new Filmes("Jobs", 
													   "Em 1976, Steve Jobs abandonou a faculdade e junto com seu amigo, o gênio da tecnologia Steve Wozniak, iniciaram uma revolução nos computadores com a invenção do Apple 1, o primeiro computador pessoal. Construído na garagem dos pais de Jobs, o Apple 1 e a formação da empresa Apple mudaram o mundo para sempre. Steve Jobs não se incomodava em passar por cima dos outros para atingir suas metas, o que fez com que tivesse dificuldades em manter relações amorosas e de amizade.",
													   GeneroFilme.DRAMA,
													   "2h09min",
													   "Ashton Kutcher, Dermot Mulroney, Josh Gad, Lukas Haas, J.K. Simmons, Lesley Ann Warren, Ron Eldard, Ahna O'Reilly, John Getz, James Woods, Matthew Modine",
													   "Joshua Michael Stern",
													   "The Five Star Institute",
													   "1 de Novembro de 2013");		
							filme6.apresentaFilme();						
							drama++;
													
						}
						
						System.out.println("\nGostou do Filme? \n\nDigite: \n\n1. Curti o Filme. \n2. Não Curti o Filme.");
						int avaliacao = sc.nextInt();
						
						if (avaliacao == 1) {
							contCurtir++;
							System.out.println("Que Bom Que Curtiu! =) \n\nVocê Recomenda Este Filme Para Algum Usuário? \n\n1. Renan Pinho. \n2. Eric Pinho. \n3. Priscila Seguro. \n4. Stephanie Facre. \n5. Sonia Mary. \n6. José Ricardo. \n7. Wilma Therezinha. \n8. Rodrigo Soutinho. \n9. Luis Fernando. \n10. Lucas Pinho. \n11. Louise Pinho. \n12. Tainah Lima. \n13. Daniel Ruiz. \n14. Patricia Seguro.");
							recomendacao = sc.nextInt();
							
							if (recomendacao == 1) {
								System.out.println("Você Recomendou Este Filme para Renan Pinho.");
							} else if (recomendacao == 2) {
								System.out.println("Você Recomendou Este Filme para Eric Pinho.");
							} else if (recomendacao == 3) {
								System.out.println("Você Recomendou Este Filme para Priscila Seguro.");
							} else if (recomendacao == 4) {
								System.out.println("Você Recomendou Este Filme para Stephanie Facre.");
							} else if (recomendacao == 5) {
								System.out.println("Você Recomendou Este Filme para Sonia Mary.");
							} else if (recomendacao == 6) {
								System.out.println("Você Recomendou Este Filme para José Ricardo.");
							} else if (recomendacao == 7) {
								System.out.println("Você Recomendou Este Filme para Wilma Therezinha.");
							} else if (recomendacao == 8) {
								System.out.println("Você Recomendou Este Filme para Rodrigo Soutinho.");
							} else if (recomendacao == 9) {
								System.out.println("Você Recomendou Este Filme para Luis Fernando.");
							} else if (recomendacao == 10) {
								System.out.println("Você Recomendou Este Filme para Lucas Pinho.");
							} else if (recomendacao == 11) {
								System.out.println("Você Recomendou Este Filme para Louise Pinho.");
							} else if (recomendacao == 12) {
								System.out.println("Você Recomendou Este Filme para Tainah Lima.");
							} else if (recomendacao == 13) {
								System.out.println("Você Recomendou Este Filme para Daniel Ruiz.");
							} else if (recomendacao == 14) {
								System.out.println("Você Recomendou Este Filme para Patricia Seguro.");
							}
							
						} else if (avaliacao == 2) {
							contDescurtir++;
							System.out.println("Que Pena Que Não Gostou. =(");
						}					
	
						if(day == 1) {						
							System.out.println("\nGostaria de sugerir algum filme para que coloquemos em nosso catálogo? \n\n1. Sim \n2. Nâo");
							catalogo = sc.nextInt();
							
							if (catalogo == 1) {
								System.out.println("\nQual o filme que gostaria de sugerir?");
								sc.nextLine();
								String sugestao = sc.nextLine();
								System.out.println("\nAgradecemos a sugestão! \n");
							} else if (catalogo == 2) {
								System.out.println("\nAté a próxima! \n");
							}
						} else {
							System.out.println("Sugestões de filmes somente no primeiro dia do mês.");
						}
					}
				
				}
					
				break;
				
			case 9:
				System.out.println("Bem-Vindo Rodrigo Soutinho, Tudo Bem?");

				Random rdrs = new Random();
				int inadimplenciaRodrigoSoutinho = rdrs.nextInt(2);
				
				if(inadimplenciaRodrigoSoutinho == 0) {
					System.out.println("\nVerificamos que seu pagamento ainda não consta em nosso sistema. Por gentileza, regularize seu pagamento para que possa ter novamente acesso a sua conta. Obrigado.\n");
				
				} else {						
				
					System.out.println("\nDigite: \n\n1. Informações do Usuário. \n2. Escolha um Filme.");
					escolha = sc.nextInt();
									
					if (escolha == 1) {
						Usuarios usuario9 = new Usuarios("Rodrigo Soutinho", "191.111.111-11", "Avenida ABC, 116", "rodrigo.soutinho@usuario.com.br", Pagamento.PIX);
						usuario9.apresentaUsuario();
						long idade9 = usuario9.idade(2000, 10, 19);
						System.out.println("Idade: " + idade9 + "\n\n");
						
					} else if (escolha == 2) {
						System.out.println("Digite: \n\n1. Star Wars: Episódio I - A Ameaça Fantasma. \n2. Como Se Fosse a Primeira Vez. \n3. Jumanji: Bem-vindo à Selva. \n4. Duro de Matar. \n5. O Destino de Uma Nação. \n6. Jobs.");
						int filme = sc.nextInt();
						
						if (filme == 1) {
							Filmes filme1 = new Filmes("Star Wars: Episódio I - A Ameaça Fantasma", 
													   "Obi-Wan e seu mentor embarcam em uma perigosa aventura na tentativa de salvar o planeta das garras de Darth Sidious. Durante a viagem, eles conhecem um habilidoso menino e decidem treiná-lo para se tornar um Jedi. Mas o tempo irá revelar que as coisas nem sempre são o que aparentam ser.",
													   GeneroFilme.FICCAO_CIENTIFICA,
													   "2h16min",
													   "Liam Neeson, Ewan McGregor, Natalie Portman, Jake Lloyd, Ian McDiarmid, Ray Park, Anthony Daniels, Kenny Baker, Pernilla August, Frank Oz",
													   "George Lucas",
													   "LucasFilm Ltd.",
													   "24 de Junho de 1999");
							filme1.apresentaFilme();
							ficcaoCientifica++;
																	
						} else if (filme == 2) {
							Filmes filme2 = new Filmes("Como Se Fosse a Primeira Vez", 
													   "Henry Roth é um veterinário paquerador, que vive no Havaí, e famoso pelo grande número de turistas que conquista. Seu novo alvo é Lucy Whitmore, que mora no local e por quem Henry se apaixona perdidamente. Mas Lucy sofre de falta de memória de curto prazo e, por isso, ela rapidamente se esquece de fatos que acabaram de acontecer. Assim, Henry é obrigado a conquistá-la, dia após dia, para ficar ao seu lado.",
													   GeneroFilme.COMEDIA_ROMANTICA,
													   "1h39min",
													   "Adam Sandler, Drew Barrymore, Rob Schneider, Sean Astin, Lusia Strus, Blake Clark, Dan Aykroyd",
													   "Peter Segal",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");
							filme2.apresentaFilme();
							comediaRomantica++;
																			
						} else if (filme == 3) {
							Filmes filme3 = new Filmes("Jumanji: Bem-vindo à Selva", 
													   "Quatro adolescentes encontram um videogame cuja ação se passa em uma floresta tropical. Empolgados com o jogo, eles escolhem seus avatares para o desafio, mas um evento inesperado faz com que eles sejam transportados para dentro do universo fictício, transformando-os nos personagens da aventura.",
													   GeneroFilme.AVENTURA,
													   "1h59min",
													   "Dwayne Johnson, Kevin Hart, Jack Black, Karen Gillan, Nick Jonas",
													   "Jake Kasdan",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");		
							filme3.apresentaFilme();
							aventura++;
													
						} else if (filme == 4) {
							Filmes filme4 = new Filmes("Duro de Matar", 
													   "O policial de Nova York John McClane está visitando sua família no Natal. Ele participa de uma confraternização de fim de ano na sede da empresa japonesa em que a esposa trabalha. A festa é interrompida por terroristas que invadem o edifício de luxo. McClane não demora a perceber que não há ninguém para salvá-los, a não ser ele próprio.",
													   GeneroFilme.ACAO,
													   "2h12min",
													   "Bruce Willis, Alan Rickman, Bonnie Bedelia, Reginald VelJohnson",
													   "John McTiernan",
													   "20th Century Studios",
													   "22 de Dezembro de 1988");		
							filme4.apresentaFilme();						
							acao++;
													
						} else if (filme == 5) {
							Filmes filme5 = new Filmes("O Destino de Uma Nação", 
													   "Winston Churchill está prestes a encarar um de seus maiores desafios: tomar posse do cargo de primeiro-ministro da Grã-Bretanha. Enquanto isso, ele costura um tratado de paz com a Alemanha nazista que pode significar o fim de anos de conflito.",
													   GeneroFilme.ACAO,
													   "2h05min",
													   "Gary Oldman, Ben Mendelsohn, Kristin Scott Thomas, Lily James, Stephen Dillane, Ronald Pickup",
													   "Joe Wright",
													   "Working Title Films",
													   "11 de Janeiro de 2018");		
							filme5.apresentaFilme();								
							guerra++;
													
						} else if (filme == 6) {
							Filmes filme6 = new Filmes("Jobs", 
													   "Em 1976, Steve Jobs abandonou a faculdade e junto com seu amigo, o gênio da tecnologia Steve Wozniak, iniciaram uma revolução nos computadores com a invenção do Apple 1, o primeiro computador pessoal. Construído na garagem dos pais de Jobs, o Apple 1 e a formação da empresa Apple mudaram o mundo para sempre. Steve Jobs não se incomodava em passar por cima dos outros para atingir suas metas, o que fez com que tivesse dificuldades em manter relações amorosas e de amizade.",
													   GeneroFilme.DRAMA,
													   "2h09min",
													   "Ashton Kutcher, Dermot Mulroney, Josh Gad, Lukas Haas, J.K. Simmons, Lesley Ann Warren, Ron Eldard, Ahna O'Reilly, John Getz, James Woods, Matthew Modine",
													   "Joshua Michael Stern",
													   "The Five Star Institute",
													   "1 de Novembro de 2013");		
							filme6.apresentaFilme();						
							drama++;
													
						}
						
						System.out.println("\nGostou do Filme? \n\nDigite: \n\n1. Curti o Filme. \n2. Não Curti o Filme.");
						int avaliacao = sc.nextInt();
						
						if (avaliacao == 1) {
							contCurtir++;
							System.out.println("Que Bom Que Curtiu! =) \n\nVocê Recomenda Este Filme Para Algum Usuário? \n\n1. Renan Pinho. \n2. Eric Pinho. \n3. Priscila Seguro. \n4. Stephanie Facre. \n5. Sonia Mary. \n6. José Ricardo. \n7. Wilma Therezinha. \n8. Vitor Rocha. \n9. Luis Fernando. \n10. Lucas Pinho. \n11. Louise Pinho. \n12. Tainah Lima. \n13. Daniel Ruiz. \n14. Patricia Seguro.");
							recomendacao = sc.nextInt();
							
							if (recomendacao == 1) {
								System.out.println("Você Recomendou Este Filme para Renan Pinho.");
							} else if (recomendacao == 2) {
								System.out.println("Você Recomendou Este Filme para Eric Pinho.");
							} else if (recomendacao == 3) {
								System.out.println("Você Recomendou Este Filme para Priscila Seguro.");
							} else if (recomendacao == 4) {
								System.out.println("Você Recomendou Este Filme para Stephanie Facre.");
							} else if (recomendacao == 5) {
								System.out.println("Você Recomendou Este Filme para Sonia Mary.");
							} else if (recomendacao == 6) {
								System.out.println("Você Recomendou Este Filme para José Ricardo.");
							} else if (recomendacao == 7) {
								System.out.println("Você Recomendou Este Filme para Wilma Therezinha.");
							} else if (recomendacao == 8) {
								System.out.println("Você Recomendou Este Filme para Vitor Rocha.");
							} else if (recomendacao == 9) {
								System.out.println("Você Recomendou Este Filme para Luis Fernando.");
							} else if (recomendacao == 10) {
								System.out.println("Você Recomendou Este Filme para Lucas Pinho.");
							} else if (recomendacao == 11) {
								System.out.println("Você Recomendou Este Filme para Louise Pinho.");
							} else if (recomendacao == 12) {
								System.out.println("Você Recomendou Este Filme para Tainah Lima.");
							} else if (recomendacao == 13) {
								System.out.println("Você Recomendou Este Filme para Daniel Ruiz.");
							} else if (recomendacao == 14) {
								System.out.println("Você Recomendou Este Filme para Patricia Seguro.");
							}
							
						} else if (avaliacao == 2) {
							contDescurtir++;
							System.out.println("Que Pena Que Não Gostou. =(");
						}					
						
						System.out.println("Gostaria de sugerir algum filme para que coloquemos em nosso catálogo?");
						catalogo = sc.nextInt();
	
						if(day == 1) {						
							System.out.println("\nGostaria de sugerir algum filme para que coloquemos em nosso catálogo? \n\n1. Sim \n2. Nâo");
							catalogo = sc.nextInt();
							
							if (catalogo == 1) {
								System.out.println("\nQual o filme que gostaria de sugerir?");
								sc.nextLine();
								String sugestao = sc.nextLine();
								System.out.println("\nAgradecemos a sugestão! \n");
							} else if (catalogo == 2) {
								System.out.println("\nAté a próxima! \n");
							}
						} else {
							System.out.println("Sugestões de filmes somente no primeiro dia do mês.");
						}
					}
					
				}
					
				break;
					
			case 10:
				System.out.println("Bem-Vindo Luis Fernando, Tudo Bem?");

				Random rdlf = new Random();
				int inadimplenciaLuisFernando = rdlf.nextInt(2);
					
				if(inadimplenciaLuisFernando == 0) {
				System.out.println("\nVerificamos que seu pagamento ainda não consta em nosso sistema. Por gentileza, regularize seu pagamento para que possa ter novamente acesso a sua conta. Obrigado.\n");
				
				} else {						
					
					System.out.println("\nDigite: \n\n1. Informações do Usuário. \n2. Escolha um Filme.");
					escolha = sc.nextInt();
											
					if (escolha == 1) {
						Usuarios usuario10 = new Usuarios("Luis Fernando", "122.111.111-11", "Avenida ABC, 115", "luis.fernando@usuario.com.br", Pagamento.BOLETO);
						usuario10.apresentaUsuario();
						long idade10 = usuario10.idade(1977, 7, 7);
						System.out.println("Idade: " + idade10 + "\n\n");
							
					} else if (escolha == 2) {
						System.out.println("Digite: \n\n1. Star Wars: Episódio I - A Ameaça Fantasma. \n2. Como Se Fosse a Primeira Vez. \n3. Jumanji: Bem-vindo à Selva. \n4. Duro de Matar. \n5. O Destino de Uma Nação. \n6. Jobs.");
						int filme = sc.nextInt();
							
						if (filme == 1) {
							Filmes filme1 = new Filmes("Star Wars: Episódio I - A Ameaça Fantasma", 
													   "Obi-Wan e seu mentor embarcam em uma perigosa aventura na tentativa de salvar o planeta das garras de Darth Sidious. Durante a viagem, eles conhecem um habilidoso menino e decidem treiná-lo para se tornar um Jedi. Mas o tempo irá revelar que as coisas nem sempre são o que aparentam ser.",
													   GeneroFilme.FICCAO_CIENTIFICA,
													   "2h16min",
													   "Liam Neeson, Ewan McGregor, Natalie Portman, Jake Lloyd, Ian McDiarmid, Ray Park, Anthony Daniels, Kenny Baker, Pernilla August, Frank Oz",
													   "George Lucas",
													   "LucasFilm Ltd.",
													   "24 de Junho de 1999");
							filme1.apresentaFilme();
							ficcaoCientifica++;
																	
						} else if (filme == 2) {
							Filmes filme2 = new Filmes("Como Se Fosse a Primeira Vez", 
													   "Henry Roth é um veterinário paquerador, que vive no Havaí, e famoso pelo grande número de turistas que conquista. Seu novo alvo é Lucy Whitmore, que mora no local e por quem Henry se apaixona perdidamente. Mas Lucy sofre de falta de memória de curto prazo e, por isso, ela rapidamente se esquece de fatos que acabaram de acontecer. Assim, Henry é obrigado a conquistá-la, dia após dia, para ficar ao seu lado.",
													   GeneroFilme.COMEDIA_ROMANTICA,
													   "1h39min",
													   "Adam Sandler, Drew Barrymore, Rob Schneider, Sean Astin, Lusia Strus, Blake Clark, Dan Aykroyd",
													   "Peter Segal",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");
							filme2.apresentaFilme();
							comediaRomantica++;
																			
						} else if (filme == 3) {
							Filmes filme3 = new Filmes("Jumanji: Bem-vindo à Selva", 
													   "Quatro adolescentes encontram um videogame cuja ação se passa em uma floresta tropical. Empolgados com o jogo, eles escolhem seus avatares para o desafio, mas um evento inesperado faz com que eles sejam transportados para dentro do universo fictício, transformando-os nos personagens da aventura.",
													   GeneroFilme.AVENTURA,
													   "1h59min",
													   "Dwayne Johnson, Kevin Hart, Jack Black, Karen Gillan, Nick Jonas",
													   "Jake Kasdan",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");		
							filme3.apresentaFilme();
							aventura++;
														
						} else if (filme == 4) {
							Filmes filme4 = new Filmes("Duro de Matar", 
													   "O policial de Nova York John McClane está visitando sua família no Natal. Ele participa de uma confraternização de fim de ano na sede da empresa japonesa em que a esposa trabalha. A festa é interrompida por terroristas que invadem o edifício de luxo. McClane não demora a perceber que não há ninguém para salvá-los, a não ser ele próprio.",
													   GeneroFilme.ACAO,
													   "2h12min",
													   "Bruce Willis, Alan Rickman, Bonnie Bedelia, Reginald VelJohnson",
													   "John McTiernan",
													   "20th Century Studios",
													   "22 de Dezembro de 1988");		
							filme4.apresentaFilme();						
							acao++;
													
						} else if (filme == 5) {
							Filmes filme5 = new Filmes("O Destino de Uma Nação", 
													   "Winston Churchill está prestes a encarar um de seus maiores desafios: tomar posse do cargo de primeiro-ministro da Grã-Bretanha. Enquanto isso, ele costura um tratado de paz com a Alemanha nazista que pode significar o fim de anos de conflito.",
													   GeneroFilme.ACAO,
													   "2h05min",
													   "Gary Oldman, Ben Mendelsohn, Kristin Scott Thomas, Lily James, Stephen Dillane, Ronald Pickup",
													   "Joe Wright",
													   "Working Title Films",
													   "11 de Janeiro de 2018");		
							filme5.apresentaFilme();								
							guerra++;
												
						} else if (filme == 6) {
							Filmes filme6 = new Filmes("Jobs", 
													   "Em 1976, Steve Jobs abandonou a faculdade e junto com seu amigo, o gênio da tecnologia Steve Wozniak, iniciaram uma revolução nos computadores com a invenção do Apple 1, o primeiro computador pessoal. Construído na garagem dos pais de Jobs, o Apple 1 e a formação da empresa Apple mudaram o mundo para sempre. Steve Jobs não se incomodava em passar por cima dos outros para atingir suas metas, o que fez com que tivesse dificuldades em manter relações amorosas e de amizade.",
													   GeneroFilme.DRAMA,
													   "2h09min",
													   "Ashton Kutcher, Dermot Mulroney, Josh Gad, Lukas Haas, J.K. Simmons, Lesley Ann Warren, Ron Eldard, Ahna O'Reilly, John Getz, James Woods, Matthew Modine",
													   "Joshua Michael Stern",
													   "The Five Star Institute",
													   "1 de Novembro de 2013");		
							filme6.apresentaFilme();						
							drama++;
													
						}
						
						System.out.println("\nGostou do Filme? \n\nDigite: \n\n1. Curti o Filme. \n2. Não Curti o Filme.");
						int avaliacao = sc.nextInt();
							
						if (avaliacao == 1) {
							contCurtir++;
							System.out.println("Que Bom Que Curtiu! =) \n\nVocê Recomenda Este Filme Para Algum Usuário? \n\n1. Renan Pinho. \n2. Eric Pinho. \n3. Priscila Seguro. \n4. Stephanie Facre. \n5. Sonia Mary. \n6. José Ricardo. \n7. Wilma Therezinha. \n8. Vitor Rocha. \n9. Rodrigo Soutinho. \n10. Lucas Pinho. \n11. Louise Pinho. \n12. Tainah Lima. \n13. Daniel Ruiz. \n14. Patricia Seguro.");
							recomendacao = sc.nextInt();
								
							if (recomendacao == 1) {
								System.out.println("Você Recomendou Este Filme para Renan Pinho.");
							} else if (recomendacao == 2) {
								System.out.println("Você Recomendou Este Filme para Eric Pinho.");
							} else if (recomendacao == 3) {
								System.out.println("Você Recomendou Este Filme para Priscila Seguro.");
							} else if (recomendacao == 4) {
								System.out.println("Você Recomendou Este Filme para Stephanie Facre.");
							} else if (recomendacao == 5) {
								System.out.println("Você Recomendou Este Filme para Sonia Mary.");
							} else if (recomendacao == 6) {
								System.out.println("Você Recomendou Este Filme para José Ricardo.");
							} else if (recomendacao == 7) {
								System.out.println("Você Recomendou Este Filme para Wilma Therezinha.");
							} else if (recomendacao == 8) {
								System.out.println("Você Recomendou Este Filme para Vitor Rocha.");
							} else if (recomendacao == 9) {
								System.out.println("Você Recomendou Este Filme para Rodrigo Soutinho.");
							} else if (recomendacao == 10) {
								System.out.println("Você Recomendou Este Filme para Lucas Pinho.");
							} else if (recomendacao == 11) {
								System.out.println("Você Recomendou Este Filme para Louise Pinho.");
							} else if (recomendacao == 12) {
								System.out.println("Você Recomendou Este Filme para Tainah Lima.");
							} else if (recomendacao == 13) {
								System.out.println("Você Recomendou Este Filme para Daniel Ruiz.");
							} else if (recomendacao == 14) {
								System.out.println("Você Recomendou Este Filme para Patricia Seguro.");
							}
								
						} else if (avaliacao == 2) {
							contDescurtir++;
							System.out.println("Que Pena Que Não Gostou. =(");
						}					
						
						System.out.println("Gostaria de sugerir algum filme para que coloquemos em nosso catálogo?");
						catalogo = sc.nextInt();
		
						if(day == 1) {						
							System.out.println("\nGostaria de sugerir algum filme para que coloquemos em nosso catálogo? \n\n1. Sim \n2. Nâo");
							catalogo = sc.nextInt();
							
							if (catalogo == 1) {
								System.out.println("\nQual o filme que gostaria de sugerir?");
								sc.nextLine();
								String sugestao = sc.nextLine();
								System.out.println("\nAgradecemos a sugestão! \n");
							} else if (catalogo == 2) {
								System.out.println("\nAté a próxima! \n");
							}
							} else {
								System.out.println("Sugestões de filmes somente no primeiro dia do mês.");
							}
						}
					
					}
				
					break;
				
			case 11:
				System.out.println("Bem-Vindo Lucas Pinho, Tudo Bem?");

				Random rdlp = new Random();
				int inadimplenciaLucasPinho = rdlp.nextInt(2);
				
				if(inadimplenciaLucasPinho == 0) {
					System.out.println("\nVerificamos que seu pagamento ainda não consta em nosso sistema. Por gentileza, regularize seu pagamento para que possa ter novamente acesso a sua conta. Obrigado.\n");
				
				} else {						
				
					System.out.println("\nDigite: \n\n1. Informações do Usuário. \n2. Escolha um Filme.");
					escolha = sc.nextInt();
								
					if (escolha == 1) {
						Usuarios usuario11 = new Usuarios("Lucas Pinho", "123.111.111-11", "Avenida ABC, 114", "lucas.pinho@usuario.com.br", Pagamento.DEBITO);
						usuario11.apresentaUsuario();
						long idade11 = usuario11.idade(1948, 7, 12);
						System.out.println("Idade: " + idade11 + "\n\n");
						
					} else if (escolha == 2) {
						System.out.println("Digite: \n\n1. Star Wars: Episódio I - A Ameaça Fantasma. \n2. Como Se Fosse a Primeira Vez. \n3. Jumanji: Bem-vindo à Selva. \n4. Duro de Matar. \n5. O Destino de Uma Nação. \n6. Jobs.");
						int filme = sc.nextInt();
						
						if (filme == 1) {
							Filmes filme1 = new Filmes("Star Wars: Episódio I - A Ameaça Fantasma", 
													   "Obi-Wan e seu mentor embarcam em uma perigosa aventura na tentativa de salvar o planeta das garras de Darth Sidious. Durante a viagem, eles conhecem um habilidoso menino e decidem treiná-lo para se tornar um Jedi. Mas o tempo irá revelar que as coisas nem sempre são o que aparentam ser.",
													   GeneroFilme.FICCAO_CIENTIFICA,
													   "2h16min",
													   "Liam Neeson, Ewan McGregor, Natalie Portman, Jake Lloyd, Ian McDiarmid, Ray Park, Anthony Daniels, Kenny Baker, Pernilla August, Frank Oz",
													   "George Lucas",
													   "LucasFilm Ltd.",
													   "24 de Junho de 1999");
							filme1.apresentaFilme();
							ficcaoCientifica++;
																	
						} else if (filme == 2) {
							Filmes filme2 = new Filmes("Como Se Fosse a Primeira Vez", 
													   "Henry Roth é um veterinário paquerador, que vive no Havaí, e famoso pelo grande número de turistas que conquista. Seu novo alvo é Lucy Whitmore, que mora no local e por quem Henry se apaixona perdidamente. Mas Lucy sofre de falta de memória de curto prazo e, por isso, ela rapidamente se esquece de fatos que acabaram de acontecer. Assim, Henry é obrigado a conquistá-la, dia após dia, para ficar ao seu lado.",
													   GeneroFilme.COMEDIA_ROMANTICA,
													   "1h39min",
													   "Adam Sandler, Drew Barrymore, Rob Schneider, Sean Astin, Lusia Strus, Blake Clark, Dan Aykroyd",
													   "Peter Segal",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");
							filme2.apresentaFilme();
							comediaRomantica++;
																			
						} else if (filme == 3) {
							Filmes filme3 = new Filmes("Jumanji: Bem-vindo à Selva", 
													   "Quatro adolescentes encontram um videogame cuja ação se passa em uma floresta tropical. Empolgados com o jogo, eles escolhem seus avatares para o desafio, mas um evento inesperado faz com que eles sejam transportados para dentro do universo fictício, transformando-os nos personagens da aventura.",
													   GeneroFilme.AVENTURA,
													   "1h59min",
													   "Dwayne Johnson, Kevin Hart, Jack Black, Karen Gillan, Nick Jonas",
													   "Jake Kasdan",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");		
							filme3.apresentaFilme();
							aventura++;
													
						} else if (filme == 4) {
							Filmes filme4 = new Filmes("Duro de Matar", 
													   "O policial de Nova York John McClane está visitando sua família no Natal. Ele participa de uma confraternização de fim de ano na sede da empresa japonesa em que a esposa trabalha. A festa é interrompida por terroristas que invadem o edifício de luxo. McClane não demora a perceber que não há ninguém para salvá-los, a não ser ele próprio.",
													   GeneroFilme.ACAO,
													   "2h12min",
													   "Bruce Willis, Alan Rickman, Bonnie Bedelia, Reginald VelJohnson",
													   "John McTiernan",
													   "20th Century Studios",
													   "22 de Dezembro de 1988");		
							filme4.apresentaFilme();						
							acao++;
													
						} else if (filme == 5) {
							Filmes filme5 = new Filmes("O Destino de Uma Nação", 
													   "Winston Churchill está prestes a encarar um de seus maiores desafios: tomar posse do cargo de primeiro-ministro da Grã-Bretanha. Enquanto isso, ele costura um tratado de paz com a Alemanha nazista que pode significar o fim de anos de conflito.",
													   GeneroFilme.ACAO,
													   "2h05min",
													   "Gary Oldman, Ben Mendelsohn, Kristin Scott Thomas, Lily James, Stephen Dillane, Ronald Pickup",
													   "Joe Wright",
													   "Working Title Films",
													   "11 de Janeiro de 2018");		
							filme5.apresentaFilme();								
							guerra++;
													
						} else if (filme == 6) {
							Filmes filme6 = new Filmes("Jobs", 
													   "Em 1976, Steve Jobs abandonou a faculdade e junto com seu amigo, o gênio da tecnologia Steve Wozniak, iniciaram uma revolução nos computadores com a invenção do Apple 1, o primeiro computador pessoal. Construído na garagem dos pais de Jobs, o Apple 1 e a formação da empresa Apple mudaram o mundo para sempre. Steve Jobs não se incomodava em passar por cima dos outros para atingir suas metas, o que fez com que tivesse dificuldades em manter relações amorosas e de amizade.",
													   GeneroFilme.DRAMA,
													   "2h09min",
													   "Ashton Kutcher, Dermot Mulroney, Josh Gad, Lukas Haas, J.K. Simmons, Lesley Ann Warren, Ron Eldard, Ahna O'Reilly, John Getz, James Woods, Matthew Modine",
													   "Joshua Michael Stern",
													   "The Five Star Institute",
													   "1 de Novembro de 2013");		
							filme6.apresentaFilme();						
							drama++;
													
						}
						
						System.out.println("\nGostou do Filme? \n\nDigite: \n\n1. Curti o Filme. \n2. Não Curti o Filme.");
						int avaliacao = sc.nextInt();
						
						if (avaliacao == 1) {
							contCurtir++;
							System.out.println("Que Bom Que Curtiu! =) \n\nVocê Recomenda Este Filme Para Algum Usuário? \n\n1. Renan Pinho. \n2. Eric Pinho. \n3. Priscila Seguro. \n4. Stephanie Facre. \n5. Sonia Mary. \n6. José Ricardo. \n7. Wilma Therezinha. \n8. Vitor Rocha. \n9. Rodrigo Soutinho. \n10. Luis Fernando. \n11. Louise Pinho. \n12. Tainah Lima. \n13. Daniel Ruiz. \n14. Patricia Seguro.");
							recomendacao = sc.nextInt();
							
							if (recomendacao == 1) {
								System.out.println("Você Recomendou Este Filme para Renan Pinho.");
							} else if (recomendacao == 2) {
								System.out.println("Você Recomendou Este Filme para Eric Pinho.");
							} else if (recomendacao == 3) {
								System.out.println("Você Recomendou Este Filme para Priscila Seguro.");
							} else if (recomendacao == 4) {
								System.out.println("Você Recomendou Este Filme para Stephanie Facre.");
							} else if (recomendacao == 5) {
								System.out.println("Você Recomendou Este Filme para Sonia Mary.");
							} else if (recomendacao == 6) {
								System.out.println("Você Recomendou Este Filme para José Ricardo.");
							} else if (recomendacao == 7) {
								System.out.println("Você Recomendou Este Filme para Wilma Therezinha.");
							} else if (recomendacao == 8) {
								System.out.println("Você Recomendou Este Filme para Vitor Rocha.");
							} else if (recomendacao == 9) {
								System.out.println("Você Recomendou Este Filme para Rodrigo Soutinho.");
							} else if (recomendacao == 10) {
								System.out.println("Você Recomendou Este Filme para Luis Fernando.");
							} else if (recomendacao == 11) {
								System.out.println("Você Recomendou Este Filme para Louise Pinho.");
							} else if (recomendacao == 12) {
								System.out.println("Você Recomendou Este Filme para Tainah Lima.");
							} else if (recomendacao == 13) {
								System.out.println("Você Recomendou Este Filme para Daniel Ruiz.");
							} else if (recomendacao == 14) {
								System.out.println("Você Recomendou Este Filme para Patricia Seguro.");
							}
							
						} else if (avaliacao == 2) {
							contDescurtir++;
							System.out.println("Que Pena Que Não Gostou. =(");
						}					
	
						if(day == 1) {						
							System.out.println("\nGostaria de sugerir algum filme para que coloquemos em nosso catálogo? \n\n1. Sim \n2. Nâo");
							catalogo = sc.nextInt();
							
							if (catalogo == 1) {
								System.out.println("\nQual o filme que gostaria de sugerir?");
								sc.nextLine();
								String sugestao = sc.nextLine();
								System.out.println("\nAgradecemos a sugestão! \n");
							} else if (catalogo == 2) {
								System.out.println("\nAté a próxima! \n");
							}
						} else {
							System.out.println("Sugestões de filmes somente no primeiro dia do mês.");
						}
					}
					
				}
				
				break;
				
			case 12:
				System.out.println("Bem-Vindo Louise Pinho, Tudo Bem?");

				Random rdllp = new Random();
				int inadimplenciaLouisePinho = rdllp.nextInt(2);
				
				if(inadimplenciaLouisePinho == 0) {
					System.out.println("\nVerificamos que seu pagamento ainda não consta em nosso sistema. Por gentileza, regularize seu pagamento para que possa ter novamente acesso a sua conta. Obrigado.\n");
				
				} else {						
				
					System.out.println("\nDigite: \n\n1. Informações do Usuário. \n2. Escolha um Filme.");
					escolha = sc.nextInt();
									
					if (escolha == 1) {
						Usuarios usuario12 = new Usuarios("Louise Pinho", "124.111.111-11", "Avenida ABC, 113", "louise.pinho@usuario.com.br", Pagamento.CREDITO);
						usuario12.apresentaUsuario();
						long idade12 = usuario12.idade(1987, 4, 21);
						System.out.println("Idade: " + idade12 + "\n\n");
						
					} else if (escolha == 2) {
						System.out.println("Digite: \n\n1. Star Wars: Episódio I - A Ameaça Fantasma. \n2. Como Se Fosse a Primeira Vez. \n3. Jumanji: Bem-vindo à Selva. \n4. Duro de Matar. \n5. O Destino de Uma Nação. \n6. Jobs.");
						int filme = sc.nextInt();
						
						if (filme == 1) {
							Filmes filme1 = new Filmes("Star Wars: Episódio I - A Ameaça Fantasma", 
													   "Obi-Wan e seu mentor embarcam em uma perigosa aventura na tentativa de salvar o planeta das garras de Darth Sidious. Durante a viagem, eles conhecem um habilidoso menino e decidem treiná-lo para se tornar um Jedi. Mas o tempo irá revelar que as coisas nem sempre são o que aparentam ser.",
													   GeneroFilme.FICCAO_CIENTIFICA,
													   "2h16min",
													   "Liam Neeson, Ewan McGregor, Natalie Portman, Jake Lloyd, Ian McDiarmid, Ray Park, Anthony Daniels, Kenny Baker, Pernilla August, Frank Oz",
													   "George Lucas",
													   "LucasFilm Ltd.",
													   "24 de Junho de 1999");
							filme1.apresentaFilme();
							ficcaoCientifica++;
																	
						} else if (filme == 2) {
							Filmes filme2 = new Filmes("Como Se Fosse a Primeira Vez", 
													   "Henry Roth é um veterinário paquerador, que vive no Havaí, e famoso pelo grande número de turistas que conquista. Seu novo alvo é Lucy Whitmore, que mora no local e por quem Henry se apaixona perdidamente. Mas Lucy sofre de falta de memória de curto prazo e, por isso, ela rapidamente se esquece de fatos que acabaram de acontecer. Assim, Henry é obrigado a conquistá-la, dia após dia, para ficar ao seu lado.",
													   GeneroFilme.COMEDIA_ROMANTICA,
													   "1h39min",
													   "Adam Sandler, Drew Barrymore, Rob Schneider, Sean Astin, Lusia Strus, Blake Clark, Dan Aykroyd",
													   "Peter Segal",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");
							filme2.apresentaFilme();
							comediaRomantica++;
																			
						} else if (filme == 3) {
							Filmes filme3 = new Filmes("Jumanji: Bem-vindo à Selva", 
													   "Quatro adolescentes encontram um videogame cuja ação se passa em uma floresta tropical. Empolgados com o jogo, eles escolhem seus avatares para o desafio, mas um evento inesperado faz com que eles sejam transportados para dentro do universo fictício, transformando-os nos personagens da aventura.",
													   GeneroFilme.AVENTURA,
													   "1h59min",
													   "Dwayne Johnson, Kevin Hart, Jack Black, Karen Gillan, Nick Jonas",
													   "Jake Kasdan",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");		
							filme3.apresentaFilme();
							aventura++;
													
						} else if (filme == 4) {
							Filmes filme4 = new Filmes("Duro de Matar", 
													   "O policial de Nova York John McClane está visitando sua família no Natal. Ele participa de uma confraternização de fim de ano na sede da empresa japonesa em que a esposa trabalha. A festa é interrompida por terroristas que invadem o edifício de luxo. McClane não demora a perceber que não há ninguém para salvá-los, a não ser ele próprio.",
													   GeneroFilme.ACAO,
													   "2h12min",
													   "Bruce Willis, Alan Rickman, Bonnie Bedelia, Reginald VelJohnson",
													   "John McTiernan",
													   "20th Century Studios",
													   "22 de Dezembro de 1988");		
							filme4.apresentaFilme();						
							acao++;
													
						} else if (filme == 5) {
							Filmes filme5 = new Filmes("O Destino de Uma Nação", 
													   "Winston Churchill está prestes a encarar um de seus maiores desafios: tomar posse do cargo de primeiro-ministro da Grã-Bretanha. Enquanto isso, ele costura um tratado de paz com a Alemanha nazista que pode significar o fim de anos de conflito.",
													   GeneroFilme.ACAO,
													   "2h05min",
													   "Gary Oldman, Ben Mendelsohn, Kristin Scott Thomas, Lily James, Stephen Dillane, Ronald Pickup",
													   "Joe Wright",
													   "Working Title Films",
													   "11 de Janeiro de 2018");		
							filme5.apresentaFilme();								
							guerra++;
													
						} else if (filme == 6) {
							Filmes filme6 = new Filmes("Jobs", 
													   "Em 1976, Steve Jobs abandonou a faculdade e junto com seu amigo, o gênio da tecnologia Steve Wozniak, iniciaram uma revolução nos computadores com a invenção do Apple 1, o primeiro computador pessoal. Construído na garagem dos pais de Jobs, o Apple 1 e a formação da empresa Apple mudaram o mundo para sempre. Steve Jobs não se incomodava em passar por cima dos outros para atingir suas metas, o que fez com que tivesse dificuldades em manter relações amorosas e de amizade.",
													   GeneroFilme.DRAMA,
													   "2h09min",
													   "Ashton Kutcher, Dermot Mulroney, Josh Gad, Lukas Haas, J.K. Simmons, Lesley Ann Warren, Ron Eldard, Ahna O'Reilly, John Getz, James Woods, Matthew Modine",
													   "Joshua Michael Stern",
													   "The Five Star Institute",
													   "1 de Novembro de 2013");		
							filme6.apresentaFilme();						
							drama++;
													
						}
						
						System.out.println("\nGostou do Filme? \n\nDigite: \n\n1. Curti o Filme. \n2. Não Curti o Filme.");
						int avaliacao = sc.nextInt();
						
						if (avaliacao == 1) {
							contCurtir++;
							System.out.println("Que Bom Que Curtiu! =) \n\nVocê Recomenda Este Filme Para Algum Usuário? \n\n1. Renan Pinho. \n2. Eric Pinho. \n3. Priscila Seguro. \n4. Stephanie Facre. \n5. Sonia Mary. \n6. José Ricardo. \n7. Wilma Therezinha. \n8. Vitor Rocha. \n9. Rodrigo Soutinho. \n10. Luis Fernando. \n11. Lucas Pinho. \n12. Tainah Lima. \n13. Daniel Ruiz. \n14. Patricia Seguro.");
							recomendacao = sc.nextInt();
							
							if (recomendacao == 1) {
								System.out.println("Você Recomendou Este Filme para Renan Pinho.");
							} else if (recomendacao == 2) {
								System.out.println("Você Recomendou Este Filme para Eric Pinho.");
							} else if (recomendacao == 3) {
								System.out.println("Você Recomendou Este Filme para Priscila Seguro.");
							} else if (recomendacao == 4) {
								System.out.println("Você Recomendou Este Filme para Stephanie Facre.");
							} else if (recomendacao == 5) {
								System.out.println("Você Recomendou Este Filme para Sonia Mary.");
							} else if (recomendacao == 6) {
								System.out.println("Você Recomendou Este Filme para José Ricardo.");
							} else if (recomendacao == 7) {
								System.out.println("Você Recomendou Este Filme para Wilma Therezinha.");
							} else if (recomendacao == 8) {
								System.out.println("Você Recomendou Este Filme para Vitor Rocha.");
							} else if (recomendacao == 9) {
								System.out.println("Você Recomendou Este Filme para Rodrigo Soutinho.");
							} else if (recomendacao == 10) {
								System.out.println("Você Recomendou Este Filme para Luis Fernando.");
							} else if (recomendacao == 11) {
								System.out.println("Você Recomendou Este Filme para Lucas Pinho.");
							} else if (recomendacao == 12) {
								System.out.println("Você Recomendou Este Filme para Tainah Lima.");
							} else if (recomendacao == 13) {
								System.out.println("Você Recomendou Este Filme para Daniel Ruiz.");
							} else if (recomendacao == 14) {
								System.out.println("Você Recomendou Este Filme para Patricia Seguro.");
							}
							
						} else if (avaliacao == 2) {
							contDescurtir++;
							System.out.println("Que Pena Que Não Gostou. =(");
						}					
	
						if(day == 1) {						
							System.out.println("\nGostaria de sugerir algum filme para que coloquemos em nosso catálogo? \n\n1. Sim \n2. Nâo");
							catalogo = sc.nextInt();
							
							if (catalogo == 1) {
								System.out.println("\nQual o filme que gostaria de sugerir?");
								sc.nextLine();
								String sugestao = sc.nextLine();
								System.out.println("\nAgradecemos a sugestão! \n");
							} else if (catalogo == 2) {
								System.out.println("\nAté a próxima! \n");
							}
						} else {
							System.out.println("Sugestões de filmes somente no primeiro dia do mês.");
						}
					}
					
				}
				
				break;
				
			case 13:
				System.out.println("Bem-Vindo Tainah Lima, Tudo Bem?");

				Random rdtl = new Random();
				int inadimplenciaTainahLima = rdtl.nextInt(2);
				
				if(inadimplenciaTainahLima == 0) {
					System.out.println("\nVerificamos que seu pagamento ainda não consta em nosso sistema. Por gentileza, regularize seu pagamento para que possa ter novamente acesso a sua conta. Obrigado.\n");
				
				} else {						
				
					System.out.println("\nDigite: \n\n1. Informações do Usuário. \n2. Escolha um Filme.");
					escolha = sc.nextInt();
								
					if (escolha == 1) {
						Usuarios usuario13 = new Usuarios("Tainah Lima", "125.111.111-11", "Avenida ABC, 112", "tainah.lima@usuario.com.br", Pagamento.CREDITO);
						usuario13.apresentaUsuario();
						long idade13 = usuario13.idade(1985, 9, 24);
						System.out.println("Idade: " + idade13 + "\n\n");
						
					} else if (escolha == 2) {
						System.out.println("Digite: \n\n1. Star Wars: Episódio I - A Ameaça Fantasma. \n2. Como Se Fosse a Primeira Vez. \n3. Jumanji: Bem-vindo à Selva. \n4. Duro de Matar. \n5. O Destino de Uma Nação. \n6. Jobs.");
						int filme = sc.nextInt();
						
						if (filme == 1) {
							Filmes filme1 = new Filmes("Star Wars: Episódio I - A Ameaça Fantasma", 
													   "Obi-Wan e seu mentor embarcam em uma perigosa aventura na tentativa de salvar o planeta das garras de Darth Sidious. Durante a viagem, eles conhecem um habilidoso menino e decidem treiná-lo para se tornar um Jedi. Mas o tempo irá revelar que as coisas nem sempre são o que aparentam ser.",
													   GeneroFilme.FICCAO_CIENTIFICA,
													   "2h16min",
													   "Liam Neeson, Ewan McGregor, Natalie Portman, Jake Lloyd, Ian McDiarmid, Ray Park, Anthony Daniels, Kenny Baker, Pernilla August, Frank Oz",
													   "George Lucas",
													   "LucasFilm Ltd.",
													   "24 de Junho de 1999");
							filme1.apresentaFilme();
							ficcaoCientifica++;
																	
						} else if (filme == 2) {
							Filmes filme2 = new Filmes("Como Se Fosse a Primeira Vez", 
													   "Henry Roth é um veterinário paquerador, que vive no Havaí, e famoso pelo grande número de turistas que conquista. Seu novo alvo é Lucy Whitmore, que mora no local e por quem Henry se apaixona perdidamente. Mas Lucy sofre de falta de memória de curto prazo e, por isso, ela rapidamente se esquece de fatos que acabaram de acontecer. Assim, Henry é obrigado a conquistá-la, dia após dia, para ficar ao seu lado.",
													   GeneroFilme.COMEDIA_ROMANTICA,
													   "1h39min",
													   "Adam Sandler, Drew Barrymore, Rob Schneider, Sean Astin, Lusia Strus, Blake Clark, Dan Aykroyd",
													   "Peter Segal",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");
							filme2.apresentaFilme();
							comediaRomantica++;
																			
						} else if (filme == 3) {
							Filmes filme3 = new Filmes("Jumanji: Bem-vindo à Selva", 
													   "Quatro adolescentes encontram um videogame cuja ação se passa em uma floresta tropical. Empolgados com o jogo, eles escolhem seus avatares para o desafio, mas um evento inesperado faz com que eles sejam transportados para dentro do universo fictício, transformando-os nos personagens da aventura.",
													   GeneroFilme.AVENTURA,
													   "1h59min",
													   "Dwayne Johnson, Kevin Hart, Jack Black, Karen Gillan, Nick Jonas",
													   "Jake Kasdan",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");		
							filme3.apresentaFilme();
							aventura++;
													
						} else if (filme == 4) {
							Filmes filme4 = new Filmes("Duro de Matar", 
													   "O policial de Nova York John McClane está visitando sua família no Natal. Ele participa de uma confraternização de fim de ano na sede da empresa japonesa em que a esposa trabalha. A festa é interrompida por terroristas que invadem o edifício de luxo. McClane não demora a perceber que não há ninguém para salvá-los, a não ser ele próprio.",
													   GeneroFilme.ACAO,
													   "2h12min",
													   "Bruce Willis, Alan Rickman, Bonnie Bedelia, Reginald VelJohnson",
													   "John McTiernan",
													   "20th Century Studios",
													   "22 de Dezembro de 1988");		
							filme4.apresentaFilme();						
							acao++;
													
						} else if (filme == 5) {
							Filmes filme5 = new Filmes("O Destino de Uma Nação", 
													   "Winston Churchill está prestes a encarar um de seus maiores desafios: tomar posse do cargo de primeiro-ministro da Grã-Bretanha. Enquanto isso, ele costura um tratado de paz com a Alemanha nazista que pode significar o fim de anos de conflito.",
													   GeneroFilme.ACAO,
													   "2h05min",
													   "Gary Oldman, Ben Mendelsohn, Kristin Scott Thomas, Lily James, Stephen Dillane, Ronald Pickup",
													   "Joe Wright",
													   "Working Title Films",
													   "11 de Janeiro de 2018");		
							filme5.apresentaFilme();								
							guerra++;
													
						} else if (filme == 6) {
							Filmes filme6 = new Filmes("Jobs", 
													   "Em 1976, Steve Jobs abandonou a faculdade e junto com seu amigo, o gênio da tecnologia Steve Wozniak, iniciaram uma revolução nos computadores com a invenção do Apple 1, o primeiro computador pessoal. Construído na garagem dos pais de Jobs, o Apple 1 e a formação da empresa Apple mudaram o mundo para sempre. Steve Jobs não se incomodava em passar por cima dos outros para atingir suas metas, o que fez com que tivesse dificuldades em manter relações amorosas e de amizade.",
													   GeneroFilme.DRAMA,
													   "2h09min",
													   "Ashton Kutcher, Dermot Mulroney, Josh Gad, Lukas Haas, J.K. Simmons, Lesley Ann Warren, Ron Eldard, Ahna O'Reilly, John Getz, James Woods, Matthew Modine",
													   "Joshua Michael Stern",
													   "The Five Star Institute",
													   "1 de Novembro de 2013");		
							filme6.apresentaFilme();						
							drama++;
													
						}
						
						System.out.println("\nGostou do Filme? \n\nDigite: \n\n1. Curti o Filme. \n2. Não Curti o Filme.");
						int avaliacao = sc.nextInt();
						
						if (avaliacao == 1) {
							contCurtir++;
							System.out.println("Que Bom Que Curtiu! =) \n\nVocê Recomenda Este Filme Para Algum Usuário? \n\n1. Renan Pinho. \n2. Eric Pinho. \n3. Priscila Seguro. \n4. Stephanie Facre. \n5. Sonia Mary. \n6. José Ricardo. \n7. Wilma Therezinha. \n8. Vitor Rocha. \n9. Rodrigo Soutinho. \n10. Luis Fernando. \n11. Lucas Pinho. \n12. Louise Pinho. \n13. Daniel Ruiz. \n14. Patricia Seguro.");
							recomendacao = sc.nextInt();
							
							if (recomendacao == 1) {
								System.out.println("Você Recomendou Este Filme para Renan Pinho.");
							} else if (recomendacao == 2) {
								System.out.println("Você Recomendou Este Filme para Eric Pinho.");
							} else if (recomendacao == 3) {
								System.out.println("Você Recomendou Este Filme para Priscila Seguro.");
							} else if (recomendacao == 4) {
								System.out.println("Você Recomendou Este Filme para Stephanie Facre.");
							} else if (recomendacao == 5) {
								System.out.println("Você Recomendou Este Filme para Sonia Mary.");
							} else if (recomendacao == 6) {
								System.out.println("Você Recomendou Este Filme para José Ricardo.");
							} else if (recomendacao == 7) {
								System.out.println("Você Recomendou Este Filme para Wilma Therezinha.");
							} else if (recomendacao == 8) {
								System.out.println("Você Recomendou Este Filme para Vitor Rocha.");
							} else if (recomendacao == 9) {
								System.out.println("Você Recomendou Este Filme para Rodrigo Soutinho.");
							} else if (recomendacao == 10) {
								System.out.println("Você Recomendou Este Filme para Luis Fernando.");
							} else if (recomendacao == 11) {
								System.out.println("Você Recomendou Este Filme para Lucas Pinho.");
							} else if (recomendacao == 12) {
								System.out.println("Você Recomendou Este Filme para Louise Pinho.");
							} else if (recomendacao == 13) {
								System.out.println("Você Recomendou Este Filme para Daniel Ruiz.");
							} else if (recomendacao == 14) {
								System.out.println("Você Recomendou Este Filme para Patricia Seguro.");
							}
							
						} else if (avaliacao == 2) {
							contDescurtir++;
							System.out.println("Que Pena Que Não Gostou. =(");
						}					
	
						if(day == 1) {						
							System.out.println("\nGostaria de sugerir algum filme para que coloquemos em nosso catálogo? \n\n1. Sim \n2. Nâo");
							catalogo = sc.nextInt();
							
							if (catalogo == 1) {
								System.out.println("\nQual o filme que gostaria de sugerir?");
								sc.nextLine();
								String sugestao = sc.nextLine();
								System.out.println("\nAgradecemos a sugestão! \n");
							} else if (catalogo == 2) {
								System.out.println("\nAté a próxima! \n");
							}
						} else {
							System.out.println("Sugestões de filmes somente no primeiro dia do mês.");
						}
					}
					
				}
				
				break;
				
			case 14:
				System.out.println("Bem-Vindo Daniel Ruiz, Tudo Bem?");

				Random rddr = new Random();
				int inadimplenciaDanielRuiz = rddr.nextInt(2);
				
				if(inadimplenciaDanielRuiz == 0) {
					System.out.println("\nVerificamos que seu pagamento ainda não consta em nosso sistema. Por gentileza, regularize seu pagamento para que possa ter novamente acesso a sua conta. Obrigado.\n");
				
				} else {						
				
					System.out.println("\nDigite: \n\n1. Informações do Usuário. \n2. Escolha um Filme.");
					escolha = sc.nextInt();
									
					if (escolha == 1) {
						Usuarios usuario14 = new Usuarios("Daniel Ruiz", "126.111.111-11", "Avenida ABC, 111", "daniel.ruiz@usuario.com.br", Pagamento.PIX);
						usuario14.apresentaUsuario();
						long idade14 = usuario14.idade(1960, 11, 2);
						System.out.println("Idade: " + idade14 + "\n\n");
						
					} else if (escolha == 2) {
						System.out.println("Digite: \n\n1. Star Wars: Episódio I - A Ameaça Fantasma. \n2. Como Se Fosse a Primeira Vez. \n3. Jumanji: Bem-vindo à Selva. \n4. Duro de Matar. \n5. O Destino de Uma Nação. \n6. Jobs.");
						int filme = sc.nextInt();
						
						if (filme == 1) {
							Filmes filme1 = new Filmes("Star Wars: Episódio I - A Ameaça Fantasma", 
													   "Obi-Wan e seu mentor embarcam em uma perigosa aventura na tentativa de salvar o planeta das garras de Darth Sidious. Durante a viagem, eles conhecem um habilidoso menino e decidem treiná-lo para se tornar um Jedi. Mas o tempo irá revelar que as coisas nem sempre são o que aparentam ser.",
													   GeneroFilme.FICCAO_CIENTIFICA,
													   "2h16min",
													   "Liam Neeson, Ewan McGregor, Natalie Portman, Jake Lloyd, Ian McDiarmid, Ray Park, Anthony Daniels, Kenny Baker, Pernilla August, Frank Oz",
													   "George Lucas",
													   "LucasFilm Ltd.",
													   "24 de Junho de 1999");
							filme1.apresentaFilme();
							ficcaoCientifica++;
																	
						} else if (filme == 2) {
							Filmes filme2 = new Filmes("Como Se Fosse a Primeira Vez", 
													   "Henry Roth é um veterinário paquerador, que vive no Havaí, e famoso pelo grande número de turistas que conquista. Seu novo alvo é Lucy Whitmore, que mora no local e por quem Henry se apaixona perdidamente. Mas Lucy sofre de falta de memória de curto prazo e, por isso, ela rapidamente se esquece de fatos que acabaram de acontecer. Assim, Henry é obrigado a conquistá-la, dia após dia, para ficar ao seu lado.",
													   GeneroFilme.COMEDIA_ROMANTICA,
													   "1h39min",
													   "Adam Sandler, Drew Barrymore, Rob Schneider, Sean Astin, Lusia Strus, Blake Clark, Dan Aykroyd",
													   "Peter Segal",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");
							filme2.apresentaFilme();
							comediaRomantica++;
																			
						} else if (filme == 3) {
							Filmes filme3 = new Filmes("Jumanji: Bem-vindo à Selva", 
													   "Quatro adolescentes encontram um videogame cuja ação se passa em uma floresta tropical. Empolgados com o jogo, eles escolhem seus avatares para o desafio, mas um evento inesperado faz com que eles sejam transportados para dentro do universo fictício, transformando-os nos personagens da aventura.",
													   GeneroFilme.AVENTURA,
													   "1h59min",
													   "Dwayne Johnson, Kevin Hart, Jack Black, Karen Gillan, Nick Jonas",
													   "Jake Kasdan",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");		
							filme3.apresentaFilme();
							aventura++;
													
						} else if (filme == 4) {
							Filmes filme4 = new Filmes("Duro de Matar", 
													   "O policial de Nova York John McClane está visitando sua família no Natal. Ele participa de uma confraternização de fim de ano na sede da empresa japonesa em que a esposa trabalha. A festa é interrompida por terroristas que invadem o edifício de luxo. McClane não demora a perceber que não há ninguém para salvá-los, a não ser ele próprio.",
													   GeneroFilme.ACAO,
													   "2h12min",
													   "Bruce Willis, Alan Rickman, Bonnie Bedelia, Reginald VelJohnson",
													   "John McTiernan",
													   "20th Century Studios",
													   "22 de Dezembro de 1988");		
							filme4.apresentaFilme();						
							acao++;
													
						} else if (filme == 5) {
							Filmes filme5 = new Filmes("O Destino de Uma Nação", 
													   "Winston Churchill está prestes a encarar um de seus maiores desafios: tomar posse do cargo de primeiro-ministro da Grã-Bretanha. Enquanto isso, ele costura um tratado de paz com a Alemanha nazista que pode significar o fim de anos de conflito.",
													   GeneroFilme.ACAO,
													   "2h05min",
													   "Gary Oldman, Ben Mendelsohn, Kristin Scott Thomas, Lily James, Stephen Dillane, Ronald Pickup",
													   "Joe Wright",
													   "Working Title Films",
													   "11 de Janeiro de 2018");		
							filme5.apresentaFilme();								
							guerra++;
													
						} else if (filme == 6) {
							Filmes filme6 = new Filmes("Jobs", 
													   "Em 1976, Steve Jobs abandonou a faculdade e junto com seu amigo, o gênio da tecnologia Steve Wozniak, iniciaram uma revolução nos computadores com a invenção do Apple 1, o primeiro computador pessoal. Construído na garagem dos pais de Jobs, o Apple 1 e a formação da empresa Apple mudaram o mundo para sempre. Steve Jobs não se incomodava em passar por cima dos outros para atingir suas metas, o que fez com que tivesse dificuldades em manter relações amorosas e de amizade.",
													   GeneroFilme.DRAMA,
													   "2h09min",
													   "Ashton Kutcher, Dermot Mulroney, Josh Gad, Lukas Haas, J.K. Simmons, Lesley Ann Warren, Ron Eldard, Ahna O'Reilly, John Getz, James Woods, Matthew Modine",
													   "Joshua Michael Stern",
													   "The Five Star Institute",
													   "1 de Novembro de 2013");		
							filme6.apresentaFilme();						
							drama++;
													
						}
						
						System.out.println("\nGostou do Filme? \n\nDigite: \n\n1. Curti o Filme. \n2. Não Curti o Filme.");
						int avaliacao = sc.nextInt();
						
						if (avaliacao == 1) {
							contCurtir++;
							System.out.println("Que Bom Que Curtiu! =) \n\nVocê Recomenda Este Filme Para Algum Usuário? \n\n1. Renan Pinho. \n2. Eric Pinho. \n3. Priscila Seguro. \n4. Stephanie Facre. \n5. Sonia Mary. \n6. José Ricardo. \n7. Wilma Therezinha. \n8. Vitor Rocha. \n9. Rodrigo Soutinho. \n10. Luis Fernando. \n11. Lucas Pinho. \n12. Louise Pinho. \n13. Tainah Lima. \n14. Patricia Seguro.");
							recomendacao = sc.nextInt();
							
							if (recomendacao == 1) {
								System.out.println("Você Recomendou Este Filme para Renan Pinho.");
							} else if (recomendacao == 2) {
								System.out.println("Você Recomendou Este Filme para Eric Pinho.");
							} else if (recomendacao == 3) {
								System.out.println("Você Recomendou Este Filme para Priscila Seguro.");
							} else if (recomendacao == 4) {
								System.out.println("Você Recomendou Este Filme para Stephanie Facre.");
							} else if (recomendacao == 5) {
								System.out.println("Você Recomendou Este Filme para Sonia Mary.");
							} else if (recomendacao == 6) {
								System.out.println("Você Recomendou Este Filme para José Ricardo.");
							} else if (recomendacao == 7) {
								System.out.println("Você Recomendou Este Filme para Wilma Therezinha.");
							} else if (recomendacao == 8) {
								System.out.println("Você Recomendou Este Filme para Vitor Rocha.");
							} else if (recomendacao == 9) {
								System.out.println("Você Recomendou Este Filme para Rodrigo Soutinho.");
							} else if (recomendacao == 10) {
								System.out.println("Você Recomendou Este Filme para Luis Fernando.");
							} else if (recomendacao == 11) {
								System.out.println("Você Recomendou Este Filme para Lucas Pinho.");
							} else if (recomendacao == 12) {
								System.out.println("Você Recomendou Este Filme para Louise Pinho.");
							} else if (recomendacao == 13) {
								System.out.println("Você Recomendou Este Filme para Tainah Lima.");
							} else if (recomendacao == 14) {
								System.out.println("Você Recomendou Este Filme para Patricia Seguro.");
							}
							
						} else if (avaliacao == 2) {
							contDescurtir++;
							System.out.println("Que Pena Que Não Gostou. =(");
						}					
	
						if(day == 1) {						
							System.out.println("\nGostaria de sugerir algum filme para que coloquemos em nosso catálogo? \n\n1. Sim \n2. Nâo");
							catalogo = sc.nextInt();
							
							if (catalogo == 1) {
								System.out.println("\nQual o filme que gostaria de sugerir?");
								sc.nextLine();
								String sugestao = sc.nextLine();
								System.out.println("\nAgradecemos a sugestão! \n");
							} else if (catalogo == 2) {
								System.out.println("\nAté a próxima! \n");
							}
						} else {
							System.out.println("Sugestões de filmes somente no primeiro dia do mês.");
						}
					}
					
				}
				
				break;
				
			case 15:
				System.out.println("Bem-Vindo Patricia Seguro, Tudo Bem?");

				Random rdps = new Random();
				int inadimplenciaPatriciaSeguro = rdps.nextInt(2);
				
				if(inadimplenciaPatriciaSeguro == 0) {
					System.out.println("\nVerificamos que seu pagamento ainda não consta em nosso sistema. Por gentileza, regularize seu pagamento para que possa ter novamente acesso a sua conta. Obrigado.\n");
				
				} else {						
				
					System.out.println("\nDigite: \n\n1. Informações do Usuário. \n2. Escolha um Filme.");
					escolha = sc.nextInt();
									
					if (escolha == 1) {
						Usuarios usuario15 = new Usuarios("Patricia Seguro", "127.111.111-11", "Avenida ABC, 110", "patricia.seguro@usuario.com.br", Pagamento.BOLETO);
						usuario15.apresentaUsuario();
						long idade15 = usuario15.idade(1972, 12, 15);
						System.out.println("Idade: " + idade15 + "\n\n");
						
					} else if (escolha == 2) {
						System.out.println("Digite: \n\n1. Star Wars: Episódio I - A Ameaça Fantasma. \n2. Como Se Fosse a Primeira Vez. \n3. Jumanji: Bem-vindo à Selva. \n4. Duro de Matar. \n5. O Destino de Uma Nação. \n6. Jobs.");
						int filme = sc.nextInt();
						
						if (filme == 1) {
							Filmes filme1 = new Filmes("Star Wars: Episódio I - A Ameaça Fantasma", 
													   "Obi-Wan e seu mentor embarcam em uma perigosa aventura na tentativa de salvar o planeta das garras de Darth Sidious. Durante a viagem, eles conhecem um habilidoso menino e decidem treiná-lo para se tornar um Jedi. Mas o tempo irá revelar que as coisas nem sempre são o que aparentam ser.",
													   GeneroFilme.FICCAO_CIENTIFICA,
													   "2h16min",
													   "Liam Neeson, Ewan McGregor, Natalie Portman, Jake Lloyd, Ian McDiarmid, Ray Park, Anthony Daniels, Kenny Baker, Pernilla August, Frank Oz",
													   "George Lucas",
													   "LucasFilm Ltd.",
													   "24 de Junho de 1999");
							filme1.apresentaFilme();
							ficcaoCientifica++;
																	
						} else if (filme == 2) {
							Filmes filme2 = new Filmes("Como Se Fosse a Primeira Vez", 
													   "Henry Roth é um veterinário paquerador, que vive no Havaí, e famoso pelo grande número de turistas que conquista. Seu novo alvo é Lucy Whitmore, que mora no local e por quem Henry se apaixona perdidamente. Mas Lucy sofre de falta de memória de curto prazo e, por isso, ela rapidamente se esquece de fatos que acabaram de acontecer. Assim, Henry é obrigado a conquistá-la, dia após dia, para ficar ao seu lado.",
													   GeneroFilme.COMEDIA_ROMANTICA,
													   "1h39min",
													   "Adam Sandler, Drew Barrymore, Rob Schneider, Sean Astin, Lusia Strus, Blake Clark, Dan Aykroyd",
													   "Peter Segal",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");
							filme2.apresentaFilme();
							comediaRomantica++;
																			
						} else if (filme == 3) {
							Filmes filme3 = new Filmes("Jumanji: Bem-vindo à Selva", 
													   "Quatro adolescentes encontram um videogame cuja ação se passa em uma floresta tropical. Empolgados com o jogo, eles escolhem seus avatares para o desafio, mas um evento inesperado faz com que eles sejam transportados para dentro do universo fictício, transformando-os nos personagens da aventura.",
													   GeneroFilme.AVENTURA,
													   "1h59min",
													   "Dwayne Johnson, Kevin Hart, Jack Black, Karen Gillan, Nick Jonas",
													   "Jake Kasdan",
													   "Columbia Pictures",
													   "13 de Fevereiro de 2004");		
							filme3.apresentaFilme();
							aventura++;
													
						} else if (filme == 4) {
							Filmes filme4 = new Filmes("Duro de Matar", 
													   "O policial de Nova York John McClane está visitando sua família no Natal. Ele participa de uma confraternização de fim de ano na sede da empresa japonesa em que a esposa trabalha. A festa é interrompida por terroristas que invadem o edifício de luxo. McClane não demora a perceber que não há ninguém para salvá-los, a não ser ele próprio.",
													   GeneroFilme.ACAO,
													   "2h12min",
													   "Bruce Willis, Alan Rickman, Bonnie Bedelia, Reginald VelJohnson",
													   "John McTiernan",
													   "20th Century Studios",
													   "22 de Dezembro de 1988");		
							filme4.apresentaFilme();						
							acao++;
													
						} else if (filme == 5) {
							Filmes filme5 = new Filmes("O Destino de Uma Nação", 
													   "Winston Churchill está prestes a encarar um de seus maiores desafios: tomar posse do cargo de primeiro-ministro da Grã-Bretanha. Enquanto isso, ele costura um tratado de paz com a Alemanha nazista que pode significar o fim de anos de conflito.",
													   GeneroFilme.ACAO,
													   "2h05min",
													   "Gary Oldman, Ben Mendelsohn, Kristin Scott Thomas, Lily James, Stephen Dillane, Ronald Pickup",
													   "Joe Wright",
													   "Working Title Films",
													   "11 de Janeiro de 2018");		
							filme5.apresentaFilme();								
							guerra++;
													
						} else if (filme == 6) {
							Filmes filme6 = new Filmes("Jobs", 
													   "Em 1976, Steve Jobs abandonou a faculdade e junto com seu amigo, o gênio da tecnologia Steve Wozniak, iniciaram uma revolução nos computadores com a invenção do Apple 1, o primeiro computador pessoal. Construído na garagem dos pais de Jobs, o Apple 1 e a formação da empresa Apple mudaram o mundo para sempre. Steve Jobs não se incomodava em passar por cima dos outros para atingir suas metas, o que fez com que tivesse dificuldades em manter relações amorosas e de amizade.",
													   GeneroFilme.DRAMA,
													   "2h09min",
													   "Ashton Kutcher, Dermot Mulroney, Josh Gad, Lukas Haas, J.K. Simmons, Lesley Ann Warren, Ron Eldard, Ahna O'Reilly, John Getz, James Woods, Matthew Modine",
													   "Joshua Michael Stern",
													   "The Five Star Institute",
													   "1 de Novembro de 2013");		
							filme6.apresentaFilme();						
							drama++;
													
						}
						
						System.out.println("\nGostou do Filme? \n\nDigite: \n\n1. Curti o Filme. \n2. Não Curti o Filme.");
						int avaliacao = sc.nextInt();
						
						if (avaliacao == 1) {
							contCurtir++;
							System.out.println("Que Bom Que Curtiu! =) \n\nVocê Recomenda Este Filme Para Algum Usuário? \n\n1. Renan Pinho. \n2. Eric Pinho. \n3. Priscila Seguro. \n4. Stephanie Facre. \n5. Sonia Mary. \n6. José Ricardo. \n7. Wilma Therezinha. \n8. Vitor Rocha. \n9. Rodrigo Soutinho. \n10. Luis Fernando. \n11. Lucas Pinho. \n12. Louise Pinho. \n13. Tainah Lima. \n14. Daniel Ruiz.");
							recomendacao = sc.nextInt();
							
							if (recomendacao == 1) {
								System.out.println("Você Recomendou Este Filme para Renan Pinho.");
							} else if (recomendacao == 2) {
								System.out.println("Você Recomendou Este Filme para Eric Pinho.");
							} else if (recomendacao == 3) {
								System.out.println("Você Recomendou Este Filme para Priscila Seguro.");
							} else if (recomendacao == 4) {
								System.out.println("Você Recomendou Este Filme para Stephanie Facre.");
							} else if (recomendacao == 5) {
								System.out.println("Você Recomendou Este Filme para Sonia Mary.");
							} else if (recomendacao == 6) {
								System.out.println("Você Recomendou Este Filme para José Ricardo.");
							} else if (recomendacao == 7) {
								System.out.println("Você Recomendou Este Filme para Wilma Therezinha.");
							} else if (recomendacao == 8) {
								System.out.println("Você Recomendou Este Filme para Vitor Rocha.");
							} else if (recomendacao == 9) {
								System.out.println("Você Recomendou Este Filme para Rodrigo Soutinho.");
							} else if (recomendacao == 10) {
								System.out.println("Você Recomendou Este Filme para Luis Fernando.");
							} else if (recomendacao == 11) {
								System.out.println("Você Recomendou Este Filme para Lucas Pinho.");
							} else if (recomendacao == 12) {
								System.out.println("Você Recomendou Este Filme para Louise Pinho.");
							} else if (recomendacao == 13) {
								System.out.println("Você Recomendou Este Filme para Tainah Lima.");
							} else if (recomendacao == 14) {
								System.out.println("Você Recomendou Este Filme para Daniel Ruiz.");
							}
							
						} else if (avaliacao == 2) {
							contDescurtir++;
							System.out.println("Que Pena Que Não Gostou. =(");
						}					
	
						if(day == 1) {						
							System.out.println("\nGostaria de sugerir algum filme para que coloquemos em nosso catálogo? \n\n1. Sim \n2. Nâo");
							catalogo = sc.nextInt();
							
							if (catalogo == 1) {
								System.out.println("\nQual o filme que gostaria de sugerir?");
								sc.nextLine();
								String sugestao = sc.nextLine();
								System.out.println("\nAgradecemos a sugestão! \n");
							} else if (catalogo == 2) {
								System.out.println("\nAté a próxima! \n");
							}
						} else {
							System.out.println("Sugestões de filmes somente no primeiro dia do mês.");
						}
					}
					
				}
				
				break;
				
			default:
				break;				
			} 
		}
		
		System.out.println("Houveram: \n\n" + contCurtir + " Curtidas. \n" + contDescurtir + " Descurtidas.");
		System.out.println("Lista de Gênero x Usuário: \n\n" + "Ficção Científica: " + ficcaoCientifica + "\nComedia Romantica: " + comediaRomantica + "\nAventura: " + aventura + "\nAção: " + acao + 
						   "\nGuerra: " + guerra + "\nDrama: " + drama);	
			
	}	
}