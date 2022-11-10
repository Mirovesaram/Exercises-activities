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
public class Questao1 {    
    private int num1,num2,num3;
    public void setQuestao1(int num1,int num2,int num3)
    {
        num1*=2;
        num2*=2;
        num3*=2;
        this.num1=num1;        
        this.num2=num2;        
        this.num3=num3;        
    }
    public int[] getQuestao1()
    {
        int[] nums=new int[3];
        nums[0]=num1;
        nums[1]=num2;
        nums[2]=num3;
        return nums;
    }
}
