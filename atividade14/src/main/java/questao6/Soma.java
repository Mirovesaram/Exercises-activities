/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao6;

/**
 *
 * @author mimi
 */
public class Soma implements OperacaoMatematica{
    @Override
    public int calcula(int a,int b)
    {
        int soma;
        soma=a+b;
        return soma;
    }
}
