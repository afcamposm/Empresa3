/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresas;

/**
 *
 * @author Felipe
 */

import java.util.*;
public class Empresas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado("123", "V", 0);
        Empleado e2 = new Empleado("456", "I", 0);
        Sucursal s = new Sucursal("Bogota");
        
        //Ingresar Empleado
        if(!s.ingresarEmpleado(e1)) System.out.println("Error");
        if(!s.ingresarEmpleado(e2)) System.out.println("Error");
        if(!s.ingresarEmpleado(e2)) System.out.println("Error");
    
        //Buscar Empleado
        Empleado e = s.buscarCedula("123");
        if(e != null) System.out.println(e);
        else System.out.println("No Existe");
    }
    
}
