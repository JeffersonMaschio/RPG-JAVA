import java.util.Scanner;

public class Story {
    Scanner scan = new Scanner(System.in);

    Role role;
    public Story(Role role) {
        this.role = role;
    }
//---------------------------------------------------------------
    boolean corrNam = false;
//---------------------------------------------------------------
    public void opening() {
        System.out.println("[GENERIC HERO] (T-RPG)");
        System.out.println("\nDesejas jogar [GENERIC HERO]? - S/N");
        System.out.print("\n> ");
        String opc_op = scan.next().toLowerCase();
        
        if (opc_op.equals("s")) {
            System.out.println("\nSEJA BEM-VINDO AO MUNDO DE THURFEND");
            do {
                System.out.println("\nQUAL SERÁ O NOME DO HERÓI QUE PARTICIPARÁ DE CANTIGAS DE BARDOS?");
                System.out.print("\n> ");
                role.name = scan.next();
                System.out.println("\nSEU NOME ESTÁ CORRETO? S/N");
                System.out.print("\n> ");
                String CorrectName = scan.next().toLowerCase();
                if (CorrectName.equals("s")){
                    corrNam = false;
                }
                else if (CorrectName.equals("n")){
                    corrNam = true;
                }    
            } while(corrNam);
            
            System.out.println("\n"+role.name+"? BELO NOME. PORÉM, SÓ COM NOME NÃO SE DERROTA O MAL. ENTÃO, QUAL É SEU ESTILO DE COMBATE?");

            role.escolherClasse(); 
            
        }
        else if (opc_op.equals("n")) {
            System.out.println("ADEUS");
            System.exit(1);
        }
    }
    
//---------------------------------------------------------------
    public void introduction() {
        //  fazer um "tutorial" (talvez em um posto avançado), com mêcanicas de: encontro(), fight(), recomepnsas,
        //entre outras.
        //  sugerir próximo local a ir (nomes de cidades (pedir à terceiros)) + eventos aleatórios durante viajens. 
        role.ZaWardo();
        System.out.println("\nEstá tudo preto, você não enxerga nada. até que se percebe em um abismo, sem sons, sensações, somente sua angustia que não te abandona não importa o que você faça. até que derepente, de onde você assimila ser uma direção que remeta para cima, surge um raio de luz, que almenta cada e cada vez mais, e a partir do nada você consegue distiguir algo, uma voz, parece estar te chamando... "+role.name+"!!");
        System.out.println("Você acorda, com um soldado apontando uma tocha para o seu rosto e te balançando para acorda-lo.");
        System.out.println("Quando você recobra seus pensamentos você se lembra, estava em um posto avançado do império para defender a fronteira contra os monstros que o imperador havia sonhado com seu dom de precognição.");
        System.out.println("O soldado te apressa para que se levante e se prepare para a batalha que já houvera se iniciado.");
        role.ZaWardo();
        System.out.println("\nMecânicas: ");
        System.out.println("Você utiliza de comandos pré-determinados com o teclado,digitando sua intenção e precionando [Enter] para enviar o comando. vamos à prática");
        role.ZaWardo();
    
    }
//---------------------------------------------------------------
    public void primeiroAto() {
        //[obrigatoriamente perder no tutorial, ser nocauteado, ser levado pelos inimigos, alguem te salvar]acordar numa floresta, ouvir barulhos, seguir até o acampamento de guerra/posto avançado, começar tutorial
    }
//---------------------------------------------------------------

//---------------------------------------------------------------

//---------------------------------------------------------------

//---------------------------------------------------------------

}
/*
IDEIAS:

- tela inicial ##
    L> escolher nome ##
- escolher classe


- ## gerar um monstro
- ## encontro com monstros
    ## L> interface de batalha
    ## L> interface de espólio / derrota

- cidades
- viajem
    L> chance de algo acontecer

- descanso
    L> estabelecimentos
    L> ao ar livre


---------------------------------|
<cidade inicial>
- acampamento de guerra/posto avançado
- general - guia de introducao
                 L> 1º combate
                 L> acoes basicas

---------------------------------|
TIRAR TEMPORARIAMENTE:
- por ora, tirar melle de "arqueiro"
- escolher 1 aliado

________________________________________

INTERFACE DE ENCONTRO
|----------------|
|  Fight     Bag |
|                |
|  Swap      Run |
|----------------|

INTERFADE DE LUTA
|----------------|
|  Hab1     Hab2 |
|                |
|  Hab3     Back |
|----------------|

//MAGO
mago_hpmax = 12;
mago_hab1 = 6;
mago_hab2 = 9; (6 * 1.5)
mago_hab3 = 15;

//CAVALEIRO
cavaleiro_hpmax = 20;
cavaleiro_hab1 = 10;
cavaleiro_hab2 = 15; (12 + 3)
cavaleiro_hab3 = 20;

//ARQUEIRO
arqueiro_hpmax = 16;
arqueiro_hab1 = 9;
arqueiro_hab2 = 12; (9 + 3)
arqueiro_hab3 = 18;
*/

