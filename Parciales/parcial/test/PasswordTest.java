/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;
import parcial.Password;

/**
 *
 * @author user
 */
public class PasswordTest {
    
    public PasswordTest() {
    }
    
    @Test
    public void contrasenavalida(){
        String pass = "Password1";
        Password password = new Password();
        boolean result = password.validar(pass);
        assertTrue(result);
    }
    @Test
     public void sinMayuscula(){
        String pass = "password1";
        Password password = new Password();
        boolean result = password.validar(pass);
        assertFalse(result);
    }
     @Test
      public void contrasenaivalidasinnumero(){
        String pass = "Password";
        Password password = new Password();
        boolean result = password.validar(pass);
        assertFalse(result);
    }
      @Test
      public void contrasenacorta(){
        String pass = "Pas1";
        Password password = new Password();
        boolean result = password.validar(pass);
        assertFalse(result);
    }
      @Test
       public void cadenavacia(){
        String pass = "";
        Password password = new Password();
        boolean result = password.validar(pass);
        assertFalse(result);
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
