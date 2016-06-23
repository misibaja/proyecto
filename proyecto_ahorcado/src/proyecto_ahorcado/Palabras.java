/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ahorcado;
//profe voy a comentariar asi de momento es como para guiarme y tener una idea clara luego lo chaneo 

import java.util.Random;

/**
 *
 * @author Minor Sibaja Clavo
 */ //22/06/2016
public class Palabras {

    private string palabras = "", Solucion = "";
    private int posicion = -1, intentos = 0, maximoDeIntentos = 2;
    private string[] PalabrasAdivinar = {"GEARS OF WAR", "HALO", "FIFA", "AEROPLANO", "VAGON", "SUPRA", "VIVA SAPRISSA", "EEUU", "CEREZA", "FLATULENCIA", "INODORO",
        "BESTIA", "DOG", "CATES", "IRON MAIDEM", "ACDC"};  //este arreglo es para las palabras, se supone que los guardo en una variable

    public void ComenzarJuego() {     //metodo para que me devuelva la funcion random
        Random R = new Random();
        int i = -1;                     // declaro una variable i(intentos como deducion) para realizar la la busqueda de dicha palabra
        do {                            //inicio un ciclo tipo (do) para que intentos sea igual a R.nextInt(palabras) en teoria el bucle
            //se ejecuta obligatoriamente
            i = R.nextInt(PalabrasAdivinar);
        } while (posicion == i);            //si la condicion posicion se cumple, posicion va ser igual a i(intentos)
        posicion = i;
        palabras = PalabrasAdivinadar[posicion]; // y palbras va ser igual a PalabrasAdivinadar
        for (i = 0; i < palabras.length(); i++); //el ciclo for que es i(intentos) va ser igual a cero, donde inicia posicion, la condicion i va ser menor a palabras (relaciona),
        {                                           // y la ultima va manipular los valores que mencionamos
            if (palabras.charAt(i) != ' ') 
                                                    // si se cumple palabras va ser igual a '' y solucion = caract sino = espacio para generar las palabras
                Solucion += ("_");                     // debemos pensar que es muy necesario por el hecho de los espacios si por ejemplo gears of war 
            else
                Solucion+=(" ");

        }

    }

}
