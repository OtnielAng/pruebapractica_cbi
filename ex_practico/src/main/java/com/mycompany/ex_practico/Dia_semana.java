package com.mycompany.ex_practico;

import java.util.Date;
import java.util.Scanner;

public class Dia_semana {

    public static void main(String[] args) {
        
        //variables
        Scanner input = new Scanner (System.in);
        int in_year, in_month, in_day, nday;       
        
        //Entradas de Datos
        System.out.print("Escriba el año: ");
        in_year = input.nextInt();
        System.out.print("Escriba el mes: ");
        in_month = input.nextInt();
        System.out.print("Escriba el dia: ");
        in_day = input.nextInt();
        
        //Operaciones
        in_month = in_month -1;
        in_year = in_year - 1900;
        
        Date indate = new Date(in_year, in_month, in_day);
        //Consigo el numero de dia
        nday = indate.getDay();
        
        //Dependiendo del numero del dia de semana me dice el dia
        switch (nday) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                throw new AssertionError();
        }
        
               
    }
}
