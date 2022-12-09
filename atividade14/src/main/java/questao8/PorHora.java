/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao8;

/**
 *
 * @author mimi
 */
public class PorHora extends Empregado{
    private double valorHora;
    private int numHora;
    public PorHora()
    {
        super("name");
    }
    public void setValorHora(double v)
    {
        valorHora=v;
    }
    public void setNumHora(double v)
    {
        numHora=(int) v;
    }
    public double getValorHora()
    {
        return valorHora;
    }
    public int getNumHora()
    {
        return numHora;
    }
    @Override
    public double getPay()
    {
        return numHora*valorHora;
    }
    
}
