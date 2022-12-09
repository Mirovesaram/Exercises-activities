package com.mycompany.atividade13;


import com.mycompany.atividade13.Calculadora;
import com.mycompany.atividade13.ChildClass;
import com.mycompany.atividade13.BaseClass;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mimi
 */
public class Teste {
    public static void main(String[] args)
    {
        System.out.println("@Override example");
        BaseClass test=new ChildClass();
        test.display();
        Calculadora soma=new Calculadora();
        System.out.println(soma.soma(10, 10));
        System.out.println(soma.soma(10.10,10.10));
        System.out.println(soma.soma(10000000,10000000));
    }
}
