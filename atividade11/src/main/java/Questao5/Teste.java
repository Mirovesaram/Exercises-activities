/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao5;
import javax.swing.JOptionPane;
/**
 *
 * @author mimi
 */
public class Teste {
    public static void main(String args[])
    {
        Object[] botoes={"Sim","Não"};
        int opcao;
        opcao=JOptionPane.showOptionDialog(null,"Bem vindo ao registrador de carros\nDeseja adicionar um carro?","Registrador de carros",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,botoes,botoes[1]);
        if(opcao==0)
        {
            TesteGUI testeGui=new TesteGUI();
            testeGui.show();
        }
    }
}
//        JOptionPane.showConfirmDialog(null, "Bem vindo ao registrador de carros\nDeseja adicionar um carro?","Registrador de carros",JOptionPane.YES_NO_OPTION);
