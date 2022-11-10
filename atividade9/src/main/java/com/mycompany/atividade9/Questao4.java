/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade9;

import java.util.Scanner;

/**
 *
 * @author mimi
 */
public class Questao4 
{
    public long getQuestao4()
    {
        Scanner recipiente=new Scanner(System.in);
        System.out.println("Insira o valor para adquirir seu fatorial:");
        long n=recipiente.nextInt();
        long acum=1;
        for(long i=n;i>0;i--)
        {
            System.out.print(i+" ");
            acum*=i;
        }
        System.out.print("= ");
        return acum;
    }
}
