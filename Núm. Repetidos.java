
package Trabajo_Extraclase_1_2do_Bimestre;

import java.util.Scanner;


public class Ejercicio3_Numeros_Repetidos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        double []num=new double[30];
        double mayor=0 ;
        int rep_Mayor=0;
        double menor=0;
        int rep_Menor=0;
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Ingrese el numero: ");
            num[i]=lector.nextDouble();
        }
        
        for (int i = 0; i < num.length; i++) {
            if(mayor<num[i]){
                mayor=num[i];
            }
            if(num[i]<menor){
                menor=num[i];
            }
        }
        for (int i = 0; i < num.length; i++) {
            if(mayor==num[i]){
                rep_Mayor=rep_Mayor+1;
            }
            if(menor==num[i]){
                rep_Menor=rep_Menor+1;
            }
        }
        
        System.out.println("Numero mayor: "+mayor+" Nro repeticiones: "+rep_Mayor);
        System.out.println("Numero menor: "+menor+" Nro repeticiones: "+rep_Menor);
        
    }
}
