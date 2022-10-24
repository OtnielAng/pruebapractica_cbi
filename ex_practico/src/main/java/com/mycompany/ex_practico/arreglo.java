package com.mycompany.ex_practico;
import java.util.Scanner;

public class arreglo {
    
    public static void main(String[] args) {
        
        //variables
        Scanner input = new Scanner (System.in);
        int num;
        String a, b;        
        
        //Entrada de datos
        System.out.println("¿Cuantos datos va a agregar? ");
        num = input.nextInt();
        
        //Array para almanecnar datos
        String[] data = new String [num];
        
        //Llenado de array
        for (int i = 0; i<num; i++) {
            System.out.println("Agrege un Dato");
            a = input.next();
            data[i] = a;            
        }
        
        //Array para almacenar que si hay Oaxaca o oaxaca
        int[] exist = new int [1];
        
        //Verifica que hay oaxaca        
        for (int i = 0; i < num; i++) {
            
            b = data[i];
            
            //Si hay un oaxaca lo guarda en el arroy exist
            if ("Oaxaca".equals(b)){
                exist[0] = 1;
            }else if ("oaxaca".equals(b)) {
                exist[0] = 1;
            }            
        } 
        
        //Si exits es igual a 1, es por que hay un oaxaca, por lo que imprie que hay un Oaxaca
        if (exist[0]==1){
                exist[0] = 1;
                System.out.println("Si existe Oaxaca");
            }else{
               System.out.println("No existe Oaxaca"); 
            }
    }    
}
