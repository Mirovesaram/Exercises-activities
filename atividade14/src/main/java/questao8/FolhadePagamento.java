/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao8;

/**
 *
 * @author mimi
 */
public class FolhadePagamento {
    public static void main(String args[])
    {
        PorComissao funcC=new PorComissao();
        PorHora funcH=new PorHora();
        PorHoraeComissao funcCH=new PorHoraeComissao();
        funcC.setVendas(100);
        funcC.getPay();
        funcH.setValorHora(10);
        funcH.setNumHora(8);
        funcH.getValorHora();
        funcH.getNumHora();
        funcH.getPay();
        funcCH.setVendas(100);
        funcCH.printPay();
        funcCH.getPay();
    }
}
