/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2git;

/**
 *
 * @author Paola Montenegro
 */
public class CALCULADORA2GIT {

       private int ans;
    CALCULADORA2GIT(){
        ans=0;
    }
    
    public int suma(int a, int b){
        ans=a+b;
        return ans;
    }
    
    public int resta(int a, int b){
        ans=a-b;
        return ans;
    }
    
    public int adicionar(int a){
        ans=ans+a;
        return ans;
    }
    
    public int decrementar(int a){
        ans=ans-a;
        return ans;
    }
    
    public int ans(){
        return ans;
    }
    
    public void clear(){
        ans=0;
        
    }
    
    
    
}
