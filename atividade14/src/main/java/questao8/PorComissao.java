/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao8;

/**
 *
 * @author mimi
 */
public class PorComissao extends Empregado implements Commission
{
    private double sales;
    public PorComissao()
    {
        super("name");
    }
    @Override
    public void setVendas(double s)
    {
        sales=s;
    }
    @Override
    public double getPay()
    {
        return sales*COMMISSION_RATE;
    }
}
