/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ahorcado;
//profe voy a comentariar asi de momento es como para guiarme y tener una idea clara luego lo chaneo 

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Minor Sibaja Clavo
 */ //22/06/2016
public class Palabras {
    
    private String palabras = "", Solucion = "";
    private int posicion = -1, intentos = 0, maximoDeIntentos = 2;
    private String[] PalabrasAdivinar = {"GEARS OF WAR", "HALO", "FIFA", "AEROPLANO", "VAGON", "SUPRA", "VIVA SAPRISSA"};  //este arreglo es para las palabras, se supone que los guardo en una variable
    public int Gano = -1;

    public void ComenzarJuego() {     //metodo para que me devuelva la funcion random
        Random R = new Random();
        int i = -1;                     // declaro una variable i(intentos como deducion) para realizar la la busqueda de dicha palabra
        do{                             //inicio un ciclo tipo (do) para que intentos sea igual a R.nextInt(palabras) en teoria el bucle
            //se ejecuta obligatoriamente
            i = R.nextInt(PalabrasAdivinar.length);
            
        }while (posicion == i);            //si la condicion posicion se cumple, posicion va ser igual a i(intentos)
        posicion = i;
        palabras = PalabrasAdivinar[posicion];
        
            // y palbras va ser igual a PalabrasAdivinadar
        for (i = 0; i < palabras.length(); i++);{ 
                                                    //el ciclo for que es i(intentos) va ser igual a cero, donde inicia posicion, la condicion i va ser menor a palabras (relaciona),{                                           // y la ultima va manipular los valores que mencionamos
             if(palabras.charAt(i)!)                 // si se cumple palabras va ser igual a '' y solucion = caract sino = espacio para generar las palabras
                Solucion += ("_");                     // debemos pensar que es muy necesario por el hecho de los espacios si por ejemplo gears of war 
                else 
                Solucion += (" ");
    
            }
    
            Dibujar();
          
    }
            
    public void BuscarLetras(char pal) {
        String sol1 = Solucion;
        Solucion = "";
        for (int x = 0; x < palabras.length(); x++) {

            if (palabras.charAt(x) != ' ') {

                if (pal == palabras.charAt(x)) 
                    Solucion += pal;
               else 
                    Solucion += sol1.charAt(x);
                

            }else 
                Solucion += ' ';
            

        }
        if (sol1.compareTo(Solucion) == 0 && Solucion.indexOf(pal) == -1) 
            intentos++;
        Dibujar();
        if (Solucion.compareTo(palabras) == 0) {
            Gano = 0;
            JOptionPane.showMessageDialog(null, "USTED A GANADO!!");
        } else if (intentos == maximoDeIntentos) {
            Gano = 1;
            JOptionPane.showMessageDialog(null, "USTED A PERDIDO!!");
        }

        
    }

    public void Dibujar() {
        for (char c : Solucion.toCharArray()) 
            System.out.print(c + " ");
        
        SOP(" ");
        SOP("\nIntentos restantes: " + (maximoDeIntentos - intentos));

    }

    public void SOP(String msj) {
        System.out.println(msj);
    }

}