package projetoblocoum.cenas;

import java.util.List;

import static projetoblocoum.RpgMain.NOME;

public class UltimaCena {

    public static Cenas FIM = new Cenas(
            "Fim da aventura!",
            "\nParabéns por encontrar uma saída e sobreviver à essa experiência aterrorizante! " +
                    "\nEntretanto, esse não é o final real. Se quiser, pode tentar novamente fazendo outras escolhas!" +
                    "\nEspero que tenha gostado desta narrativa interativa! ",
            "Fim."
    );

    public static Cenas FINAL_REAL = new Cenas(
            "Fim da aventura!",
            "\nParabéns por encontrar uma saída e sobreviver à essa experiência aterrorizante! " +
                    "\nEste é o final real, você venceu o jogo!" +
                    "\nEspero que tenha gostado desta narrativa interativa! ",
            "Fim."
    );

    public static Cenas FIM_DOIS = new Cenas(
            "Fim da aventura.",
            "\nQue pena! Você não conseguiu sobreviver nesta aventura. Esse não é o final real. Se quiser, pode " +
                    "\ntentar novamente fazendo outras escolhas!" +
                    "\nEspero que tenha gostado desta narrativa interativa! ",
            "Fim"
    );

    public static Cenas FINAL_COVARDE = new Cenas(
            "Você fugiu!",
            "\nVocê decide voltar para o quarto e ir embora pela porta. Após correr desesperadamente, " +
                    "\nchega em um lugar que reconhece e percebe estava em um bairro não muito distante de sua casa. " +
                    "\nApós parar, respira, alivado que conseguiu fugir daquele lugar sinistro. Todavia, fica com a " +
                    "\nenorme curiosidade de descobrir os mistérios da casa. Será que essa foi a melhor escolha? \n",
            "Voltar para o quarto e fugir."
    );

    public static Cenas FINAL_COVARDE_DOIS = new Cenas(
            "Você fugiu!",
            "\nVocê volta para a porta e ao colocar a chave na fechadura, a porta se abre e você sai correndo.  " +
                    "\nApós correr desesperadamente, chega em um lugar que reconhece e percebe que estava em um bairro " +
                    "\nnão muito distante de sua casa. Após parar, respira alivado que conseguiu fugir daquele " +
                    "\nlugar sinistro. Todavia, fica com a enorme curiosidade de" +
                    "\ndescobrir os mistérios da casa. Será que essa foi a melhor escolha? \n",
            "Pegar a chave e ir embora da casa"
    );

    public static Cenas FINAL_COVARDE_TRES = new Cenas(
            "Você fugiu!",
            "\nVocê volta para a porta,  a abre e sai correndo. Após correr desesperadamente, chega em um lugar  " +
                    "\nque reconhece e percebe que estava em um bairro não muito distante de sua casa. Após parar," +
                    "\nrespira, alivado que conseguiu fugir daquele lugar sinistro. Todavia, fica com a enorme curiosidade de" +
                    "\ndescobrir os mistérios da casa. Ainda assim, algum ruim te aguardava, você deu sorte em escolher sair. \n",
            "Voltar para o quarto e fugir."
    );

    public static Cenas FINAL_CAMINHO_VOZES = new Cenas(
            "Prisão.",
            "\nVocê segue pelo pelo caminho e sente que o ambiente está muito mais gelado que os outros cômodos da casa. " +
                    "\nA única coisa que você consegue ver são flashes de luzes, que vão te guiando pelo caminho. Após andar por " +
                    "\num tempo, você se depara com uma porta, e por baixo dela você vê um brilho emandando. Ao entrar pela porta " +
                    "\nvocê vê dezenas de espelhos que refletem a imagem de várias versões distorcidas de você mesmo. " +
                    "\nCada reflexo parece mais assustador e perturbador que o anterior. Você olha para trás e percebe que  " +
                    "\na porta que acabou de passar sumiu, e em seu lugar há um espelho. Você está preso em um espelho e não há " +
                    "\nnada que você possa fazer. \n",
            "Caminho das vozes"
    );

    public static Cenas FINAL_CAMINHO_ESCURIDAO = new Cenas(
            "Caminho da Escuridão Profunda",
            "\nVocê decide entrar na escuridão profunda para ver o que está lá. À medida que você avança na escuridão," +
                    "\na sensação de medo cresce. Você começa a ouvir sussurros que parecem vir de todas as direções. " +
                    "\nDe repente, você sente mãos geladas agarrando seus braços, puxando-o para a escuridão. Você luta para " +
                    "\nse libertar, mas as mãos são implacáveis. Você é arrastado para o desconhecido, e a escuridão" +
                    "\no engole completamente. \n",
            "Explorar o Caminho da Escuridão Profunda"
    );

    public static Cenas ABRIR_CARTA = new Cenas(
            "As coisas estão melhorando.",
            "\nA carta diz: Parabéns por chegar na sala correta! A maioria dos que passaram " +
                    "\npor esta casa não conseguiram chegar onde você chegou, então já se considere um vitorioso. Você passou " +
                    "\npelo teste e não fugiu quando teve a oportunidade. Sendo assim, olhe embaixo do pano na maleta e veja " +
                    "\nque há uma barra de ouro nela. Tome, é seu esse ouro. Agora volte exatamente por onde você veio, para não acabar " +
                    "\nse machucando em outro caminho e saia pela porta da frente. Você está livre. \n",
            "Abrir a carta"
    );

}