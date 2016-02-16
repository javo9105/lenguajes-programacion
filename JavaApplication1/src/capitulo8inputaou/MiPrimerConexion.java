/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo8inputaou;

/**
 *import java.net.
 * import java.io
 * @author T-101
 */
import java.net.*;
import java.io.*;
public class MiPrimerConexion {
    public static void main(String[] args)throws Exception{
        //PRIMERO VAMOS A USAR UNA CLASE QUE SE LLAMA URL
        URL url=new 
        URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
        HttpURLConnection con=(HttpURLConnection) url.openConnection();
        InputStream input=con.getInputStream();
        InputStreamReader isr=new InputStreamReader(input);
        BufferedReader reader= new BufferedReader(isr);
       int renglones=0;
       boolean encontrado=false; 
       while(reader.readLine() !=null){
           String reemplazoAztual=reader.readLine();
         if (remplazoActual().contains("yyy")){
           encontrado=true;
             System.out.println (reader.readLine());
   // }
       }
      /* String hola = "td width=190 class=summary_data Outside Temp 21<td>";
       int indice1= hola.indexOf("summary_data");
       int indice2= hola.indexOf("<td>");
       String nuevo=hola.substring(indice1, indice2);
        System.out.println(nuevo);*/
       
        System.out.println("Numero de Renglones" + renglones);
    }
    
}
