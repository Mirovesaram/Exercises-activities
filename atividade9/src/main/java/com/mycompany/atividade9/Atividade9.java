/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atividade9;
import java.util.*;
/**
 *
 * @author mimi
 */
public class Atividade9
{
    public static void main(String[] args) throws InterruptedException /*Existem dois comandos "throws InterruptedException", o primeiro foi requisitado 
para o uso correto do método "escolherQuestao(valor)", hipotetizo que ele pediu por causa do "Thread.sleep(5000)" contido no método.*/
/*throws InterruptedException*/ /*Este segundo foi no contexto de aprender como usar o "Thread.sleep(5000)" que eu estava testando no método main. Logo, se minha
hipótese estiver correta tanto o primeiro quanto o segundo comandos são para a mesma coisa, logo, só colocando o primeiro comando no método main já é mais do que o suficienre.*/
    {
        Scanner recipiente=new Scanner(System.in);
        int valor=1;
        while(valor!=0)
        {
            System.out.println("Qual questão deseja acessar?\nExemplo: se deseja a questão 3, digite 3 e assim por diante.\nCaso deseje encerrar o programa digite 0");
            valor=recipiente.nextInt();
            switch(valor)
            {
                case 0:
                    valor=0;
                    long start=System.currentTimeMillis();
                    for(int i=0;i<=2;i++)
                    {
                        System.out.println("Encerrando o programa...");
                        Thread.sleep(500);
                    }
                    break;
                case 1:
                    Questao1 questao1=new Questao1();
                    System.out.println("Insira 3 números");
                    int num1=recipiente.nextInt();
                    int num2=recipiente.nextInt();
                    int num3=recipiente.nextInt();
                    questao1.getQuestao1(num1,num2,num3);                    
                    System.out.println(Arrays.toString(questao1.setQuestao1()));
                    valor=1;
                    break;
                case 2:
                    Questao2 questao2=new Questao2();
                    questao2.setQuestao2();
                    System.out.println(questao2.getQuestao2());
                    valor=1;
                    break;
                case 3:
                    Questao3 questao3=new Questao3();
                    questao3.Questao3();
                    valor=1;
                    break;
                case 4:
                    Questao4 questao4=new Questao4();
                    System.out.println(questao4.getQuestao4());
                    valor=1;
                    break;
                default:                    
                    valor=1;
                    System.out.println("Resposta inválida.\nDigite novamente.");
                    break;
            }
        //testes de como usar o Thread.sleep():
        //long start = System.currentTimeMillis();
        //Thread.sleep(5000);
        //System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
    }                  
            /*if(valor==0)
            {
                valor=0;
                long start=System.currentTimeMillis();
                for(int i=0;i<=2;i++)
                {
                    System.out.println("Encerrando o programa...");
                    Thread.sleep(1000);
                }
            }
            else if(valor==1)
            {
                valor=1;                    
            }
            else if(valor==2)
            {
                valor=1;                    
            }
            else if(valor==3)
            {
                valor=1;                    
            }
            else if(valor==4)
            {
                valor=1;                    
            }
            else
            {
                valor=1;
                System.out.println("Resposta inválida.\nDigite novamente.");
            }*/
        
    }
}

