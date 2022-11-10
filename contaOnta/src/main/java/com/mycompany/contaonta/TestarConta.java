/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contaonta;

import java.util.Scanner;

/**
 *
 * @author mimi
 */
public class TestarConta {
    public static void main(String[] args) {
        Scanner recipiente=new Scanner(System.in);
        int resposta=99;
        double valor;
        ContaOnta conta0000001=new ContaOnta();
        ContaOnta conta0000002=new ContaOnta();
        conta0000001.setNumero("0000001");
        conta0000001.setCliente("Chico Buarque");
        conta0000001.setSaldo(0);
        conta0000001.setLimite(1000);
        System.out.println(conta0000001.getNumero());     
        System.out.println(conta0000001.getCliente());     
        System.out.println(conta0000001.getSaldo());     
        System.out.println(conta0000001.getLimite());
        while(resposta!=0)
        {
            System.out.println("Deseja sacar (1), depositar (2) ou não deseja fazer nenhum tipo de transferência (0)?");
            resposta=recipiente.nextInt();
            switch(resposta)
            {
                case 0:
                    break;
                case 1:
                    valor=recipiente.nextDouble();
                    conta0000001.setSacar(valor);
                    break;
                case 2:
                    valor=recipiente.nextDouble();
                    conta0000001.setDepositar(valor);
                    break;
                default:
                    System.out.println("Insira uma resposta válida.");
                    resposta=99;
                    break;
            }
        }
        System.out.println(conta0000001.getNumero());     
        System.out.println(conta0000001.getCliente());     
        System.out.println(conta0000001.getSaldo());     
        System.out.println(conta0000001.getLimite());
        conta0000002.setNumero("0000002");
        conta0000002.setCliente("Jorginho Gamer 3000 elevado a googol");
        conta0000002.setSaldo(0);
        conta0000002.setLimite(1000);
        System.out.println(conta0000002.getNumero());     
        System.out.println(conta0000002.getCliente());     
        System.out.println(conta0000002.getSaldo());     
        System.out.println(conta0000002.getNumero());
        resposta=99;
        while(resposta!=0)
        {
            System.out.println("Deseja sacar (1), depositar (2) ou não deseja fazer nenhum tipo de transferência (0)?");
            resposta=recipiente.nextInt();
            switch(resposta)
            {
                case 0:
                    break;
                case 1:
                    valor=recipiente.nextDouble();
                    conta0000002.setSacar(valor);
                    break;
                case 2:
                    valor=recipiente.nextDouble();
                    conta0000002.setDepositar(valor);
                    break;
                default:
                    System.out.println("Insira uma resposta válida.");
                    resposta=99;
                    break;
            }
        }
        System.out.println(conta0000002.getNumero());     
        System.out.println(conta0000002.getCliente());     
        System.out.println(conta0000002.getSaldo());     
        System.out.println(conta0000002.getLimite());
    }
}
