package RPG;

import RPG.Personagens.*;
import RPG.itens.*;
import RPG.Habilidades.Normal.*;
import RPG.Habilidades.Especial.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variaveis e classes
        Jogador[] jogadores = new Jogador[6];
        int player;
        Scanner enter = new Scanner(System.in);
        int cond = 0;
        int se = 0;
        int i = 0, contador = 0, j = 0;
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
        int sel = 0;
        int classe;
        String[] personas = new String[10];
        boolean Adicionar = true;
        String nome;
        String[] nomes = new String[6];
        Path history = Paths.get("historia.txt");
        String escrita;
//        Peronagens
        Arqueiro arqueiro = new Arqueiro(7, 50, 8, 7, 3, 25);
        Ladino ladino = new Ladino(8, 40, 7, 8, 2, 40);
        Barbaro barbaro = new Barbaro(7, 70, 6, 5, 6, 15);
        Druida druida = new Druida(6, 50, 5, 6, 5, 75);
        Feiticeiro feiticeiro = new Feiticeiro(9, 45, 4, 5, 2, 100);
        Paladino paladino = new Paladino(4, 90, 2, 2, 8, 50);

        System.out.println("Olá, Bem vido à Igdrasil." +
                "Escolha uma das seguitnes opções:");
        System.out.println("1 - Se já possui um progresso e deseja continuá-lo");
        System.out.println("2 - Se você deseja iniciar um novo progresso");
        sel = enter.nextInt();

        while(sel < 1 || sel > 2){
            System.out.println("Selecione um número válido");
            sel = enter.nextInt();
        }

        if(sel ==1){
            enter.nextLine();
            try{
                String historyString = Files.readString(history);
                System.out.println(historyString);
            }
            catch(IOException g){
                g.printStackTrace();
            }
            while (cond != 2) {
                System.out.println("Escolha uma das seguintes opções:");
                System.out.println("╭───────────────────────╮");
                System.out.println("│ 1 - Continuar história│");
                System.out.println("│ 2 - Sair e salvar     │");
                System.out.println("╰───────────────────────╯");
                System.out.print("- ");
                cond = enter.nextInt();

                while (cond < 1 || cond > 2) {
                    System.out.println("Escolha um numero valido!");
                    System.out.print("- ");
                    cond = enter.nextInt();
                }
                if (cond == 1) {
                    enter.nextLine();
                    System.out.println("Escreva a continuação da história");
                    escrita = enter.nextLine();
                    try {
                        Files.writeString(history, escrita + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                    } catch (IOException t) {
                        t.printStackTrace();
                    }
                }
            }
        }
        if (sel == 1)
            sel = 0;

        if(sel == 2) {
            for (int k = 0; k < 6; k++)
                nomes[k] = null;

            System.out.println("╔═════════════════════════════════════════╗");
            System.out.println("║ Bem-vindo ao Projeto Igdrazil!          ║");
            System.out.println("║ Este projeto está sendo desenvolvido    ║");
            System.out.println("║ para auxiliar nos jogos de RGP,         ║");
            System.out.println("║ onde o mestre poderá escrever toda      ║");
            System.out.println("║ a história mantendo assim o progresso   ║");
            System.out.println("║ salvo para recapitulações e auxiliar    ║");
            System.out.println("║ nos parâmetros dos jogadores.           ║");
            System.out.println("╚═════════════════════════════════════════╝");
            enter.nextLine();

            while ((Adicionar == true) && (cond <= jogadores.length)) {

                System.out.print("Digite o nome de personagem: ");
                nome = enter.nextLine();

                se--;
                if (a == 0) {
                    System.out.println("1 - Arqueiro");
                    arqueiro.MostrarInfo();
                    System.out.println("--------------------------" + "\n");
                }
                if (b == 0) {
                    System.out.println("2 - Ladino");
                    ladino.MostrarInfo();
                    System.out.println("--------------------------" + "\n");
                }
                if (c == 0) {
                    System.out.println("3 - Barbaro");
                    barbaro.MostrarInfo();
                    System.out.println("--------------------------" + "\n");
                }
                if (d == 0) {
                    System.out.println("4 - Druida");
                    druida.MostrarInfo();
                    System.out.println("--------------------------" + "\n");
                }
                if (e == 0) {
                    System.out.println("5 - Feiticeiro");
                    feiticeiro.MostrarInfo();
                    System.out.println("--------------------------" + "\n");
                }
                if (f == 0) {
                    System.out.println("6 - Paladino");
                    paladino.MostrarInfo();
                    System.out.println("--------------------------" + "\n");
                }
                System.out.println("Qual classe deseja jogar: ");
                classe = enter.nextInt();

                if ((personas[j] == null) && (classe == 1)) {
                    personas[j] = "Arqueiro";
                    nomes[j] = nome;
                    arqueiro.Obrigado();
                    a++;
                } else if ((personas[j] == null) && (classe == 2)) {
                    personas[j] = "Ladino";
                    nomes[j] = nome;
                    ladino.Obrigado();
                    b++;
                } else if ((personas[j] == null) && (classe == 3)) {
                    personas[j] = "Barbaro";
                    nomes[j] = nome;
                    barbaro.Obrigado();
                    c++;
                } else if ((personas[j] == null) && (classe == 4)) {
                    personas[j] = "Druida";
                    nomes[j] = nome;
                    druida.Obrigado();
                    d++;
                } else if ((personas[j] == null) && (classe == 5)) {
                    personas[j] = "Feiticeiro";
                    nomes[j] = nome;
                    feiticeiro.Obrigado();
                    e++;
                } else if ((personas[j] == null) && (classe == 6)) {
                    personas[j] = "Paladino";
                    nomes[j] = nome;
                    paladino.Obrigado();
                    f++;
                }

                if (cond < 2)
                    System.out.println("Adicione mais um jogador!" + "\n");

                else {
                    System.out.println("Deseja adicionar mais um player? " + "\n" + "1 - sim" + "\n" + "2 - Não");
                    player = enter.nextInt();
                    while (player < 1 || player > 2) {
                        System.out.println("Selecione um valor válido");
                        player = enter.nextInt();
                    }
                    if (player == 1) {
                        Adicionar = true;
                    } else {
                        Adicionar = false;
                    }
                }


                cond++;
                j++;
                enter.nextLine();
            }

            System.out.println("Os seguintes Heróis foram criados!");
            for (int l = 0; l <= j; l++)
                if (personas[l] != null) {
                    if (personas[l] == "Arqueiro") {
                        System.out.println(nomes[l] + " - " + personas[l]);
                        System.out.println();
                    } else if (personas[l] == "Ladino") {
                        System.out.println(nomes[l] + " - " + personas[l]);
                        System.out.println();
                    } else if (personas[l] == "Barbaro") {
                        System.out.println(nomes[l] + " - " + personas[l]);
                        System.out.println();
                    } else if (personas[l] == "Druida") {
                        System.out.println(nomes[l] + " - " + personas[l]);
                        System.out.println();
                    } else if (personas[l] == "Feiticeiro") {
                        System.out.println(nomes[l] + " - " + personas[l]);
                        System.out.println();
                    } else if (personas[l] == "Paladino") {
                        System.out.println(nomes[l] + " - " + personas[l]);
                        System.out.println();
                    }
                }

            System.out.println("Iniciando a jornada dos grandes heróis!");

            cond = 0;

            System.out.println("Iniciando o projeto Igdrasil, transcreva o inicio da história dos jogadores.");
            escrita = enter.nextLine();
            try {
                Files.writeString(history, escrita + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } catch (IOException t) {
                t.printStackTrace();
            }

            while (cond != 2) {
                enter.nextLine();
                System.out.println("Escolha uma das seguintes opções:");
                System.out.println("╭───────────────────────╮");
                System.out.println("│ 1 - Continuar história│");
                System.out.println("│ 2 - Sair e salvar     │");
                System.out.println("╰───────────────────────╯");
                System.out.print("- ");
                cond = enter.nextInt();

                while (cond < 1 || cond > 2) {
                    System.out.println("Escolha um numero valido!");
                    System.out.print("- ");
                    cond = enter.nextInt();
                }
                if (cond == 1) {
                    System.out.println("Escreva a continuação da história");
                    escrita = enter.nextLine();
                    try {
                        Files.writeString(history, escrita + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                    } catch (IOException t) {
                        t.printStackTrace();
                    }
                }
            }


        }
    }
}