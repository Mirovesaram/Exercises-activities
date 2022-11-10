/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao;

import java.util.*;

/**
 *
 * @author mimi
 */
public class Questao4 {
    public static void main(String[] args) {
        Scanner recipient=new Scanner(System.in);
        String nome[]=new String[20];//[20]
        float salario[]=new float[20];//[20]
        for(int i=0;i<20;i++)
        {
            System.out.println("Insira um nome:");
            nome[i]=recipient.nextLine();
        }
        for(int i=0;i<20;i++)
        {
            System.out.println("Insira um salário:");
            salario[i]=recipient.nextFloat();
        }
        for(int i=0;i<20;i++)
        {
            salario[i]=(float) (salario[i]*1.08);
        }
        for(int i=0;i<20;i++)
        {
            System.out.println(nome[i]+":");
            System.out.println(salario[i]+";");
        }
    }

}
