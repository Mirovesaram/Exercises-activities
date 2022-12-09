/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao5;

/**
 *
 * @author mimi
 */
public class Quadrado implements FormaGeometrica
{
    private float lado;
    @Override
    public float calcularArea()
    {
        float area;
        area=(float) Math.pow(lado, 2);
        return area;
    }
    @Override
    public float calcularPerimetro()
    {
        float perimetro;
        perimetro=4*lado;
        return perimetro;
    }
}
