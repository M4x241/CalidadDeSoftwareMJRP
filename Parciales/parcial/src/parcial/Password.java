/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

/**
 *
 * @author user
 */
public class Password {
    public boolean validar(String pass){
        boolean Uper = false;
        boolean number = false;
        int tam = pass.length();
        for(int i=0; i<tam; i++){
            char prueba = pass.charAt(i);

            if(Character.isUpperCase(prueba)){
                Uper = true;
                
            }
            if(Character.isDigit(prueba))
                number = true;
                            

        }
        
        if(Uper && number && tam>=8){
            return true;
        }
        return false;
    }
}
