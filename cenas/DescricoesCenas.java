package projetoblocoum.cenas;

import projetoblocoum.RpgMain;

public class DescricoesCenas extends RpgMain {

    public static final Cenas ACENDER_LUZES = new Cenas(
            "Puxa vida.",
            "Você tenta acender as luzes, mas elas não acendem. \n",
            "Tentar acender as luzes"
    );

    public static Cenas GRITAR_POR_AJUDA = new Cenas(
            "Socorro!",
            "Você decide gritar por ajuda na esperança de que alguém possa ouvir e vir em seu socorro. \n",
            "Gritar por ajuda"
    );

    public static Cenas NINGUEM_RESPONDE = new Cenas(
            "Silêncio.",
            "Você grita por ajuda, mas ninguém responde. O que você faz? \n",
            "Ninguém Responde"
    );

    public static Cenas EXPLORAR_QUARTO = new Cenas(
            "Um ato de coragem.",
            "\nVocê decide explorar o quarto onde acordou. Você vê um espelho na parede, um armário e uma porta " +
                    "\ntrancada por um cadeado. " +
                    "\nO que deseja ver primeiro? \n",
            "Explorar o quarto"
    );

    public static Cenas CHECAR_PORTA = new Cenas(
            "Atitude.",
            "Você tenta abrir a porta trancada, mas ela não cede. O que você faz? \n",
            "Tentar abrir a porta"
    );

    public static Cenas CHECAR_ESPELHO = new Cenas(
            "Espelho, espelho meu.",
            "\nVocê se aproxima do espelho e começa a observá-lo. Ao olhar atrás do espelho, observa que há um botão " +
                    "\nestranho e decide apertá-lo. Após isso, um mecanismo abre o que parece ser um alçapão embaixo de você." +
                    "\nCom sua curiosidade despertada, você decide descer pelo alçapão. \n",
            "Checar o espelho."
    );

    public static Cenas CHECAR_ARMARIO = new Cenas(
            "Curiosidade.",
            "\nVocê decide procurar no armário por alguma pista sobre o lugar. Ao abrí-lo, você encontra um bilhete " +
                    "\ne uma chave antiga, que pode ser a chave do cadeado da porta onde você está. " +
                    "\nVocê pega o bilhete ou a chave?\n",
            "Checar o amário."
    );

    public static Cenas PROCURAR_CHAVE = new Cenas(
            "Chaveiro.",
            "\nVocê decide procurar no armário por algo para abrir a porta. Ao abrí-lo, você encontra um bilhete" +
                    "\ne uma chave antiga, que se parece com a fechadura da porta. " +
                    "\nVocê pega o bilhete ou a chave? \n",
            "Procurar uma chave"
    );

    public static Cenas PEGAR_BILHETE = new Cenas(
            "Intrigante...",
            "\nO bilhete diz assim: \nOlá, " + NOME + ". Tenho te observado há algum tempo e eu gostaria de fazer um teste " +
                    "\ncom você. Há um segredo escondido nesta casa. Todavia, você tem a chave em sua frente." +
                    "\nVocê tem a opção entre de para descobrir o segredo ou ir embora da casa. Entretanto, " +
                    "\ncaso decida ficar, você irá se deparar com desafios e escolhas, que possuem suas consequências. \n" +
                    "\nO que você quer fazer? \n",
            "Pegar o bilhete"
    );

    public static Cenas PROCURAR_MISTERIOS = new Cenas(
            "Você decide ver aonde aquilo te levaria.",
            "\nVocê guarda a chave e decide explorar os mistérios do local. Enquanto examina o quarto, " +
                    "\nsua atenção é atraída para o espelho no canto do cômodo. Você se lembra das anotações perturbadoras " +
                    "\nque encontrou no bilhete e decide examiná-lo. Ao se aproximar dele, você acidentalmente pressiona " +
                    "\num mecanismo oculto no chão. O espelho desliza para o lado, revelando um alçapão secreto. " +
                    "\nCom sua curiosidade despertada, você decide descer pelo alçapão.\n",
            "Procurar os mistérios"
    );

    public static Cenas EMBAIXO_ALCAPAO = new Cenas(
            "Ambiente sinistro",
            "\nAo descer, você se encontra em um labirinto de corredores sombrios e estreitos. As paredes parecem " +
                    "\nse mover e mudar de forma à medida que você avança, tornando cada vez mais difícil encontrar uma " +
                    "\nsaída. Você ouve ruídos estranhos e murmúrios ao seu redor, enquanto as sombras dançam pelas " +
                    "\nparedes, geradas pela pouca iluminação do local. \nVocê se vê diante de três caminhos: \n",
            "Descer pelo alçapão"
    );

    public static Cenas CAMINHO_ESCURIDAO = new Cenas(
            "Não consigo enxergar nada!",
            "\nÀ esquerda, há um corredor que parece levar a uma escuridão profunda. Você não consegue ver nada " +
                    "\nalém dos primeiros metros. O que você faz? \n",
            "Caminho da escuridão profunda"
    );

    public static Cenas CAMINHO_ESCULTURAS = new Cenas(
            "Que estranho...!",
            "\nÀ sua frente, você nota um corredor com estranhas esculturas nas paredes. As esculturas têm " +
                    "\ncaracterísticas distorcidas e parecem olhar para você com olhos vazios. O que você faz? \n",
            "Caminho das esculturas sinistras"
    );

    public static Cenas CAMINHO_VOZES = new Cenas(
            "Boo!!!",
            "\nÀ direita, há um corredor onde você ouve sons de lamentação e sussurros. Parece haver figuras " +
                    "\nfantasmagóricas se movendo na escuridão. O que você faz? \n",
            "Caminho das vozes estranhas"
    );

    public static Cenas VOLTAR_PARA_ESCOLHAS = new Cenas(
            "O que fazer?",
            "\nVocê decide voltar para olhar um dos outros caminhos.\n",
            "Voltar para as três escolhas"
    );

    public static Cenas EXAMINAR_ESCULTURAS = new Cenas(
            "Um caminho promissor",
            "\nVocê examinas as esculturas na esperança de encontrar algo útil em sua jornada. Você vê estátuas em " +
                    "\nformatos diversos e estranhos. Algumas são de homens com cabeças de animais, outras de animais com" +
                    "\ncabeças humanas, cada uma te dá mais medo do que a outra. Entretanto, percebe que em uma delas " +
                    "\nestá faltando um olho. Com sua orientação aos detalhes, que aprendeu com Geandro e Liza, vê que " +
                    "\nhá entre uma das estátuas algo pequeno e redondo. É o olho que estava faltando! Você decide ver " +
                    "\no que acontece ao colocar o olho na estátua. \n",
            "Examinar as esculturas."
    );

    public static Cenas OLHO_FALTANDO = new Cenas(
            "Em terra de cego, quem tem um olho é rei.",
            "\nAo colocar o olho na estátua, algo acontece. Pouco a frente da estátua, uma luz se acende, e embaixo " +
                    "\ndela você agora consegue ver a silhueta de uma porta. Ao abrí-la, você se depara com uma sala vazia, " +
                    "\nque contém apenas uma mesa, com uma maleta no meio. Você se aproxima, observa que a maleta está " +
                    "\ndestrancada e decide abrir. Inicialmente, você vê uma carta em cima de algo coberto por um pano. " +
                    "\nVocê escolhe abrir a carta. Afinal, já chegou até aqui. \n",
            "Colocar olho faltando na estátua"
    );
}