/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao5;

/**
 *
 * @author mimi
 */
public class Circulo implements FormaGeometrica
{
   private float raio;
   @Override
   public float calcularArea()
   {
       float area;
       area=(float) (Math.PI*Math.pow(raio, 2));
       return area;
   }
   @Override
   public float calcularPerimetro()
   {
       float circunf;
       circunf=(float) (2*Math.PI*raio);
       return circunf;
   }
}
