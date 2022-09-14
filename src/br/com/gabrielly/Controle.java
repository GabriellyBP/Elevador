package br.com.gabrielly;

/*
Classe Elevador com andar onde ele está e quantas pessoas dentro dele. 
Ele sempre inicializa no térreo e vazio. Métodos inicializa, sobe (um andar), 
desce (um andar), entra (uma pessoa), sai (uma pessoa). 
A classe Controle tem 4 elevadores e botões para chamá-los como acharem 
necessário e deve manter quantos andares têm no prédio
 */
import static java.lang.Thread.sleep;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controle {

    public static void main(String[] args) {
        boolean escolhaAcao = false, escolhaElevador = true;
        int chamaElevador, numeroBotao, elevadorEscolhido = -1;
        Scanner sc = new Scanner(System.in);

        //Iniciacao dos array de elevadores.
        Elevador elevador[] = new Elevador[4];
        elevador[0] = new Elevador(1, 0, 0);
        elevador[1] = new Elevador(2, 0, 0);
        elevador[2] = new Elevador(3, 0, 0);
        elevador[3] = new Elevador(4, 0, 0);

        //Laco de repeticao, efetuar tudo que esta dentro do while desde que a condicao seja verdadeira.
        Botoeira.btnSolitarElevador();
        chamaElevador = sc.nextInt();
        while (escolhaElevador) {
            switch (chamaElevador) {
                case 1:
                    elevadorEscolhido = Botoeira.chamaElevador(elevador[0], elevador[1], elevador[2], elevador[3]);
                    if (elevadorEscolhido == 5) {
                        escolhaAcao = false;
                        System.out.printf("\n\n Elevadores Ocupado! ");
                    } else {
                        escolhaAcao = true;
                    }
                    break;
                case 0:
                    break;
                default:
                    break;
            }
            while (escolhaAcao) {
                Botoeira.menu();
                numeroBotao = sc.nextInt();
                System.out.printf("\n\n");
                switch (numeroBotao) {
                    case 1:
                        Botoeira.subirAndar(elevador[elevadorEscolhido]);
                        break;
                    case 2:
                        Botoeira.descerAndar(elevador[elevadorEscolhido]);
                        break;
                    case 3:
                        Botoeira.entrarPessoa(elevador[elevadorEscolhido]);
                        break;
                    case 4:
                        Botoeira.sairPessoa(elevador[elevadorEscolhido]);
                        break;
                    case 5:
                        Botoeira.statusElevador(elevador[elevadorEscolhido]);
                        break;
                    case 6:
                        escolhaAcao = false;
                        System.out.printf("\n\n Chamando elevador!");
                         {
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;

                    case 7:
                        escolhaAcao = false;
                        escolhaElevador = false;
                        System.out.printf("\n\n Saindo dos Elevadores!");
                        break;
                    default:
                        System.out.println("\n --> Opção Incorreta <--");
                        break;
                }
            }
        }

    }
}
