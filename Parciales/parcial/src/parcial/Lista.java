package parcial;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Lista {
    
     public double procesarLista(ArrayList<Double> numeros) {
        if (numeros == null|| numeros.isEmpty()) {
            return 0;
        }
        double sum=0;
        for (double n :numeros) {
            sum+=n;
        }

        
        
         return sum/numeros.size();
    }
}
