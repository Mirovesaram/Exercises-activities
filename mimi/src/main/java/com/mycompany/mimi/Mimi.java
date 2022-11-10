/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mimi;
import java.util.*;
/**
 *
 * @author mimi
 */
public class Mimi {

    public static void main(String[] args)
    {
        /*Scanner recipient=new Scanner(System.in);
        float vendas[][]=new float[12][4]; 
        float totalSem[]=new float[4], totalMes[]=new float[12], total=0;
        for(int i=0;i<12;i++)
        {
            for(int j=0;j<4;j++)
            {
                vendas[i][j]=1;
            }
        }
        System.out.println("\t\tSemana1\t\t\tSemana2\t\t\tSemana3\t\t\tSemana4");
        for(int i=0;i<12;i++)
        {
            
            switch(i)
            {
                case 0:
                    System.out.print("Jan\t");
                    break;
                case 1:
                    System.out.print("Fev\t");
                    break;
                case 2:
                    System.out.print("Mar\t");
                    break;
                case 3:
                    System.out.print("Abr\t");
                    break;
                case 4:
                    System.out.print("Mai\t");
                    break;
                case 5:
                    System.out.print("Jun\t");
                    break;
                case 6:
                    System.out.print("Jul\t");
                    break;
                case 7:
                    System.out.print("Ago\t");
                    break;
                case 8:
                    System.out.print("Set\t");
                    break;
                case 9:
                    System.out.print("Out\t");
                    break;
                case 10:
                    System.out.print("Nov\t");
                    break;
                case 11:
                    System.out.print("Dez\t");
                    break;
            }
            for(int j=0;j<4;j++)
            {
                System.out.print("\t"+vendas[i][j]+"\t\t");
            }
            System.out.println();
        }
        //"   \t"
        //totalSem[i][j]+"\t\t\t"
        //totalSem[i][j]*/
        int[][] matriz = new int[3][4];
        int vetorSomaMes[] = new int[3];
        int vetorSomaSemana[] = new int[4];
        int somaMes = 0;
        int somaSemana = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
               matriz[i][j]=1;
            }
            
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                somaMes = somaMes + matriz[i][j];
            }
            vetorSomaMes[i] = somaMes;
        }
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 3; i++) {
                somaSemana = somaSemana + matriz[i][j];
            }
            vetorSomaSemana[j] = somaSemana;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("\t"+matriz[i][j]);
            }
            System.out.println();
        }
        System.out.print(Arrays.toString(vetorSomaMes));
         System.out.print(Arrays.toString(vetorSomaSemana));
    }
}
