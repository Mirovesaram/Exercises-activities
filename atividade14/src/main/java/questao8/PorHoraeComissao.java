/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao8;

/**
 *
 * @author mimi
 */
public class PorHoraeComissao extends PorHora implements Commission{
    private double sales;
    public PorHoraeComissao()
    {
        super();
    }
    @Override
    public void setVendas(double s)
    {
        sales=s;
    }
    @Override
    public void printPay()
    {
        System.out.println(getPay());
    }
    @Override
    public double getPay()
    {
        return sales*COMMISSION_RATE+getNumHora()*10;
    }
}
