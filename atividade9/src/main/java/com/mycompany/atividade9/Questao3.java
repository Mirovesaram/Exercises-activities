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
public class Questao3 {
    private int mes;
    public void setQuestao3()
    {
        Scanner recipiente=new Scanner(System.in);
        System.out.println("Insira um número que representa um dos meses do primeiro trimestre:");
        mes=recipiente.nextInt();
        switch(mes)
        {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            default:
                System.out.println("Inválido");
        }
    }
}
