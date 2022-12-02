package projetop.rova;

import java.util.Scanner;

public class ProjetoPRova {

    public static void main(String[] args) {

        int destino = 0, hotel = 0, duracao = 0, transporte = 0, refeicao = 0, continuar = 0;
        double vhotel = 0, vduracao = 0, vtransporte = 0, vtotal = 0, vrefeicao = 0;
        String vdestino = "n", dhotel = "n", dduracao = "n", dtransporte = "n",
                drefeicao = "n", nome;

            Scanner teclado = new Scanner(System.in);
            
                
                do {
                    System.out.println("-------------------------------------------------");
                    System.out.println("            Agência Viagem Mágica               ");
                    System.out.println("-------------------------------------------------");

                    System.out.println("\n A Agência Viagem Mágica é uma empressa que tem como missão te levar para lugares que você nunca imaginou ser possível.");
                    System.out.println(" Agência Viagem Mágica, te levando da realidade para ficção.");
                    
                    
                    System.out.println(" \n - Como você se chama: ");
                    
                    nome = teclado.next();
                    System.out.println("\n-----------------------------------------------");
                    System.out.println(" Monte seu pacote aqui " + nome);
                    System.out.println("-----------------------------------------------");
                    System.out.println("\n ° " + nome + ", qual o seu destino? ");
                    System.out.println("(1) Terra-Média;");
                    System.out.println("(2) Hogwarts;");
                    System.out.println("(3) Tatooine;");
                    System.out.println("(4) Não desejo viajar.");
                    System.out.print("Digite o número do seu destino: ");
                    destino = teclado.nextInt();

                    if (destino == 1) {
                        System.out.println("\n- Sua escolha foi: Terra-Média");
                        vdestino = "Terra-Média";

                        System.out.println("-------------------------------------------------");
                        System.out.println("\n ° " + nome + ", qual o hotel de sua preferência? ");
                        System.out.println("(1) Hotel Bolseiro: 3000.0 reais.");
                        System.out.println("(2) Pousada Montanha da Perdição: 1000.00 reais.");
                        System.out.println("(3) Taberna Pônei Saltitante: 500.00 reais.");
                        System.out.print("Digite o número do hotel escolhido: ");
                        hotel = teclado.nextInt();
                        if (hotel == 1) {
                            System.out.println("\n - O hotel da sua escolha é: Hotel Bolseiro. ");
                            vhotel = 3000.00;
                            dhotel = "Hotel Bolseiro";
                        } else if (hotel == 2) {
                            System.out.println("\n - O hotel da sua escolha é: Pousada Montanha da Perdição. ");
                            vhotel = 1000.00;
                            dhotel = "Pousada Montanha da Perdição";
                        } else if (hotel == 3) {
                            System.out.println("\n - O hotel da sua escolha é: Taberna Pônei Saltitante. ");
                            vhotel = 500.00;
                            dhotel = "Taberna Pônei Saltitante";
                        }

                        System.out.println("-------------------------------------------------");
                        System.out.println("\n ° " + nome + ", quantos dias vai durar a viagem? ");
                        System.out.println("(1) 5  dias : 1000.00  reais");
                        System.out.println("(2) 10 dias : 2000.00  reais");
                        System.out.println("(3) 15 dias : 3000.00  reais");
                        System.out.print("Digite a opção da duração da viagem: ");
                        duracao = teclado.nextInt();
                        if (duracao == 1) {
                            System.out.println("\n - A duração da viagem é de: 5 dias.");
                            vduracao = 1000.00;
                            dduracao = "5 dias";
                        } else if (duracao == 2) {
                            System.out.println("\n - A duração da viagem é de: 10 dias.");
                            vduracao = 2000.00;
                            dduracao = "10 dias";
                        } else if (duracao == 3) {
                            System.out.println("\n - A duração da viagem é de: 15 dias.");
                            vduracao = 3000.00;
                            dduracao = "15 dias";
                        }

                        System.out.println("-------------------------------------------------");
                        System.out.println("\n ° " + nome + ", você quer uma opção de pacote de refeição para sua viagem?(opicional)");
                        System.out.println("\n(1) Básico: Apenas Café da manhã( Pão, queijos, ovos, bacon, presnunto, leite, café, sucos de fruta) 500.00 reais;");
                        System.out.println("\n(2) Intermédiario: Café da manhã( Pão, queijos, ovos, bacon, presnunto, leite, café, sucos de fruta, refrigerante),");
                        System.out.println("                     Almoço(Arroz, feijão, macarrão, salada, carne, frango, peixe,sucos de fruta, refrigerante) 1000.00 reais);");
                        System.out.println("\n(3) Plus: Café da manhã ( Pão, queijos, ovos, bacon, presnunto, leite, café, sucos de fruta),");
                        System.out.println("            Almoço (Arroz, feijão, macarrão, salada, carne, frango, peixe,sucos de fruta, refrigerante),");
                        System.out.println("            Jnatar ( Pão, queijos, ovos, bacon, presnunto, leite, café, sucos de fruta, refrigerente, bebidas alcoólicas) 2000.00 reais.)");
                        System.out.println("\n(4) Não quero o pacote de refição.");
                        System.out.print("\nDigite a opção da duração da viagem: ");
                        refeicao = teclado.nextInt();
                        if (refeicao == 1) {
                            System.out.println("\n - Sua escolha de pacote de refeição foi: Básico.");
                            vrefeicao = 500.00;
                            drefeicao = "Básico,";
                        } else if (refeicao == 2) {
                            System.out.println("\n - Sua escolha de pacote de refeição foi: Intermediário.");
                            vrefeicao = 1000.00;
                            drefeicao = "Intemediário,";
                        } else if (refeicao == 3) {
                            System.out.println("\n - Sua escolha de pacote de refeição foi: Plus.");
                            vrefeicao = 2000.00;
                            drefeicao = "Plus,";
                        } else if (refeicao == 4) {
                            System.out.println("\n - Sua escolha de pacote de refeição foi: Não quero o pacote de refição.");
                            vrefeicao = 0.00;
                            drefeicao = "Não quero pacote de refeição,";
                        }

                        System.out.println("-------------------------------------------------");
                        System.out.println("\n ° " + nome + ", qual transporte você deseja? ");
                        System.out.println("(1) Barco: 500.00  reais.");
                        System.out.println("(2) Cavalos: 200.00  reais.");
                        System.out.println("(3) Eco trilha(à pé): 100.00  reais.");
                        System.out.print("Digite o número do transporte escolhido: ");
                        transporte = teclado.nextInt();
                        if (transporte == 1) {
                            System.out.println("\n - O Transporte de sua escolha é: Barco. ");
                            vtransporte = 500;
                            dtransporte = " Barco";
                        } else if (transporte == 2) {
                            System.out.println("\n - O Transporte da sua escolha é: Cavalo. ");
                            vtransporte = 200.00;
                            dtransporte = " Cavalo";
                        } else if (transporte == 3) {
                            System.out.println("\n - O Transporte da sua escolha é: Eco trilha(à pé). ");
                            vtransporte = 100.00;
                            dtransporte = " Eco trilha";

                        }

                        System.out.println("\n-----------------------------------------------");
                        System.out.println("°Descrição do seu pacote pacote R$ " + nome);
                        System.out.println("-------------------------------------------------");
                        System.out.println("O destino escolhido foi: " + vdestino + ";");
                        System.out.println("O hotel escolhido foi: " + dhotel + ", valor " + vhotel + " reais;");
                        System.out.println("A duração da viagem é de: " + dduracao + "," + " valor " + vduracao + " reais;");
                        System.out.println("O transporte escolhido para a viagem foi: " + dtransporte + ", valor " + vtransporte + " reais;");
                        System.out.println("A opção de pacote de refeição foi: " + drefeicao + " valor " + vrefeicao + " reais;");
                        vtotal = vhotel + vduracao + vtransporte + vrefeicao;
                        System.out.println("\n- O valor total a ser pago pela viagem é de : " + vtotal + " reais;");
                        System.out.println("\n- " + nome + ", agradecemos a preferência e lhe desejamos um momento mágico.");
                        System.out.println("\n-------------------------------------------------");

                    } else if (destino == 2) {
                        System.out.println("\n- Sua escolha foi: Hogwarts.");
                        vdestino = "Hogwarts";
                        System.out.println("-------------------------------------------------");
                        System.out.println("\n ° " + nome + ", qual a Casa de sua preferência? ");
                        System.out.println("(1) Grifinória: 3000.00  reais.");
                        System.out.println("(2) Sonserina: 2000.00 reais.");
                        System.out.println("(3) Lufa-Lufa: 1000.00 reais.");
                        System.out.println("(4) Corvinal: 1000.00 reais");
                        System.out.print("Digite o número da casa escolhida: ");
                        hotel = teclado.nextInt();
                        if (hotel == 1) {
                            System.out.println("\n - A Casa da sua escolha é: Grifinória. ");
                            vhotel = 3000.00;
                            dhotel = "Grifinória";
                        } else if (hotel == 2) {
                            System.out.println("\n - A Casa da sua escolha é: Sonserina. ");
                            vhotel = 2000.00;
                            dhotel = "Sonserina";
                        } else if (hotel == 3) {
                            System.out.println("\n - A Casa da sua escolha é: Lufa-Lufa. ");
                            vhotel = 1000.00;
                            dhotel = "Lufa-Lufa";
                        } else if (hotel == 4) {
                            System.out.println("\n - A Casa da sua escolha é: Corvinal. ");
                            vhotel = 1000.00;
                            dhotel = "Corvinal";
                        }

                        System.out.println("-------------------------------------------------");
                        System.out.println("\n ° " + nome + ", quantos dias vai durar a viagem? ");
                        System.out.println("(1) 5  dias : 500.00  reais.");
                        System.out.println("(2) 10 dias : 1000.00  reais.");
                        System.out.println("(3) 15 dias : 2000.00  reais.");
                        System.out.print("Digite a opção da duração da viagem: ");
                        duracao = teclado.nextInt();
                        if (duracao == 1) {
                            System.out.println("\n - A duração da viagem é de: 5 dias. ");
                            vduracao = 500.00;
                            dduracao = "5 dias";
                        } else if (duracao == 2) {
                            System.out.println("\n - A duração da viagem é de: 10 dias. ");
                            vduracao = 1000.00;
                            dduracao = "10 dias";
                        } else if (duracao == 3) {
                            System.out.println("\n - A duração da viagem é de: 15 dias. ");
                            vduracao = 2000.00;
                            dduracao = "15 dias";
                        }

                        System.out.println("-------------------------------------------------");
                        System.out.println("\n ° " + nome + ", você quer uma opção de pacote de refeição para sua viagem?(opicional)");
                        System.out.println("\n(1) Básico: Apenas Café da manhã( Pão, queijos, ovos, bacon, presnunto, leite, café, sucos de fruta) 500.00 reais;");
                        System.out.println("\n(2) Intermédiario: Café da manhã( Pão, queijos, ovos, bacon, presnunto, leite, café, sucos de fruta, refrigerante),");
                        System.out.println("                     Almoço(Arroz, feijão, macarrão, salada, carne, frango, peixe,sucos de fruta, refrigerante) 1000.00 reais);");
                        System.out.println("\n(3) Plus: Café da manhã ( Pão, queijos, ovos, bacon, presnunto, leite, café, sucos de fruta),");
                        System.out.println("            Almoço (Arroz, feijão, macarrão, salada, carne, frango, peixe,sucos de fruta, refrigerante),");
                        System.out.println("            Jnatar ( Pão, queijos, ovos, bacon, presnunto, leite, café, sucos de fruta, refrigerente, bebidas alcoólicas) 2000.00 reais.)");
                        System.out.println("\n(4) Não quero o pacote de refição.");
                        System.out.print("\nDigite a opção da duração da viagem: ");
                        refeicao = teclado.nextInt();
                        if (refeicao == 1) {
                            System.out.println("\n - Sua escolha de pacote de refeição foi: Básico.");
                            vrefeicao = 500.00;
                            drefeicao = "Básico,";
                        } else if (refeicao == 2) {
                            System.out.println("\n - Sua escolha de pacote de refeição foi: Intermediário.");
                            vrefeicao = 1000.00;
                            drefeicao = "Intemediário,";
                        } else if (refeicao == 3) {
                            System.out.println("\n - Sua escolha de pacote de refeição foi: Plus.");
                            vrefeicao = 2000.00;
                            drefeicao = "Plus,";
                        } else if (refeicao == 4) {
                            System.out.println("\n - Sua escolha de pacote de refeição foi: Não quero o pacote de refição.");
                            vrefeicao = 0.00;
                            drefeicao = "Não quero pacote de refeição,";
                        }

                        System.out.println("-------------------------------------------------");
                        System.out.println("\n ° " + nome + ", qual transporte você deseja? ");
                        System.out.println("(1) Vassoura: 300.00  reais.");
                        System.out.println("(2) Portal: 600.00  reais.");
                        System.out.println("(3) Expresso Hogwarts: 1000.00  reais.");
                        System.out.print("Digite o número do transporte escolhido: ");
                        transporte = teclado.nextInt();
                        if (transporte == 1) {
                            System.out.println("\n - O Transporte de sua escolha é: Vassoura.");
                            vtransporte = 300.00;
                            dtransporte = "Vassoura";
                        } else if (transporte == 2) {
                            System.out.println("\n - O Transporte da sua escolha é: Portal.");
                            vtransporte = 600.00;
                            dtransporte = "Portal";
                        } else if (transporte == 3) {
                            System.out.println("\n - O Transporte da sua escolha é: Expresso Hogwarts.");
                            vtransporte = 1000.00;
                            dtransporte = "Expresso Hogwarts";

                        }
                        System.out.println("\n-----------------------------------------------");
                        System.out.println("°Descrição do seu pacote pacote R$ " + nome);
                        System.out.println("-------------------------------------------------");
                        System.out.println("O destino escolhido foi: " + vdestino + ";");
                        System.out.println("O hotel escolhido foi: " + dhotel + ", valor " + vhotel + " reais;");
                        System.out.println("A duração da viagem é de: " + dduracao + "," + " valor " + vduracao + " reais;");
                        System.out.println("O transporte escolhido para a viagem foi: " + dtransporte + ", valor " + vtransporte + " reais;");
                        System.out.println("A opção de pacote de refeição foi: " + drefeicao + " valor " + vrefeicao + " reais;");
                        vtotal = vhotel + vduracao + vtransporte + vrefeicao;
                        System.out.println("\n- O valor total a ser pago pela viagem é de : " + vtotal + " reais;");
                        System.out.println("\n- " + nome + ", agradecemos a preferência e lhe desejamos um momento mágico.");
                        System.out.println("\n-------------------------------------------------");

                    } else if (destino == 3) {
                        System.out.println("\n- " + nome + ", sua escolha foi: Tatooine.");
                        vdestino = "Tatooine";
                        System.out.println("-------------------------------------------------");
                        System.out.println("\n ° Qual o hotel de sua preferência? ");
                        System.out.println("(1) Rancho Skywalker: 700.00 reais.");
                        System.out.println("(2) Pousada Mos Espa: 1500.00 reais.");
                        System.out.println("(3) Palácio de Jabba: 3000.00 reais.");
                        System.out.print("Digite o número do hotel escolhido: ");
                        hotel = teclado.nextInt();
                        if (hotel == 1) {
                            System.out.println("\n - O hotel da sua escolha é: Rancho Skywalker.");
                            vhotel = 700.00;
                            dhotel = "Rancho Skywalker";
                        } else if (hotel == 2) {
                            System.out.println("\n - O hotel da sua escolha é: Pousada Mos Espa.");
                            vhotel = 1500.00;
                            dhotel = "Pousada Mos Espa";
                        } else if (hotel == 3) {
                            System.out.println("\n - O hotel da sua escolha é: Palácio de Jabba.");
                            vhotel = 3000.00;
                            dhotel = "Palácio de Jabba";
                        }
                        System.out.println("-------------------------------------------------");
                        System.out.println("\n ° " + nome + ", quantos dias vai durar a viagem? ");
                        System.out.println("(1) 5  dias : 1000.00  reais.");
                        System.out.println("(2) 10 dias : 2000.00  reais.");
                        System.out.println("(3) 15 dias : 3000.00  reais.");
                        System.out.print("Digite o número do seu destino: ");
                        duracao = teclado.nextInt();
                        if (duracao == 1) {
                            System.out.println("\n - A duração da viagem é de: 5 dias.");
                            vduracao = 1000.00;
                            dduracao = "5 dias";
                        } else if (duracao == 2) {
                            System.out.println("\n - A duração da viagem é de: 10 dias.");
                            vduracao = 2000.00;
                            dduracao = "10 dias";
                        } else if (duracao == 3) {
                            System.out.println("\n - A duração da viagem é de: 15 dias.");
                            vduracao = 3000.00;
                            dduracao = "15 dias";
                        }

                        System.out.println("-------------------------------------------------");
                        System.out.println("\n ° " + nome + ", você quer uma opção de pacote de refeição para sua viagem?(opicional)");
                        System.out.println("\n(1) Básico: Apenas Café da manhã( Pão, queijos, ovos, bacon, presnunto, leite, café, sucos de fruta) 500.00 reais;");
                        System.out.println("\n(2) Intermédiario: Café da manhã( Pão, queijos, ovos, bacon, presnunto, leite, café, sucos de fruta, refrigerante),");
                        System.out.println("                     Almoço(Arroz, feijão, macarrão, salada, carne, frango, peixe,sucos de fruta, refrigerante) 1000.00 reais);");
                        System.out.println("\n(3) Plus: Café da manhã ( Pão, queijos, ovos, bacon, presnunto, leite, café, sucos de fruta),");
                        System.out.println("            Almoço (Arroz, feijão, macarrão, salada, carne, frango, peixe,sucos de fruta, refrigerante),");
                        System.out.println("            Jnatar ( Pão, queijos, ovos, bacon, presnunto, leite, café, sucos de fruta, refrigerente, bebidas alcoólicas) 2000.00 reais.)");
                        System.out.println("\n(4) Não quero o pacote de refição.");
                        System.out.print("\nDigite a opção da duração da viagem: ");
                        refeicao = teclado.nextInt();
                        if (refeicao == 1) {
                            System.out.println("\n - Sua escolha de pacote de refeição foi: Básico.");
                            vrefeicao = 500.00;
                            drefeicao = "Básico,";
                        } else if (refeicao == 2) {
                            System.out.println("\n - Sua escolha de pacote de refeição foi: Intermediário.");
                            vrefeicao = 1000.00;
                            drefeicao = "Intemediário,";
                        } else if (refeicao == 3) {
                            System.out.println("\n - Sua escolha de pacote de refeição foi: Plus.");
                            vrefeicao = 2000.00;
                            drefeicao = "Plus,";
                        } else if (refeicao == 4) {
                            System.out.println("\n - Sua escolha de pacote de refeição foi: Não quero o pacote de refição.");
                            vrefeicao = 0.00;
                            drefeicao = "Não quero pacote de refeição,";
                        }

                        System.out.println("-------------------------------------------------");
                        System.out.println("\n ° " + nome + ", qual transporte você deseja? ");
                        System.out.println("(1) Millennium Falcon : 1300.00 reais.");
                        System.out.println("(2) Tie Fighter : 2000.00  reais.");
                        System.out.println("(3) X-Wing : 3000.00 reais.");
                        System.out.print("Digite o número do transporte escolhido: ");
                        transporte = teclado.nextInt();
                        if (transporte == 1) {
                            System.out.println("\n - O Transporte de sua escolha é: Millennium Falcon.");
                            vtransporte = 1300.00;
                            dtransporte = "Millennium Falcon";
                        } else if (transporte == 2) {
                            System.out.println("\n - O Transporte da sua escolha é: Tie Fighter.");
                            vtransporte = 2000.00;
                            dtransporte = "Tie Fighter";
                        } else if (transporte == 3) {
                            System.out.println("\n - O Transporte da sua escolha é: X-Wing.");
                            vtransporte = 3000.00;
                            dtransporte = "X-Wing";
                        }
                        System.out.println("\n-----------------------------------------------");
                        System.out.println("°Descrição do seu pacote pacote R$ " + nome);
                        System.out.println("-------------------------------------------------");
                        System.out.println("O destino escolhido foi: " + vdestino + ";");
                        System.out.println("O hotel escolhido foi: " + dhotel + ", valor " + vhotel + " reais;");
                        System.out.println("A duração da viagem é de: " + dduracao + "," + " valor " + vduracao + " reais;");
                        System.out.println("O transporte escolhido para a viagem foi: " + dtransporte + ", valor " + vtransporte + " reais;");
                        System.out.println("A opção de pacote de refeição foi: " + drefeicao + " valor " + vrefeicao + " reais;");
                        vtotal = vhotel + vduracao + vtransporte + vrefeicao;
                        System.out.println("\n- O valor total a ser pago pela viagem é de : " + vtotal + " reais;");
                        System.out.println("\n- " + nome + ", agradecemos a preferência e lhe desejamos um momento mágico.");
                        System.out.println("\n-------------------------------------------------");

                    } else if (destino == 4) {
                        System.out.println("- Sua escolha foi: Não desejo viajar.");
                        System.out.println("- " + nome + ", vamos deixar para a próxima oportunidade, agradecemos pela atenção.");
                        break;
                    }       
            System.out.println("- Deseja deseja fazer um novo pacote [S = 1/N = 2]: ");
            continuar = teclado.nextInt();   

        }while(continuar == 1);
                
        while(continuar == 1 || continuar != 2){
        System.out.println("Resposta invalida, pro favor digitar 1 ou 2");
        continuar = teclado.nextInt();
        }
        
    }

}
