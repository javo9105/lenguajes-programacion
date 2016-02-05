/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-101
 */
public class ExcepcionTodaViaNoTanMala {
    public static void main(String[] args) {
        //declarqnsdo un arreglo de entero y lo inicializamos
      
        int x[]={1,34,10,15};
        
        
        float []y=new float[4];
        float z;
        
        
        
        //todos los areglos son tratados como objetos
        A objeto=new A ();
        System.out.println(objeto.n);
        System.out.println(y[2]);
       // System.out.println(z);
        //vamos a iterar el primer arreglo x
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
        //el mismo ciclo for mejorado
        for(int w:x){
            System.out.println(w);
            
        }
        
    }
}
class A{
float n;
}