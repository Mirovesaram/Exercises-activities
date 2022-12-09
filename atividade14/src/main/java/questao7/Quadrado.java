/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao7;

/**
 *
 * @author mimi
 */
public class Quadrado implements FormaGeometrica{
    private double lado;
    @Override
    public double area()
    {
        double area;
        area=(double) Math.pow(lado, 2);
        return area;
    }
    @Override
    public double comprimento()
    {
        double perimetro;
        perimetro=4*lado;
        return perimetro;
    }
}
