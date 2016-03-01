/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author T-101
 */
public class generarClientes {
    public static void cliente[] obtenerClientes[]{
    cliente cliente[]=new cliente[3];
    cliente[0]=new cliente();
    cliente[1]=new cliente();
    cliente[2]=new cliente();
    //ajustando los nombre
    cliente[0].setNombre("ana");
    cliente[1].setNombre("pedro");
    cliente[2].setNombre("lupe");
    
    Direccion d1=new Direccion();
              d1.setCalle("sur 12");
              d1.setNumero(3);
              d1.setMunicipio("ecatepec");
       cliente[0].setDireccion(d1);
    
    
    
}
    
}
