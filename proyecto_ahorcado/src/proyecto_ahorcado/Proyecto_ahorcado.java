/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ahorcado;

import java.util.Scanner;

/**
 *
 * @author Minor Sibaja Calvo
 *///22/06/2016
public class Proyecto_ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        Palabras A = new Palabras();
        String letra = "";
        char Letra;

        int op = -1;
        do {
            if (op == -1) {
                op = 1;
            } else {
                A.SOP("\n[1] - Jugar de Nuevo\n[0] - Salir");
                op = Leer.nextInt();
            }
            switch (op) {
                case 1:
                    A.ComenzarJuego();
                    while (A.Gano == -1) {
                        letra = Leer.next().toUpperCase();
                        Letra = letra.charAt(0);
                        A.BuscarLetras(Letra);
                    }
                    break;
                case 0:
                    break;
                default:
                    A.SOP("Opcion Indefinida!");
            }

        } while (op != 0);

    }
}
