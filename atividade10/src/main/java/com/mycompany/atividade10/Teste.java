/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade10;

/**
 *
 * @author mimi
 */
public class Teste {
    public void questao10()
    {
        Aluno aluno1=new Aluno();
        Aluno aluno2=new Aluno();
        aluno1.setIdade(17);
        aluno1.setMatricula("1");
        aluno1.setNome("Minecraft");
        System.out.println("Nome: "+aluno1.getNome());
        System.out.println("Idade: "+aluno1.getIdade());
        System.out.println("Matrícula: "+aluno1.getMatricula());
        aluno2.setIdade(18);
        aluno2.setMatricula("2");
        aluno2.setNome("Minecraft 2");
        System.out.println("Nome: "+aluno2.getNome());
        System.out.println("Idade: "+aluno2.getIdade());
        System.out.println("Matrícula: "+aluno2.getMatricula());
    }
}
