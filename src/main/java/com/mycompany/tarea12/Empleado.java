/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea12;

/**
 *
 * @author PC-07
 */
public class Empleado {
    String nombre;
    int horasTrabajadas;
    double costoHoras;
    int yearIngreso;

    public double calcularIngresos(int yearActual) {
        var years = yearActual - this.yearIngreso;
        var retorno = (this.costoHoras * this.horasTrabajadas) + (years * 0.02 * (this.horasTrabajadas * this.costoHoras));
        return retorno;
    }

    public double bonoHorasExtra() {
        var retorno = 0.00d;
        var horas = this.horasTrabajadas;
        if (horas > 160) {
            retorno = horas - 160;
            retorno = (retorno * this.costoHoras * 2);

        }
        return retorno;
    }

    public double calcularImpuesto(int limite1, int limite2, int limite3) {
        var ingresoBasico = this.costoHoras * this.horasTrabajadas;
        var retorno = 0.0d;
        if (ingresoBasico > limite1 && ingresoBasico < limite2) {
            retorno = ingresoBasico * 0.05;

        } else {
            if (ingresoBasico > limite2 && ingresoBasico < limite3) {
                retorno = ingresoBasico * 0.12;
            } else {
                if (ingresoBasico > limite3) {
                    retorno = ingresoBasico * 0.25;
                }
            }
        }
        return retorno;
    }

    public double calcularTotal(int yearActual, int limite1, int limite2, int limite3) {
        var retorno = this.bonoHorasExtra() + this.calcularIngresos(yearActual) - this.calcularImpuesto(limite1, limite2, limite3);
        return retorno;
    }
}
    

