/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ah2proyecto202118671;

import java.util.Scanner;

/**
 *
 * @author monse
 */
public class AH2proyecto202118671 {

    public static void main(String[] args) {

        Scanner n1 = new Scanner(System.in);
        int res;
        boolean salir = false;

        while (!salir) {

            System.out.println("""
                                                   ******MENÚ DE JUEGO******:
                                                   1.- Iniciar juego
                                                   2.- Reanudar juego          
                                                   0.- Salir""");

            System.out.println(" Opción:");
            res = n1.nextInt();

            switch (res) {
                case 1 -> {

                    System.out.println(" *******INICIO DE JUEGO******** ");
                    int tab[][] = new int[8][8];
                    int pos = 0;
                    int cuadros = 64;
                    boolean cambio = true;
                    char jugador[][] = new char[8][8];

                    Scanner sp = new Scanner(System.in);

                    for (int i = 0; i < tab.length; i++) {
                        if (cambio) {
                            for (int j = tab[i].length - 1; j >= 0; j--) {
                                tab[i][j] = cuadros;
                                cuadros--;
                            }
                            cambio = false;
                        } else {
                            for (int j = 0; j < tab[i].length; j++) {
                                tab[i][j] = cuadros;
                                cuadros--;
                            }
                            cambio = true;
                        }
                    }

                    String[][] tablero = new String[8][8];

                    for (int i = 0; i < tab.length; i++) {
                        for (int j = 0; j < tab.length; j++) {
                            tablero[i][j] = "    ";
                        }
                    }

                    int castigos1 = (int) (Math.random() * 3 + 1);
                    int castigos2 = (int) (Math.random() * 3 + 1);
                    int castigos3 = (int) (Math.random() * 3 + 1);

                    int numero_castigos1 = (int) (Math.random() * (4 - 2 + 1) + 2);
                    int numero_castigos2 = (int) (Math.random() * (4 - 2 + 1) + 2);
                    int numero_castigos3 = (int) (Math.random() * (4 - 2 + 1) + 2);

                    for (int i = 0; i < numero_castigos1; i++) {
                        int numero_castigo1 = (int) (Math.random() * (6 - 0 + 1) + 0);
                        int numero_castigo_fila = (int) (Math.random() * (7 - 6 + 1) + 6);
                        tablero[numero_castigo_fila][numero_castigo1] = "  #";
                    }
                    for (int i = 0; i < numero_castigos2 + 1; i++) {
                        int numero_castigo2 = (int) (Math.random() * (7 - 0 + 1) + 0);
                        int numero_castigo_fila = (int) (Math.random() * (5 - 3 + 1) + 3);
                        tablero[numero_castigo_fila][numero_castigo2] = "  #";
                    }
                    for (int i = 0; i < numero_castigos3 + 1; i++) {
                        int numero_castigo3 = (int) (Math.random() * (7 - 0 + 1) + 0);
                        int numero_castigo_fila = (int) (Math.random() * (2 - 0 + 1) + 0);
                        tablero[numero_castigo_fila][numero_castigo3] = "  #";

                    }

                    jugador[7][7] = '@';
                    while (pos <= 64) {

                        System.out.println("------------------------------------------");
                        for (int i = 0; i < tab.length; i++) {
                            for (int j = 0; j < tab[i].length; j++) {

                                System.out.print("|  " + tab[i][j]);

                            }
                            System.out.println("|  ");
                            for (int j = 0; j < tab[i].length; j++) {

                                System.out.print("|" + jugador[i][j] + tablero[i][j]);

                            }
                            System.out.println("|  ");
                            System.out.println("------------------------------------------");

                        }
                        for (int i = 0; i < jugador.length; i++) {
                            for (int j = 0; j < jugador[i].length; j++) {
                                jugador[i][j] = ' ';

                            }
                        }
                        System.out.println("Preciona la teclra -R- para tirar tu dado ");
                        System.out.println("Preciona la teclra -P para salir  ");
                        String opción = sp.nextLine();

                        switch (opción) {

                            case "r":
                                int dado = (int) (Math.random() * (6 - 2) + 2);
                                System.out.println("tu dado muestra " + dado);
                                pos += dado;
                                if (pos >= 56) {
                                    jugador[0][21 - pos] = '@';
                                } else if (pos >= 48) {
                                    jugador[1][21 - pos] = '@';
                                } else if (pos >= 40) {
                                    jugador[2][21 - pos] = '@';
                                } else if (pos >= 32) {
                                    jugador[3][21 - pos] = '@';
                                } else if (pos >= 24) {
                                    jugador[4][21 - pos] = '@';
                                } else if (pos >= 16) {
                                    jugador[5][21 - pos] = '@';
                                } else if (pos >= 8) {
                                    jugador[6][pos - 8] = '@';
                                } else {
                                    jugador[7][7 - pos] = '@';
                                }

                            case "p":
                                salir = true;
                                System.out.println("Adios");
                                break;

                        }

                    }
                }

                case 2 -> {

                    System.out.println("");
                    break;
                }

                case 3 -> {

                    System.out.println("PROGRAMA FINALIZÓ ");
                    salir = true;

                    break;

                }
            }
        }
    }
}
