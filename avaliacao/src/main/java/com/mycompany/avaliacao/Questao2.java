/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.avaliacao;
import java.util.*;
/**
 *
 * @author mimi
 */
public class Questao2 {

    public static void main(String[] args) {
        Scanner recipient=new Scanner(System.in);
        System.out.println("Insira sua idade:");
        int idade=recipient.nextInt();
        if(idade<16)
        {
           System.out.print("Não-eleitor");
        }
        else if((idade>=16&&idade<18)||idade>=65)
        {
            System.out.print("Eleitor facultativo");
        }
        else if(idade>=18&&idade<65)
        {
            System.out.print("Eleitor obrigatório");
        }
    }
}
