/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import parcial.Lista;
/**
 *
 * @author user
 */
public class ListaTest {
    
    public ListaTest() {
    }
   
    @Test
    public void listapositivos(){
        ArrayList<Double> num = new ArrayList<>();
        num.add(10.0);
        num.add(20.0);
        num.add(30.0);
        num.add(40.0);
        Lista lista = new Lista();
        double resultado = lista.procesarLista(num);
        assertEquals(25, resultado, 0.0001);
        
    }
    @Test
    public void listanegativa(){
        ArrayList<Double> num = new ArrayList<>();
        num.add(-10.0);
        num.add(-20.0);
        num.add(-30.0);
        Lista lista = new Lista();
        double resultado = lista.procesarLista(num);
        assertEquals(-20,resultado, 0.0001);
        
    }
    @Test
    public void listamixta(){
        ArrayList<Double> num = new ArrayList<>();
        num.add(5.0);
        num.add(-5.0);
        num.add(10.0);
        num.add(-10.0);
        Lista lista = new Lista();
        double resultado = lista.procesarLista(num);
        assertEquals(0,resultado, 0.0001);
        
    }
    @Test
    public void listaunica(){
        ArrayList<Double> num = new ArrayList<>();
        num.add(100.0);
        Lista lista = new Lista();
        double resultado = lista.procesarLista(num);
        //assertEquals(100,0, resultado);
        assertEquals(100,resultado, 0.0001);
        
    }
    
    @Test
    public void listavacia(){
        ArrayList<Double> num = new ArrayList<>();
        Lista lista = new Lista();
        double resultado = lista.procesarLista(num);
        //assertEquals(0,0, resultado);
        assertEquals(0,resultado, 0.0001);
        
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
