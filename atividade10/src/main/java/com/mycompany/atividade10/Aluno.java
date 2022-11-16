/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade10;

/**
 *
 * @author mimi
 */
public class Aluno {
    private String matricula, nome;
    private int idade;
    public void setIdade(int idade)
    {
        this.idade=idade;
    }
    public void setNome(String nome)
    {
        this.nome=nome;
    }
    public void setMatricula(String matricula)
    {
        this.matricula=matricula;
    }
    public String getNome()
    {
        return nome;
    }
    public int getIdade()
    {
        return idade;
    }
    public String getMatricula()
    {
        return matricula;
    }    
}
