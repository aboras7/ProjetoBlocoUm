package projetoblocoum;

import projetoblocoum.cenas.Cenas;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static projetoblocoum.cenas.DescricoesCenas.*;
import static projetoblocoum.cenas.UltimaCena.*;

public class RpgMain {

    public static String NOME;

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print(" ________________________________________________________________________________________________");
        System.out.print("\n|  Olá! Esta é uma narrativa interativa.                                                         |");
        System.out.print("\n|  Você encontrará uma história com diversos caminhos, onde cada escolha pode afetar             |");
        System.out.print("\n|  o que acontecerá com o seu final! Sendo assim, pense bem sobre o que irá decidir.             |");
        System.out.print("\n|  Recomendo você aumentar a janela do console para conseguir visualizar textos maiores.         |\n");
        System.out.println("|________________________________________________________________________________________________|");

        System.out.print("\nPor favor, digite o seu nome para iniciar a aventura: ");
        NOME = leia.nextLine();
        System.out.println("\nBoa sorte na sua aventura RPG, " + NOME + "!\n" );
        System.out.print("Vamos começar?\n\n---------------------------------------------------------------------------------");
        System.out.print("-----------------------\n");

        Cenas inicio = new Cenas(
                "Pesadelo?",
                "\nVocê acaba de acordar numa casa que nunca viu, em um ambiente muito escuro. Você checa seus bolsos, " +
                        "\nmas percebe que está sem seu celular ou qualquer outro item. Levanta-se e observa o ambiente." +
                        "\nO que você faz em seguida?\n",
                null
        );
        inicio.setProximasCenas(List.of(ACENDER_LUZES, GRITAR_POR_AJUDA, EXPLORAR_QUARTO));
        associarCenas();

        Cenas cenaAtual = inicio;
        while (cenaAtual.hasProximaCena()) {
            System.out.println(cenaAtual.getTitulo());
            System.out.println(cenaAtual.getTexto());

            List<Cenas> proximasCenas = cenaAtual.getProximasCenas();
            for (int i = 0; i < proximasCenas.size(); i++) {
                System.out.println("(" + (i + 1) + ") " + proximasCenas.get(i).getPrompt());
            }

            int resposta;
            try {
                System.out.print("\nEscolha uma opção: ");
                resposta = leia.nextInt();
                leia.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número inteiro válido.");
                leia.nextLine();
                continue;
            }

            if (resposta < 1 || resposta > proximasCenas.size()) {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            } else {
                cenaAtual = proximasCenas.get(resposta - 1);
            }
        }
        System.out.println(cenaAtual.getTitulo());
        System.out.println(cenaAtual.getTexto());

    }

    private static void associarCenas() {
        ACENDER_LUZES.setProximasCenas(List.of(GRITAR_POR_AJUDA, EXPLORAR_QUARTO));
        GRITAR_POR_AJUDA.setProximasCenas(List.of(NINGUEM_RESPONDE));
        NINGUEM_RESPONDE.setProximasCenas(List.of(EXPLORAR_QUARTO));
        EXPLORAR_QUARTO.setProximasCenas(List.of(CHECAR_ARMARIO, CHECAR_ESPELHO, CHECAR_PORTA));
        CHECAR_ARMARIO.setProximasCenas(List.of(PEGAR_BILHETE, FINAL_COVARDE_DOIS));
        FINAL_COVARDE_DOIS.setProximasCenas(List.of(FIM));
        CHECAR_ESPELHO.setProximasCenas(List.of(EMBAIXO_ALCAPAO));
        CHECAR_PORTA.setProximasCenas(List.of(PROCURAR_CHAVE));
        PROCURAR_CHAVE.setProximasCenas(List.of(PEGAR_BILHETE, FINAL_COVARDE_DOIS));
        PEGAR_BILHETE.setProximasCenas(List.of(PROCURAR_MISTERIOS, FINAL_COVARDE_DOIS));
        PROCURAR_MISTERIOS.setProximasCenas(List.of(EMBAIXO_ALCAPAO));
        EMBAIXO_ALCAPAO.setProximasCenas(List.of(CAMINHO_ESCURIDAO, CAMINHO_ESCULTURAS, CAMINHO_VOZES));
        CAMINHO_ESCURIDAO.setProximasCenas(List.of(FINAL_CAMINHO_ESCURIDAO, FINAL_COVARDE_TRES, VOLTAR_PARA_ESCOLHAS));
        FINAL_COVARDE_TRES.setProximasCenas(List.of(FIM));
        FINAL_CAMINHO_ESCURIDAO.setProximasCenas(List.of(FIM_DOIS));
        CAMINHO_ESCULTURAS.setProximasCenas(List.of(EXAMINAR_ESCULTURAS, FINAL_COVARDE, VOLTAR_PARA_ESCOLHAS));
        FINAL_COVARDE.setProximasCenas(List.of(FIM));
        EXAMINAR_ESCULTURAS.setProximasCenas(List.of(OLHO_FALTANDO));
        OLHO_FALTANDO.setProximasCenas(List.of(ABRIR_CARTA));
        ABRIR_CARTA.setProximasCenas(List.of(FINAL_REAL));
        CAMINHO_VOZES.setProximasCenas(List.of(FINAL_CAMINHO_VOZES, FINAL_COVARDE_TRES, VOLTAR_PARA_ESCOLHAS));
        FINAL_CAMINHO_VOZES.setProximasCenas(List.of(FIM_DOIS));
        VOLTAR_PARA_ESCOLHAS.setProximasCenas(List.of(CAMINHO_ESCURIDAO, CAMINHO_ESCULTURAS, CAMINHO_VOZES));
        FIM.setProximasCenas(List.of());
        FIM_DOIS.setProximasCenas(List.of());
        FINAL_REAL.setProximasCenas(List.of());
    }
}