/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LUCAS
 */
public class EmpresaTest {
    
     public static void main(String[] args) {
        Empleado emp1 = new Empleado(1,"Lucas Ledesma", "Gerente", 50000);
        Empleado emp2 = new Empleado("Ariel Enferrel", "Desarrollador");
        Empleado emp3 = new Empleado(3,"Pepe Martinez", "Analista", 10000);
        
        emp1.actualizarSalario(10.0);//incrementa el 10% del salarip
        emp3.actualizarSalario(10000);//incrementa la cantidad de dinero
        
        System.out.println(emp1);
         System.out.println(emp2);
          System.out.println(emp3);
        
        System.out.println("Total de empleados creados:"+ Empleado.mostrarTotalEmpleados());  
        
        
    }
    
}
