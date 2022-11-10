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
public class Questao2 {
    private double media;
    public void setQuestao2()
    {
        Scanner recipiente=new Scanner(System.in);
        double notas;
        double media=0;
        double acum=0;
        for(int i=0;i<=2;i++)
        {
            System.out.println("Insira notas:");
            notas=recipiente.nextDouble();
            acum+=notas;
        }
        media=acum/3;
        this.media=media;
    }
    public double getQuestao2()
    {
        return this.media;
    }
}
