/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao7;

/**
 *
 * @author mimi
 */
public class Circulo implements FormaGeometrica,Impressao{
   private double raio;
   @Override
   public double area()
   {
       double area;
       area=(double) (Math.PI*Math.pow(raio, 2));
       return area;
   }
   @Override
   public double comprimento()
   {
       double circunf;
       circunf=(double) (2*Math.PI*raio);
       return circunf;
   }

    @Override
    public void imprimeDados() {
        System.out.println("Área: "+area());
        System.out.println("Circunferência: "+comprimento());
    }
}
