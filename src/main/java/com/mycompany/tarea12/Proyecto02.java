/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea12;

/**
 *
 * @author PC-07
 */
public class Proyecto02 {

    public static void main(String[] args) {
         var empleado1 = new Empleado();
        empleado1.nombre = "Benito Martinez";
        empleado1.costoHoras = 15;
        empleado1.horasTrabajadas = 120;
        empleado1.yearIngreso = 2015;

        System.out.println("El empleado " + empleado1.nombre + " tiene un ingreso neto incluido bono de antiguedad de: "
                + empleado1.calcularIngresos(2022) + "\nEl valor de bonos por horas extras es de: " 
                + empleado1.bonoHorasExtra() + "\nEl impuesto neto a pagar es de: " 
                + empleado1.calcularImpuesto(300, 400, 500) 
                + "\nCon un valor total de: " + empleado1.calcularTotal(2022, 300, 400, 500));
        
        System.out.println("---------------------------------------");
        
        var empleado2 = new Empleado();
        empleado2.nombre = "Daniel Torres";
        empleado2.costoHoras = 5;
        empleado2.horasTrabajadas = 240;
        empleado2.yearIngreso = 2004;

        System.out.println("El empleado " + empleado2.nombre + " tiene un ingreso neto incluido bono de antiguedad de: "
                + empleado2.calcularIngresos(2022) + "\nEl valor de bonos por horas extras es de: " 
                + empleado2.bonoHorasExtra() + "\nEl impuesto neto a pagar es de: " 
                + empleado2.calcularImpuesto(300, 400, 500) 
                + "\nCon un valor total de: " + empleado2.calcularTotal(2022, 300, 400, 500));
        System.out.println("---------------------------------------");
        
        var empleado3 = new Empleado();
        empleado3.nombre = "Juan Ozuna";
        empleado3.costoHoras = 7;
        empleado3.horasTrabajadas = 80;
        empleado3.yearIngreso = 2014;
            
        System.out.println("El empleado " + empleado3.nombre + " tiene un ingreso neto incluido bono de antiguedad de: "
                + empleado3.calcularIngresos(2022) + "\nEl valor de bonos por horas extras es de: " 
                + empleado3.bonoHorasExtra() + "\nEl impuesto neto a pagar es de: " 
                + empleado3.calcularImpuesto(300, 400, 500) 
                + "\nCon un valor total de: " + empleado3.calcularTotal(2022, 300, 400, 500));
    }

}
        
        
    

